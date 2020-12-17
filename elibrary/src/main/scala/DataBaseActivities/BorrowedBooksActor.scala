package DataBaseActivities

import DataBaseActivities.BorrowedBooksActor.{AddBorrowedBook, EditBorrowedBook, InvalidateBorrowedBook, ListBorrowedBooks, SearchBorrowedBooks}
import akka.actor.Actor


object BorrowedBooksActor {
  case class AddBorrowedBook()
  case class EditBorrowedBook()
  case class InvalidateBorrowedBook()
  case class SearchBorrowedBooks()
  case class ListBorrowedBooks()
}

class BorrowedBooksActor extends Actor{
  override def receive: Receive = {
    case AddBorrowedBook() => ???
    case EditBorrowedBook() => ???
    case InvalidateBorrowedBook() => ???
    case SearchBorrowedBooks() => ???
    case ListBorrowedBooks() => ???
  }
}