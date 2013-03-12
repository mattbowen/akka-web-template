/** 
 * Copyright Claudius Spellmann, distributed under the Apache 2 license
 * http://www.apache.org/licenses/LICENSE-2.0.html
 */

package akkawebtemplate

import akka.actor.ActorRef
import akka.dispatch.Await
import akka.pattern.ask
import akka.util.duration.intToDurationInt
import akka.util.Timeout

/** 
 * Provides an easy way to make a synchronous actor call. 
 * Inspired by play2mini's ActorAction 
 */
object ActorCall { 
 def apply[A](actorRef: ActorRef, msg: AnyRef)(implicit timeout: Timeout = 5 seconds): Option[A] = 
   try {
     new Some(Await.result(actorRef ? msg, timeout.duration).asInstanceOf[A])
   } catch {
     case _ => None    
   }
}
