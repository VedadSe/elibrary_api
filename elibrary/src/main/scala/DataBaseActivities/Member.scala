package DataBaseActivities

import java.time.LocalDateTime
import slick.jdbc.GetResult
import scala.util.Try
import scala.language.postfixOps

case class Member(personal_number: String, first_name: String, last_name: String, address: String, postal_code: String,
                  country: String, phone_number: Option[String], e_mail: Option[String], gender: String, adult: Boolean,
                  membership_fee: Double, active_row: Boolean, user_name: String, date_of_entry: LocalDateTime,
                  update_date: LocalDateTime)

object Member {

  implicit val memberResult = GetResult[Member]({ r =>
    val rs = r.rs

    Member(
      rs.getString("personal_number"),
      rs.getString("first_name"),
      rs.getString("last_name"),
      rs.getString("address"),
      rs.getString("postal_code"),
      rs.getString("country"),
      Try(rs.getString("phone_number"))toOption,
      Try(rs.getString("e_mail"))toOption,
      rs.getString("gender"),
      rs.getBoolean("adult"),
      rs.getDouble("membership_fee"),
      rs.getBoolean("active_row"),
      rs.getString("user_name"),
      rs.getTimestamp("date_of_entry").toLocalDateTime,
      rs.getTimestamp("update_date").toLocalDateTime
    )
  })

}
