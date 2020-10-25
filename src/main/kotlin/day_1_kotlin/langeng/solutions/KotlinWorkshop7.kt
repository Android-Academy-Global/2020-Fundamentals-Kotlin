package day_1_kotlin.langeng.solutions

// Workshop #7 - list, mutable list, useful functions, maps

object KotlinWorkshop7 {

    @JvmStatic
    fun main(args: Array<String>) {

        // Don't touch! Given:
        val sadPoem = arrayOf(
            "True happiness can be attained",
            "Only if one's surroundings are good.",
            "It's not true that good exists",
            "I'm sure you can agree that",
            "The reality",
            "Creates",
            "My attitude",
            "It's all beyond my control",
            "And you'll never in a million years hear me say that",
            "Today was a very good day."
        )



        /* Exercise area */

        // TODO 1: Print the "poem" for 2 cases:
        //  1. Filter and print lines shorter than 12 symbols;
        //  2. Print poem reversed.
        val filtered = sadPoem.filter { it.length < 12 }
        val reversed = sadPoem.reversed()
        println("\nFiltered: $filtered")
        println("\nReversed: $reversed")
        println("\n")

        // TODO 2: Uncomment.
        //  Initialize an evenList variable and add to it only "even" numbers from 0 to 50.
        val evenList = mutableListOf<Int>()
        for (i in 0..50 step 2) {
            evenList.add(i)
        }
        println("\nEven numbers: $evenList")


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