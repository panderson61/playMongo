import sbt.Keys._

scalaVersion := "2.12.8"

maintainer := "Brian Wang <bwang@avetta.com>"

daemonUserUid in Docker := None

daemonUser in Docker := "daemon"

dockerExposedPorts in Docker := Seq(9000, 9443)

dockerRepository := Some("pics")

dockerBaseImage := "openjdk:8-jre-alpine"

dockerUpdateLatest := true

libraryDependencies ++= Seq(
  guice
)

lazy val root = (project in file("."))
  .enablePlugins(AshScriptPlugin, DockerPlugin, PlayScala)
  .settings(name := """playmongo""")
