import sbt._

//By extending DefaultWebProject, we get Jetty support
//By adding the AkkaProject trait, we can easily pull in Akka modules
class AkkaWebTemplate(info: ProjectInfo) extends DefaultWebProject(info) with AkkaProject {
  //Adding dependencies in sbt is as simple as declaring a variable
  //For the Akka deps, we even have a method for pulling them in by a simple name
  val akkaHttp = akkaModule("http")
  val akkaKernel = akkaModule("kernel")
  val jettyWebapp = "org.eclipse.jetty" % "jetty-webapp" % "8.0.0.M2" % "test"
  val javaxServlet30 = "org.mortbay.jetty" % "servlet-api" % "3.0.20100224" % "provided"
}
