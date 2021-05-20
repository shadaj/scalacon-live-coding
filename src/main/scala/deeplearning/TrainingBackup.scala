package deeplearning

import me.shadaj.scalapy.py

import scala.meta._

import java.io.File
import java.nio.file.Path

import me.shadaj.scalapy.{torch => th}

import pipelines.PipeStep

object TrainingBackup extends App {
  def getAllScalaFiles(root: File): Iterator[File] = {
    root.listFiles().iterator.flatMap { f =>
      if (f.isFile()) {
        if (f.getAbsolutePath().endsWith(".scala")) {
          Seq(f).iterator
        } else Iterator.empty
      } else {
        getAllScalaFiles(f)
      }
    }
  }

  val parsedSources = getAllScalaFiles(new File("corpus")).flatMap { d =>
    val path = Path.of(d.getPath())
    val bytes = java.nio.file.Files.readAllBytes(path)
    val text = new String(bytes, "UTF-8")
    val input = Input.VirtualFile(path.toString, text)
    val tree = input.parse[Source].get
    tree.collect {
      case node: Defn.Val => Seq(node.toString)
      case node: Defn.Var => Seq(node.toString)
      case node: Defn.Def => Seq(node.toString)
      case node: Defn.Class => Seq(node.toString)
      case node: Term.Block => node.stats.map(_.toString)
    }.flatten
  }.toSeq

  val device = th.as[py.Dynamic].device(if (th.cuda.is_available()) "cuda" else "cpu")

  val transformers = py.module("transformers")
  val gpt2Tokenizer = transformers.GPT2Tokenizer.from_pretrained("gpt2")
  gpt2Tokenizer.pad_token = gpt2Tokenizer.eos_token

  val trainingInputsTokenized = PipeStep.run(PipeStep.grouped(parsedSources.map { s =>
    PipeStep.unit(gpt2Tokenizer.__call__(
      s,
      padding = "max_length", max_length = 32,
      truncation = true,
      return_tensors="pt"
    ), "tokenize")
  }, "input"))

  val gpt2 = transformers.GPT2LMHeadModel.from_pretrained("gpt2")
  gpt2.to(device)
  val optimizer = th.as[py.Dynamic].optim.AdamW(
    gpt2.parameters(),
    lr = 1e-5,
    eps = 1e-8
  )

  val batchSize = 16
  val batches = scala.util.Random.shuffle(trainingInputsTokenized).grouped(batchSize).toSeq

  val epochs = 1

  PipeStep.run(PipeStep.sequence((1 to epochs).map { epoch =>
    PipeStep.grouped(batches.zipWithIndex.map { case (b, i) =>
      PipeStep.unit(py.local {
        val inputIds = th.as[py.Dynamic].stack(b.map(e => e.bracketAccess("input_ids")).toPythonCopy).to(device)
        val attentionMasks = th.as[py.Dynamic].stack(b.map(e => e.bracketAccess("attention_mask")).toPythonCopy).to(device)

        gpt2.zero_grad()

        val outputs = gpt2.__call__(
          inputIds, labels = inputIds,
          attention_mask = attentionMasks,
          token_type_ids = py.None
        ).as[Seq[th.tensor.Tensor]]

        val loss = outputs(0)

        loss.backward()
        optimizer.step()

        ((), f"training (loss: ${loss.item().as[Double]}%.3f)")
      })
    }, "batch")
  }, "epoch"))

  th.as[py.Dynamic].save(gpt2.state_dict(), "gpt_model.pt")
}
