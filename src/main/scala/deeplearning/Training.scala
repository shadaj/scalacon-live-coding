package deeplearning

import me.shadaj.scalapy.py

import scala.meta._

import java.io.File
import java.nio.file.Path

import me.shadaj.scalapy.{torch => th}

import pipelines.PipeStep

object Training extends App {
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

  val parsedSources: Seq[String] = getAllScalaFiles(new File("corpus")).flatMap { d =>
    val path = Path.of(d.getPath())
    val bytes = java.nio.file.Files.readAllBytes(path)
    val text = new String(bytes, "UTF-8")
    val input = Input.VirtualFile(path.toString, text)
    val tree = input.parse[Source].get
    
    // TODO: get training data with tree.collect (defns and Term.Block)
    ???
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
  val epochs = 1

  // TODO: implement training loop
  // for reference, each tokenized value has input_ids and attention_mask
  // gpt2 takes input_ids, keyword labels, attention_mask, token_type_ids = None

  th.as[py.Dynamic].save(gpt2.state_dict(), "gpt_model.pt")
  println("model saved!")

  Runtime.getRuntime().halt(0)
}
