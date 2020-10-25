package day_1_kotlin.assignments

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
        /*
        val evenList = ...
        for (i in 0..50) {
        }
        println(evenList)
        */

        // TODO 2: Print the "poem" for 2 cases:
        //  1. Filter and print words shorter than 5 symbols;
        //  2. Print poem reversed.
        /*
        val filtered = ...
        val reversed = ...
        println(filtered)
        println(reversed)
        * */



        /* Exercise bonus area */

        val weatherMap = mapOf(
            "Moscow" to 2,
            "St. Petersburg" to -1,
            "Minsk" to 4
        )

        // TODO 3. Add a weather for Kiev and Tel-Aviv to weatherMap.
//        weatherMap... =

        // TODO 4. Filter and print cities with temperature of zero+.
        //  Connect operators as a chain.
//        weatherMap
    }
}