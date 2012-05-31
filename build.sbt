seq(webSettings :_*)

name := "AkkaWebTemplate"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % "2.0.1",
  "com.typesafe.akka" % "akka-kernel" % "2.0.1",
  "com.typesafe.akka" % "akka-slf4j" % "2.0.1",
  "javax.ws.rs" % "jsr311-api" % "1.1",
  "com.sun.jersey" % "jersey-server" % "1.9",
  "com.sun.jersey" % "jersey-core" % "1.9",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.1.v20110908" % "container",
  "org.slf4j" % "slf4j-api" % "1.6.0",
  "org.slf4j" % "slf4j-simple" % "1.6.0",
  "javax.servlet" % "servlet-api" % "2.5" % "provided"
)
