enablePlugins(ScalaJSPlugin)
// Use Node.
scalaJSUseRhino in Global := false

lazy val scalaJSElectron = (project in file(".")).
  settings(
    organization := "com.mscharley",
    name := "scalajs-electron",
    version := "0.1.0",
    scalaVersion := "2.11.8",

    resolvers += Resolver.sonatypeRepo("public"),
    libraryDependencies ++= Seq(
      "com.mscharley" %%% "scalajs-nodejs" % "0.1.0"
    ),

    // Info for Sonatype.
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ => false },
    licenses := Seq("MIT" -> url("https://github.com/mscharley/scalajs-nodejs/blob/master/LICENSE.md")),
    homepage := Some(url("https://github.com/mscharley/scalajs-nodejs")),
    pomExtra := (
  <scm>
    <url>git@github.com:mscharley/scalajs-nodejs.git</url>
    <connection>scm:git:git@github.com:mscharley/scalajs-nodejs.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mscharley</id>
      <name>Matthew Scharley</name>
      <url>http://matt.scharley.me/</url>
    </developer>
  </developers>)
  )
