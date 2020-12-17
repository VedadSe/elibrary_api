package DataBaseActivities

import java.time.LocalDateTime
import java.util.Date

import slick.jdbc.GetResult

import scala.util.Try
import scala.language.postfixOps

case class BorrowedBook(isbn: String, personal_number: String, delivery_service: String, fast_delivery: Boolean,
                        date_of_shipment: LocalDateTime, start_date: Date, end_date: Date, postage: Double,
                        book_damaged: Option[Boolean], book_read: Option[Boolean], delay_in_days: Option[Int],
                        compensation: Option[Double], book_returned: Option[Boolean], active_row: Boolean,
                        user_name: String, date_of_entry: LocalDateTime, update_date: LocalDateTime)

object BorrowedBook {

  implicit val borrowedBookResult = GetResult[BorrowedBook]({ r =>
    val rs = r.rs

    BorrowedBook(
      rs.getString("isbn"),
      rs.getString("personal_number"),
      rs.getString("delivery_service"),
      rs.getBoolean("fast_delivery"),
      rs.getTimestamp("date_of_shipment").toLocalDateTime,
      rs.getDate("start_date"),
      rs.getDate("end_date"),
      rs.getDouble("postage"),
      Try(rs.getBoolean("book_damaged")).toOption,
      Try(rs.getBoolean("book_read")).toOption,
      Try(rs.getInt("delay_in_days")).toOption,
      Try(rs.getDouble("compensation")).toOption,
      Try(rs.getBoolean("book_returned")).toOption,
      rs.getBoolean("active_row"),
      rs.getString("user_name"),
      rs.getTimestamp("date_of_entry").toLocalDateTime,
      rs.getTimestamp("update_date").toLocalDateTime
    )
  })

}