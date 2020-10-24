package solutions

import java.util.*

// workshop #7 - list, mutable list, useful functions, maps

object KotlinWorkshop7 {

    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)

        val evenList = mutableListOf<Int>()
        for (i in 0..50) {
            if (i % 2 == 0) {
                evenList.add(i)
            }
        }

        print("Please enter word:")
        //storing user input in firstUserString variable
        val userWord: String? = scanner.next()

        // TODO print work that user entered, but reversed and without first and last char in separate lines (convert it to list of chars first)
        val wordList = userWord?.toList() ?: listOf()
        var result = wordList
        if (wordList.size > 2) {
            result = wordList.subList(1, wordList.size - 2)
            result = result.reversed()
        }
        result.forEach {
            println(it)
        }

        val weatherMap = mutableMapOf(
            "Moskow" to 2,
            "St Petersburg" to -1,
            "Minsk" to 4
        )

        weatherMap["Kiev"] = 6
        weatherMap["Tel-Aviv"] = 20

        weatherMap.filter {
            it.value > 0
        }.forEach {
            println("City ${it.key} has temperature of ${it.value}")
        }

    }

}