package DataBaseActivities

import DataBaseActivities.MembersActor.{AddMember, EditMember, InvalidateMember, ListMembers, SearchMembers}
import akka.actor.Actor


object MembersActor {
  case class AddMember()
  case class EditMember()
  case class InvalidateMember()
  case class SearchMembers()
  case class ListMembers()
}

class MembersActor extends Actor{
  override def receive: Receive = {
    case AddMember() => ???
    case EditMember() => ???
    case InvalidateMember() => ???
    case SearchMembers() => ???
    case ListMembers() => ???
  }
}