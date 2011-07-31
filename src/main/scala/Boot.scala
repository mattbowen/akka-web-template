/** 
 * Copyright Matt Bowen, distributed under the Apache 2 license
 * http://www.apache.org/licenses/LICENSE-2.0.html
 */

package akkawebtemplate

import akka.actor.SupervisorFactory
import akka.config.Supervision._
import akka.actor.Actor._

class Boot {
  val factory = SupervisorFactory(
    SupervisorConfig(
      OneForOneStrategy(List(classOf[Exception]), 3, 100),
      Supervise(
	actorOf[SampleActor], 
	Permanent) 
      :: Nil))
    factory.newInstance.start
}
