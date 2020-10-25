package day_1_kotlin.langeng.assignments

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
        /*
        val filtered = ...
        val reversed = ...
        println(filtered)
        println(reversed)
        * */

        // TODO 2: Uncomment.
        //  Initialize an evenList variable and add to it only "even" numbers from 0 to 50.
        /*
        val evenList = ...
        for (i in 0..50) {
        }
        println(evenList)
        */




        // Don't touch! Given:
        val weatherMap = mapOf(
            "Moscow" to 2,
            "St. Petersburg" to -1,
            "Minsk" to 4
        )



        /* Exercise bonus area */

        // TODO 3. Add a weather for Kiev and Tel-Aviv to weatherMap.
//        weatherMap... =

        // TODO 4. Filter and print cities with temperature of zero+.
        //  Connect operators as a chain.
//        weatherMap
    }
}