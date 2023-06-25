name := "scala-test-playground"

version := "0.1"

val scala3Version = "3.3.0"

lazy val scalatest = project
  .in(file("scalatest"))
  .settings(
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.16",
      "org.scalatest" %% "scalatest" % "3.2.16" % Test
    )
  )

lazy val munit = project
  .in(file("munit"))
  .settings(
    scalaVersion                           := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
