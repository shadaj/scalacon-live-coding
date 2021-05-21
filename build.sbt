name := "scalacon-live-coding"

scalaVersion := "2.13.5"

libraryDependencies += "me.shadaj" %% "scalapy-core" % "0.5.0"
libraryDependencies += "org.scalameta" %% "scalameta" % "4.4.17"
libraryDependencies += "com.lihaoyi" %% "fansi" % "0.2.14"

fork := true
outputStrategy := Some(StdoutOutput)
connectInput := true

import scala.sys.process._
lazy val pythonLdFlags = {
  val withoutEmbed = "python3-config --ldflags".!!
  if (withoutEmbed.contains("-lpython")) {
    withoutEmbed.split(' ').map(_.trim).filter(_.nonEmpty).toSeq
  } else {
    val withEmbed = "python3-config --ldflags --embed".!!
    withEmbed.split(' ').map(_.trim).filter(_.nonEmpty).toSeq
  }
}

lazy val pythonLibsDir = {
  pythonLdFlags.find(_.startsWith("-L")).get.drop("-L".length)
}

javaOptions += s"-Djna.library.path=$pythonLibsDir"
