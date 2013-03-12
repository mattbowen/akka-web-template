seq(webSettings :_*)

name := "AkkaWebTemplate"

version := "1.0.1"

scalaVersion := "2.9.2"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % "2.0.4",
  "com.typesafe.akka" % "akka-kernel" % "2.0.4",
  "com.typesafe.akka" % "akka-slf4j" % "2.0.4",
  "javax.ws.rs" % "jsr311-api" % "1.1.1",
  "com.sun.jersey" % "jersey-server" % "1.15",
  "com.sun.jersey" % "jersey-core" % "1.15",
  "com.sun.jersey" % "jersey-servlet" % "1.15",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.8.v20121106" % "container" artifacts (Artifact("jetty-webapp", "jar", "jar")),
  "org.slf4j" % "slf4j-api" % "1.7.2",
  "org.slf4j" % "slf4j-simple" % "1.7.2",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)
