package DataBaseActivities

import DataBaseActivities.BooksActor.{AddBook, EditBook, InvalidateBook, ListBooks, SearchBooks}
import akka.actor.Actor


object BooksActor {
  case class AddBook()
  case class EditBook()
  case class InvalidateBook()
  case class SearchBooks()
  case class ListBooks()
}

class BooksActor extends Actor{
  override def receive: Receive = {
    case AddBook() => ???
    case EditBook() => ???
    case InvalidateBook => ???
    case SearchBooks => ???
    case ListBooks() => ???
  }
}