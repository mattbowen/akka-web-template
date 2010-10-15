/** 
 * Copyright Matt Bowen, distributed under the Apache 2 license
 * http://www.apache.org/licenses/LICENSE-2.0.html
 */

package akkawebtemplate

import se.scalablesolutions.akka.actor.Actor
import javax.ws.rs.{GET, Path, Produces}
import se.scalablesolutions.akka.actor.ActorRegistry.actorsFor


class SampleActor extends Actor {
  def receive = {
    case "Test" => self.reply(<html><head><title>It works!</title></head><body><h1>It works!</h1></body></html>.toString)
    case _ => self.reply(<html><head><title>It still works!</title></head><body><h1>I don't know what you just said, but it still works!</h1></body></html>.toString)
  }
}

@Path("/")
class SampleService {
  @GET
  @Produces(Array("text/html"))
  def test = {
    val testActor = actorsFor(classOf[SampleActor]).headOption.get
    (testActor !! "Test").getOrElse("Couldn't get test data")
  }
}
