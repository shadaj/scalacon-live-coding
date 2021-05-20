package pipelines

trait PipeStep[T] {
  def execute(progress: Double => Unit, updateTask: Seq[String] => Unit, updateTaskDetails: String => Unit, completeTask: () => Unit): T

  def map[U](f: T => U): PipeStep[U] = PipeStep { (progress, updateTask, updateTaskDetails, completeTask) =>
    val me = execute(progress, updateTask, updateTaskDetails, completeTask)
    f(me)
  }

  def flatMap[U](f: T => PipeStep[U]): PipeStep[U] = PipeStep { (progress, updateTask, updateTaskDetails, completeTask) =>
    val me = execute(progress, updateTask, updateTaskDetails, completeTask)
    completeTask()
    val other = f(me).execute(progress, updateTask, updateTaskDetails, completeTask)
    other
  }

  def split[C](implicit ev: T =:= Seq[C]): PipeStep[Seq[PipeStep[C]]] = PipeStep { (progress, updateTask, updateTaskDetails, completeTask) =>
    val seq = execute(progress, updateTask, updateTaskDetails, completeTask)
    seq.map(PipeStep.value)
  }

  def withParentTask(parentName: String) = PipeStep { (progress, updateTask, updateTaskDetails, completeTask) =>
    execute(progress, t => updateTask(parentName +: t), updateTaskDetails, completeTask)
  }
}

object PipeStep {
  def unit[T](f: => T, task: String): PipeStep[T] = {
    (progress: Double => Unit, updateTask: Seq[String] => Unit, _: String => Unit, _: () => Unit) => {
      progress(0)
      updateTask(Seq(task))
      val res = f
      progress(100)
      res
    }
  }

  def unit[T](f: => (T, String)): PipeStep[T] = {
    (progress: Double => Unit, updateTask: Seq[String] => Unit, _: String => Unit, _: () => Unit) => {
      progress(0)
      val (res, task) = f
      progress(100)
      updateTask(Seq(task))
      res
    }
  }

  def value[T](v: T): PipeStep[T] = {
    (_: Double => Unit, _: Seq[String] => Unit, _: String => Unit, _: () => Unit) => {
      v
    }
  }

  def apply[T](f: (Double => Unit, Seq[String] => Unit, String => Unit) => T): PipeStep[T] = {
    (progress: Double => Unit, updateTask: Seq[String] => Unit, updateTaskDetails: String => Unit, _: () => Unit) => {
      progress(0)
      val res = f(progress, updateTask, updateTaskDetails)
      progress(100)
      res
    }
  }

  def apply[T](f: (Double => Unit, Seq[String] => Unit, String => Unit, () => Unit) => T): PipeStep[T] = {
    (progress: Double => Unit, updateTask: Seq[String] => Unit, updateTaskDetails: String => Unit, completeTask: () => Unit) => {
      progress(0)
      val res = f(progress, updateTask, updateTaskDetails, completeTask)
      progress(100)
      res
    }
  }

  def run[T](step: PipeStep[T]): T = {
    ProgressBar.reset()
    step.execute(
      ProgressBar.setProgress,
      ProgressBar.setTask,
      ProgressBar.setTaskDetails,
      () => {
        println()
        ProgressBar.reset()
      }
    )
  }

  /**
    * Combines repeated steps into a single step with a display of sub-steps completed
    * @param steps the repeated steps to combine
    * @return a step that runs each of the smaller steps
    */
  def sequence[T](steps: Seq[PipeStep[T]]): PipeStep[Seq[T]] = PipeStep { (progress, updateTask, updateTaskDetails, _) =>
    steps.zipWithIndex.map { case (s, index) =>
      s.execute(
        progress,
        u => updateTask(s"${index + 1}/${steps.size}" +: u),
        updateTaskDetails,
        ProgressBar.reset
      )
    }
  }

  def sequence[T](steps: Seq[PipeStep[T]], label: String): PipeStep[Seq[T]] = PipeStep { (progress, updateTask, updateTaskDetails, _) =>
    steps.zipWithIndex.map { case (s, index) =>
      s.execute(
        progress,
        u => updateTask(s"$label ${index + 1}/${steps.size}" +: u),
        updateTaskDetails,
        ProgressBar.reset
      )
    }
  }

  def grouped[T](steps: Seq[PipeStep[T]]): PipeStep[Seq[T]] = PipeStep { (progress, updateTask, updateTaskDetails, _) =>
    steps.zipWithIndex.map { case (s, index) =>
      s.execute(
        p => progress((index * (100D / steps.size)) + p/steps.size),
        u => updateTask(s"${index + 1}/${steps.size}" +: u),
        updateTaskDetails,
        () => {}
      )
    }
  }

  def grouped[T](steps: Seq[PipeStep[T]], label: String): PipeStep[Seq[T]] = PipeStep { (progress, updateTask, updateTaskDetails, _) =>
    steps.zipWithIndex.map { case (s, index) =>
      s.execute(
        p => progress((index * (100D / steps.size)) + p/steps.size),
        u => updateTask(s"$label ${index + 1}/${steps.size}" +: u),
        updateTaskDetails,
        () => {}
      )
    }
  }

  def groupedWeighted[T](steps: Seq[(PipeStep[T], Double)], label: String): PipeStep[Seq[T]] = PipeStep { (progress, updateTask, updateTaskDetails, _) =>
    val totalWeightsSum = steps.map(_._2).sum
    steps.zipWithIndex.map { case ((s, weight), index) =>
      s.execute(
        p => progress(100D * ((0 until index).map(steps(_)._2).sum + (p / 100D) * weight) / totalWeightsSum),
        u => updateTask(s"$label ${index + 1}/${steps.size}" +: u),
        updateTaskDetails,
        () => {}
      )
    }
  }
}
