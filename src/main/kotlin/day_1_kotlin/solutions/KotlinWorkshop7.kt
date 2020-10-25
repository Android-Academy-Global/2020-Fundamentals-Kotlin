package day_1_kotlin.solutions

import java.util.*

// workshop #7 - list, mutable list, useful functions, maps

object KotlinWorkshop7 {

    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)

        // TODO 1: create variable evenList and add to it only even numbers from 0 to 50
        val evenList = mutableListOf<Int>()
        for (i in 0..50) {
            if (i % 2 == 0) {
                evenList.add(i)
            }
        }

        // TODO: uncomment and check the values are even
        println(evenList)

        val poem = arrayOf(
            "The", "leaves", "are", "falling",
            "One", "by", "one",
            "Summer’s", "over",
            "School’s", "begun"
        )

        // TODO 2: print poem
        //  1. filtered for words shorter than 5 symbols
        //  2. reversed
        val filtered = poem.filter { it.length < 5 }
        val reversed = poem.reversed()
        println(filtered)
        println(reversed)

        // * * * Bonus task * * * (work on home)
        val weatherMap = mutableMapOf(
            "Moskow" to 2,
            "St Petersburg" to -1,
            "Minsk" to 4
        )

        // TODO * add weather for Kiev and Tel-Aviv to weatherMap
        weatherMap["Kiev"] = 6
        weatherMap["Tel-Aviv"] = 20

        // TODO * filter and print trips with temperature of zero+
        weatherMap.filter {
            it.value > 0
        }.forEach {
            println("City ${it.key} has temperature of ${it.value}")
        }

    }

}