package day_1_kotlin.langeng.solutions

// Workshop #7 - list, mutable list, useful functions, maps

object KotlinWorkshop7 {

    @JvmStatic
    fun main(args: Array<String>) {

        // Don't touch! Given:
        val poem = arrayOf(
            "The", "leaves", "are", "falling",
            "One", "by", "one",
            "Summer’s", "over",
            "School’s", "begun"
        )



        /* Exercise area */

        // TODO 1: Uncomment.
        //  Initialize an evenList variable and add to it only "even" numbers from 0 to 50.
        val evenList = mutableListOf<Int>()
        for (i in 0..50 step 2) {
            evenList.add(i)
        }
        println("\nEven numbers: $evenList")

        // TODO 2: Print the "poem" for 2 cases:
        //  1. Filter and print words shorter than 5 symbols;
        //  2. Print poem reversed.
        val filtered = poem.filter { it.length < 5 }
        val reversed = poem.reversed()
        println("\nFiltered: $filtered")
        println("\nReversed: $reversed")
        println("\n")



        // Don't touch! Given:
        val weatherMap = mutableMapOf(
            "Moscow" to 2,
            "St. Petersburg" to -1,
            "Minsk" to 4
        )



        /* Exercise bonus area */

        // TODO 3. Add a weather for Kiev and Tel-Aviv to weatherMap.
        weatherMap["Kiev"] = 6
        weatherMap["Tel-Aviv"] = 20

        // TODO 4. Filter and print cities with temperature of zero+.
        //  Connect operators as a chain.
        weatherMap.filter {
            it.value > 0
        }.forEach {
            println("City ${it.key} has temperature of ${it.value}")
        }
    }
}