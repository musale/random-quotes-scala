scalaVersion in ThisBuild := "2.12.4"
crossScalaVersions := Seq("2.11.12", "2.12.4")
name := "random-quote"
version := "1.0.0-SNAPSHOT"

libraryDependencies += guice
libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.1"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

lazy val root = (project in file(".")).enablePlugins(PlayScala)
