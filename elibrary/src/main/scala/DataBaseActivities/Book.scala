package DataBaseActivities

import java.time.LocalDateTime
import slick.jdbc.GetResult
import scala.language.postfixOps

case class Book(isbn: String, title: String, author_first_name: String, author_last_name: String, edition: Int,
                weight_in_kilos: Double, active_row: Boolean, user_name: String, date_of_entry: LocalDateTime,
                update_date: LocalDateTime)

object Book {

  implicit val bookResult = GetResult[Book]({ r =>
    val rs = r.rs

    Book(
      rs.getString("isbn"),
      rs.getString("title"),
      rs.getString("author_first_name"),
      rs.getString("edition"),
      rs.getInt("edition"),
      rs.getDouble("weight_in_kilos"),
      rs.getBoolean("active_row"),
      rs.getString("user_name"),
      rs.getTimestamp("date_of_entry").toLocalDateTime,
      rs.getTimestamp("update_date").toLocalDateTime
    )
  })

}
