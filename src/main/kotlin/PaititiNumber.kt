enum class PaititiNumber(val symbol: Char) {
    Zero('•'),
    One('Ը'),
    Two('ɻ'),
    Three('४'),
    Fourth('ቿ'),
    Five('ɤ'),
    Six('ɷ'),
    Seven('♀');

    fun value() = this.ordinal

    companion object {

        private fun fromSymbol(symbol: Char): PaititiNumber =
            entries.find { it.symbol == symbol } ?: throw IllegalArgumentException("Incorrect symbol: $symbol")

        fun fromPaititiNumberToOctalString(symbols: String): String = symbols
            .map { fromSymbol(it) }
            .map { it.value() }
            .map { it.digitToChar() }
            .joinToString("")
    }
}