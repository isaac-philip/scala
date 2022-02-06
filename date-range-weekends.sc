/**
 *  To Get the weekend between certain date-frame
 *  Program language - scala
 */

import java.util.{Calendar, GregorianCalendar}
import java.time.{DayOfWeek, LocalDate, Month}

val start_year = 2021
val end_year = 2021

val cal:Calendar = new GregorianCalendar(start_year, Calendar.JANUARY, 1);

val start_date = LocalDate.of(start_year, Month.JANUARY, 1)
val end_date = LocalDate.of(end_year, Month.DECEMBER, 31).plusDays(1)

// Total Days within the range
// val total_days = start_date.datesUntil(end_date).count()

val weekend_support = start_date.datesUntil(end_date)
          .filter(cur_date => List(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY).contains(cur_date.getDayOfWeek))

// Getting first 100 weekend days
// weekend_support.limit(100).forEach(println(_))

// Getting all weekend days
weekend_support.forEach(println(_))
