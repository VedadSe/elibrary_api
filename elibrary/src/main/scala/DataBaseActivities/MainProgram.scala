package DataBaseActivities

import akka.actor.ActorSystem
import akka.util.Timeout

object MainProgram {

  def main(args: Array[String]): Unit = {
    val as = ActorSystem("db-activator")
    implicit val timeout = new Timeout(3.seconds)


  }

}
