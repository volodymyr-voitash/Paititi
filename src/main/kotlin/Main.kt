//0 1 2 3 4 5 6 7 +
//• Ը ɻ ४ ቿ ɤ ɷ ♀ ⏝
val listOfDates = listOf(
    PaititiRecord("ԸԸ", "ɤ", "Ը•", "ɷ♀४ɻ", "ɻԸԸ४","Courrières mine disaster"),
    PaititiRecord("ɻ", "ቿ", "Ը", "ɷ♀ቿԸ", "ɻ♀ɤɻ","Sinking of the Titanic"),
    PaititiRecord("ቿ", "ቿ", "ɤ", "ɷ♀ቿɻ", "ɷɷ♀","Senghenydd colliery disaster"),
    PaititiRecord("Ը", "Ը", "♀", "ɷ♀ቿɤ", "Ըɻɤ♀", "?Battle of Verdun"),
    PaititiRecord("ቿ","ɤ","ɷ","ɷ♀ቿɷ", "४ɷ४ɷ","Halifax Explosion"),
    PaititiRecord("ɻ", "४", "ɷ", "ɷ♀ቿ♀", "Ը♀ɤ♀", "Ammunition transporter explosion in Hamont"),
    PaititiRecord("Ը", "Ը", "♀", "ɷ♀ɤԸ", reason = "1920 Haiyuan earthquake"),
    PaititiRecord("ɷ", "ቿ", "ቿ", "ɷ♀♀ቿ", reason = "World War II"),
    PaititiRecord("ɤ", "ɤ", "Ը", "ɷ♀♀♀", "४•Ըɤ", "Benxihu Colliery explosion"),
    PaititiRecord("ቿ", "Ը", "ቿ", "♀••ɻ", reason = "Atomic bombings of Hiroshima"),
    PaititiRecord("♀", "Ը", "ቿ", "♀••ɻ", reason = "Atomic bombings of Nagasaki"),
    PaititiRecord("ɤ", "Ը", "ɻ", "♀•ɻԸ", "Ըɻɤɻ", reason = "Laobaidong colliery coal dust explosion\t"),
    PaititiRecord("ቿ", "ɤ", "Ը", "♀•ɻቿ", "Ը•ቿɻ♀", reason = "MV Doña Paz"),
    PaititiRecord("Ը", "ɻ", "ɷ", "♀•ɻቿ", "♀Ըɻ", reason = "Mitsui Miike Coal Mine disaster"),
    PaititiRecord("ɤ", "ɻ", "ɷ", "♀•४४", reason = "1970 Bhola cyclone"),
    PaititiRecord("Ը", "ɤ", "Ը•", "♀•४ɷ", "ɤ४ɻ", "Turkish Airlines Flight 981"),
    PaititiRecord("♀", "Ը", "Ը", "♀•ቿɻ", "ԸԸ•♀", "Tenerife airport disaster"),
    PaititiRecord("ɤ", "४", "ɻ", "♀•ቿቿ", "ቿɻԸ", "American Airlines Flight 191"),
    PaititiRecord("Ը", "४", "ቿ", "♀•ቿɤ", "ቿɤɤ", "Saudia Flight 163"),
    PaititiRecord("ɷ", "ቿ", "ቿ", "♀•ɤ•", "ቿԸɤ", "Korean Air Lines Flight 007"),
    PaititiRecord("Ը•", "ቿ", "ɷ", "♀•ɤԸ", reason = "Bhopal disaster"),
    PaititiRecord("ɤ", "Ը", "४", "♀•ɤɻ", "ɤԸԸ", "Air India Flight 182"),
    PaititiRecord("ɻ", "ቿ", "ɤ", "♀•ɤɻ", "♀♀ɷ", "?1992 Cairo earthquake"),
    PaititiRecord("ɤ", "ɤ", "Ը", "♀•ɤ४", reason = "Chernobyl disaster"),
    PaititiRecord("♀", "ɻ", "४", "♀•ɤɤ", "ቿቿɻ","Iran Air Flight 655"),
    PaititiRecord("♀", "ቿ", "ɻ", "♀•ɤɷ", "Ը•♀♀", "Ufa train disaster"),
    PaititiRecord("४", "ɻ", "४", "♀•ɷቿ", "♀ɷɷ","Sampoong Department Store collapse"),
    PaititiRecord("ቿ", "ɻ", "ɷ", "♀•ɷɤ", "ቿ♀•", "Saudia Flight 763"),
    PaititiRecord("Ը•", "ɤ", "ቿ", "♀•♀ɻ", "ɤɷቿԸ", "September 11 attacks"),
    PaititiRecord("४", "ɻ", "♀", "♀•♀ɤ", reason = "2004 Indian Ocean earthquake and tsunami"),
    PaititiRecord("ቿ", "ቿ", "ɻ", "♀Ը•ɻ", "४ቿቿ", "Air France Flight 447"),
    PaititiRecord("ቿ", "ቿ", "♀", "♀Ը•ɻ", reason = "2010 Haiti earthquake"),
    PaititiRecord("Ը•⏝Ը", "ɤ", "Ը•", "♀Ը•४", "ɤ•ɷቿ•", "2011 Tōhoku earthquake and tsunami"),
    PaititiRecord("Ը•⏝४", "ɤ", "♀", "♀Ը•ɤ", "४ɷԸ", "Kiss nightclub fire in Santa Maria"),
    PaititiRecord("४", "ɤ", "Ը", "♀Ը•ɷ", reason = "Rana Plaza collapse"),
    PaititiRecord("ɷ", "ɤ", "Ը•", "♀Ը•ɷ", "४ɤ♀", "Malaysia Airlines Flight 370"),
    PaititiRecord("४", "ቿ", "Ը", "♀Ը•♀", "ቿɷɻ", "Sinking of MV Sewol"),
    PaititiRecord("Ը•⏝ቿ", "ɤ", "ɻ", "♀Ը•♀", "ቿɤɻ", "?Malaysia Airlines Flight 17"),
    PaititiRecord("ቿ", "Ը", "Ը", "♀ԸԸ•", "ɻɻɷ", "Germanwings Flight 9525"),
    PaititiRecord("Ը•", "Ը", "ɤ", "♀ԸԸ•", reason = "2015 Mina stampede"),
    PaititiRecord("ɤ", "ɻ", "ɷ", "♀ԸԸԸ", "ɻ•ɻ", "November 2015 Paris attacks"),
    PaititiRecord("ɷ", "ቿ", "ɻ", "♀ԸԸԸ", "ቿቿቿ", reason = "2016 Karrada bombing"),
    PaititiRecord("Ը•⏝Ը", "ɤ", "ɻ", "♀ԸԸԸ", "Ըɻ♀"),
    PaititiRecord("Ը•", "Ը", "ɷ", "♀ԸԸԸ")
)

fun main(args: Array<String>) {
    listOfDates.forEachIndexed { index, paititiRecord ->
        print("${index+1}. ")
        print(paititiRecord.provideInfo())
        println("-".repeat(40))
    }
}

