package pipelines

import fansi._

object ProgressBar {
  val spinnerChars = Seq('|', '/', '-', '\\')

  private var percent = 0D
  private var startTime = 0L
  private var currentTask: Option[Seq[String]] = None
  private var currentDetails: Option[String] = None

  def reset(): Unit = {
    startTime = System.currentTimeMillis()
    currentTask = None
    currentDetails = None
    setProgress(0)
    print("\u001b[2K")
  }

  def setTask(task: Seq[String]): Unit = {
    currentTask = Some(task)
    print("\u001b[2K")
    update()
  }

  def setTaskDetails(details: String): Unit = {
    currentDetails = Some(details)
    print("\u001b[2K")
    update()
  }

  def setProgress(p: Double): Unit = {
    percent = p
    update()
  }

  def update(): Unit = {
    val progressString = (1 to (percent / 4).toInt).map(_ => "=").mkString
    val extraSpace = (1 to (25 - (percent / 4).toInt)).map(_ => " ").mkString
    val eta = ((System.currentTimeMillis() - startTime)/percent) * (100 - percent)

    val detailsString = Color.LightBlue(currentDetails.map(d => s"($d)").getOrElse("").toString)
    val taskString = currentTask.map(_.map(t => Bold.On(Color.LightGreen(t))).mkString(" > ") + detailsString + ": ").getOrElse("")

    val timeString = if (eta < 60 * 1000) {
      s" ${(eta/(1000D)).toString.take(4)} s left"
    } else {
      val minutesFloat = eta / (60 * 1000D)
      val minutes = minutesFloat.toInt
      val seconds = math.round((minutesFloat - minutes) * 60)
      s" $minutes min $seconds s left"
    }

    print(
      f"\r$taskString%s$percent%.2f" +
      s"% $progressString>$extraSpace ${spinnerChars(((percent * 10) % spinnerChars.length).toInt)}" +
      timeString)
  }
}
