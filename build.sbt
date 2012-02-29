seq(webSettings :_*)

name := "AkkaWebTemplate"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "Typsafe Repository" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
  "se.scalablesolutions.akka" % "akka-actor" % "1.3.1",
  "se.scalablesolutions.akka" % "akka-kernel" % "1.3.1",
  "se.scalablesolutions.akka" % "akka-http" % "1.3.1",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.1.v20110908" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided"
)
