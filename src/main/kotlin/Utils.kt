const val firstPaititiDay = 79
const val paititiYearDiff = -1641

fun isLeapYear(year: Int): Boolean = when {
    year % 4 == 0 -> {
        when {
            year % 100 == 0 -> year % 400 == 0
            else -> true
        }
    }
    else -> false
}

fun daysInYear(year: Int): Int = if (isLeapYear(year)) 366 else 365

fun Int.fromPaititiYear() = this + paititiYearDiff

fun Int.toPaititiYear(beforePaititiFirstDay: Boolean) = this - paititiYearDiff + if (beforePaititiFirstDay) - 1 else 0

fun String.octalToDecimal() = this.toInt(8)

fun Int.decimalToOctal(): String = Integer.toOctalString(this)

fun firstPaititiDay(isLeapYear: Boolean): Int = if (isLeapYear) firstPaititiDay + 1 else firstPaititiDay

fun dayInPaititiYear(dayInYear: Int, year: Int, dayDiff: Int): Int =
    if (dayInYear > dayDiff) dayInYear - dayDiff else daysInYear(year) - dayDiff + dayInYear

