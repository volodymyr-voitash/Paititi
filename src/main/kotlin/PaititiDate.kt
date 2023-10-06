import java.time.LocalDate
import java.util.*

private const val plusSymbol = '⏝'

// d w m y (v)
class PaititiDate(
    private val day: Int,
    private val week: Int,
    private val month: Int,
    private val year: Int
) {

    constructor(day: String, week: Int, month: Int, year: Int): this(
        if (!day.contains(plusSymbol)) day.toInt() else day.split(plusSymbol).sumOf { it.toInt() }, week, month, year
    )

    constructor(day: String, week: String, month: String, year: String): this(
        day.run {
            if (this.contains(plusSymbol)) {
                this.split(plusSymbol).sumOf { PaititiNumber.fromPaititiNumberToOctalString(it).octalToDecimal() }
            } else {
                PaititiNumber.fromPaititiNumberToOctalString(this).octalToDecimal()
            }
        },
        PaititiNumber.fromPaititiNumberToOctalString(week).octalToDecimal(),
        PaititiNumber.fromPaititiNumberToOctalString(month).octalToDecimal(),
        PaititiNumber.fromPaititiNumberToOctalString(year).octalToDecimal()
    )

    fun toOctalString(): String {
        val dayList = mutableListOf<String>()
        if (day > 13) {
            dayList.add(8.decimalToOctal())
            dayList.add(5.decimalToOctal())
            dayList.add((day - 13).decimalToOctal())
        } else if (day > 8) {
            dayList.add(8.decimalToOctal())
            dayList.add((day - 8).decimalToOctal())
        } else {
            dayList.add(day.decimalToOctal())
        }
        return "${dayList.joinToString(plusSymbol.toString())} ${week.decimalToOctal()} ${month.decimalToOctal()} ${year.decimalToOctal()}"
    }

    fun toPaititiString(): String {
        return toOctalString().map { char ->
            when (char) {
                in '0'..'7' -> PaititiNumber.entries.find { it.ordinal == char.digitToInt() }?.symbol
                else -> char
            }
        }.joinToString("")
    }

    private fun sumOfDays(day: Int, week: Int, month: Int, isLeapYear: Boolean): Int {
        return (month - 1) * 45 + (week - 1) * 8 + day + firstPaititiDay(isLeapYear)
    }

    fun toGregorianDate(): LocalDate {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.DAY_OF_MONTH, 1)
        calendar.set(Calendar.MONTH, Calendar.JANUARY)
        calendar.set(Calendar.YEAR, year.fromPaititiYear())
        val sum = sumOfDays(day, week, month, isLeapYear(calendar.get(Calendar.YEAR))) - 1
        calendar.add(Calendar.DAY_OF_YEAR, sum)
        return LocalDate.ofYearDay(calendar.get(Calendar.YEAR), calendar.get(Calendar.DAY_OF_YEAR))
    }

    companion object {
        fun fromDayOfYear(dayOfYear: Int, year: Int): PaititiDate {
            val dayDiff = firstPaititiDay(isLeapYear(year))
            val paititiDayOfYear = dayInPaititiYear(dayOfYear, year, dayDiff)
            val uncountedInYearDays = if (paititiDayOfYear > 360) paititiDayOfYear - 360 else 0
            val month = (if (paititiDayOfYear <= 360) paititiDayOfYear/45 else 7) + if (paititiDayOfYear % 45 == 0) 0 else 1
            val daysInMonth = paititiDayOfYear - ((month - 1) * 45)
            val week = if (daysInMonth <= 40) daysInMonth/8 + if (daysInMonth % 8 == 0) 0 else 1 else 5
            val uncountedInMonthDays = if (daysInMonth > 40) daysInMonth - 40 else 0
            val day = daysInMonth - (week - 1) * 8 - uncountedInMonthDays - uncountedInYearDays
            return PaititiDate(
                "$day+$uncountedInMonthDays+$uncountedInYearDays", week, month,
                year.toPaititiYear(dayOfYear <= dayDiff)
            )
        }
    }
}