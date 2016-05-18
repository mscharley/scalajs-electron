enablePlugins(ScalaJSPlugin)
// Use Node.
scalaJSUseRhino in Global := false

lazy val scalaJSElectron = (project in file(".")).
  settings(
    organization := "com.mscharley",
    name := "scalajs-electron",
    version := "0.1.0",
    scalaVersion := "2.11.8",

    libraryDependencies ++= Seq(
      "com.mscharley" %%% "scalajs-nodejs" % "0.1.0"
    )
  )
