package deeplearning

import me.shadaj.scalapy.py

import me.shadaj.scalapy.{torch => th}

import scala.io.StdIn

object Inference extends App {
  val transformers = py.module("transformers")

  val gpt2Tokenizer = transformers.GPT2Tokenizer.from_pretrained("gpt2")
  gpt2Tokenizer.pad_token = gpt2Tokenizer.eos_token

  val gpt2 = transformers.GPT2LMHeadModel.from_pretrained(
    "gpt2",
    state_dict = th.as[py.Dynamic].load("gpt_model.pt")
  )

  val device = th.as[py.Dynamic].device(if (th.cuda.is_available()) "cuda" else "cpu")
  gpt2.to(device)

  while (true) {
    val request = StdIn.readLine("Code complete: ")
    val tokenized = gpt2Tokenizer.__call__(request, return_tensors="pt")
    val out = gpt2.generate(
      tokenized.bracketAccess("input_ids").to(device),
      max_length=64,
      num_return_sequences=10,
      top_p=0.9,
      do_sample=true,
      top_k=125,
      early_stopping=true
    ).as[th.tensor.Tensor]

    out.tolist().as[Seq[py.Dynamic]].foreach { x =>
      println("----------------")
      println(gpt2Tokenizer.decode(x, skip_special_tokens=true).as[String])
      println("----------------")
    }
  }
}
