import sbt._

//By extending DefaultWebProject, we get Jetty support
//By adding the AkkaProject trait, we can easily pull in Akka modules
class AkkaWebTemplate(info: ProjectInfo) extends DefaultWebProject(info) with AkkaProject {
  //Adding dependencies in sbt is as simple as declaring a variable
  //For the Akka deps, we even have a method for pulling them in by a simple name
  val akkaHttp = akkaModule("http")
  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.14" % "test"
}
