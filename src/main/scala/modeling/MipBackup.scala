package modeling

import me.shadaj.scalapy.py.SeqConverters

import me.shadaj.scalapy.mip
import mip.constants._

object MipBackup extends App {
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
  val model = mip.model.Model(sense = MAXIMIZE)
  val itemVariables = items.map { i =>
    (i, model.add_var(var_type = BINARY))
  }

  model.add_constr(mip.model.xsum(
    itemVariables.map(t => t._2 * t._1.weight).toPythonProxy
  ) <= maxWeight)
  model.objective = mip.model.xsum(
    itemVariables.map(t => t._2 * t._1.profit).toPythonProxy
  )
  model.optimize()

  itemVariables.foreach { case (item, v) =>
    if (v.xi(0).as[Double].round == 1) {
      println(item)
    }
  }
}

