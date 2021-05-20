package modeling

import me.shadaj.scalapy.py.SeqConverters

import me.shadaj.scalapy.mip
import mip.constants._

case class KnapsackItem(weight: Double, profit: Double)

object Mip extends App {
  val items = Seq(
    KnapsackItem(11, 10),
    KnapsackItem(15, 13),
    KnapsackItem(20, 18),
    KnapsackItem(35, 31),
    KnapsackItem(10, 7),
    KnapsackItem(33, 15)
  )

  val maxWeight = 47

  // TODO: model the knapsack problem
}
