/** 
 * Copyright Matt Bowen, distributed under the Apache 2 license
 * http://www.apache.org/licenses/LICENSE-2.0.html
 */

package akkawebtemplate

import akka.actor.{Actor, ActorSystem}
import akka.actor.Props

import javax.ws.rs.{GET, Path, Produces}

class SampleActor extends Actor {  
  def receive = {
    case "Test" => sender ! (<html><head><title>It works!</title></head><body><h1>It works!</h1></body></html>.toString)
    case _ => sender ! (<html><head><title>It still works!</title></head><body><h1>I don't know what you just said, but it still works!</h1></body></html>.toString)
  }
}

object ActorRegistry {
  private val system = ActorSystem("MySystem")
  private val sampleActor = system.actorOf(Props[SampleActor], "sample")
  
  def getSampleActor = sampleActor
}

@Path("/")
class SampleService {
      
  @GET
  @Produces(Array("text/html"))
  def test = ActorCall[String](ActorRegistry.getSampleActor, "Test").getOrElse("Error")
}
