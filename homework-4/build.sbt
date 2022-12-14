name := "homework-4"
version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
libraryDependencies += "org.scalanlp" %% "breeze" % "1.2"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4"

val sparkVersion = "3.1.1"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % sparkVersion withSources (),
  "org.apache.spark" %% "spark-mllib" % sparkVersion withSources (),
  "com.github.mrpowers" %% "spark-fast-tests" % "1.0.0" % "test"
)

libraryDependencies += ("org.scalatest" %% "scalatest" % "3.2.2" % "test" withSources ())