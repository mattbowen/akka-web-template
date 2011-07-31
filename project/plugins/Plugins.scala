import sbt._
 
class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val akkaRepo = "Akka Repo" at "http://akka.io/repository"
  val akkaPlugin = "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.1.2"

  override def ivyXML =
        <dependencies>
          <dependency org="se.scalablesolutions.akka" name="akka-http" rev="1.1.2">
            <exclude module="jetty"/>
          </dependency>
        </dependencies>

}
