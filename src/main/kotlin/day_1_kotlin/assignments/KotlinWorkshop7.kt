package day_1_kotlin.assignments

import java.util.*

// workshop #7 - list, mutable list, useful functions, maps

object KotlinWorkshop7 {

    @JvmStatic
    fun main(args: Array<String>) {
        // TODO 1: create variable evenList and add to it only even numbers from 0 to 50
        /*for (i in 0..50) {
        }*/

        // TODO: uncomment and check the values are even
        // println(evenList)

        val poem = arrayOf(
            "The", "leaves", "are", "falling",
            "One", "by", "one",
            "Summer’s", "over",
            "School’s", "begun"
        )

        // TODO 2: print poem
        //  1. filtered for words shorter than 5 symbols
        //  2. reversed

        // * * * Bonus task * * * (work on home)
        val weatherMap = mapOf(
            "Moscow" to 2,
            "St. Petersburg" to -1,
            "Minsk" to 4
        )

        // TODO * add weather for Kiev and Tel-Aviv to weatherMap

        // TODO * filter and print trips with temperature of zero+


    }

}