import java.time.format.DateTimeFormatter

data class PaititiRecord(
    val day: String,
    val week: String,
    val month: String,
    val year: String,
    val numberOfVictims: String? = null,
    val reason: String? = null
) {

    fun provideInfo(): String {
        val builder = StringBuilder()
        builder.append("Reason: ${reason ?: "?"}\n")
        val date = PaititiDate(day, week, month, year)
        builder.append(date.toPaititiString())
        numberOfVictims?.let {
            builder.append(" ")
            builder.append(it)
        }
        builder.append("\n")
        builder.append(date.toOctalString())
        numberOfVictims?.let {
            builder.append(" ")
            builder.append(PaititiNumber.fromPaititiNumberToOctalString(it))
        }
        builder.append("\n")
        builder.append(date.toGregorianDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))
        numberOfVictims?.let {
            builder.append(" ")
            builder.append(PaititiNumber.fromPaititiNumberToOctalString(it).octalToDecimal())
        }
        builder.append("\n")
        return builder.toString()
    }
}