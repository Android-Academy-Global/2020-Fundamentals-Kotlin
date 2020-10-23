package assignments

import java.util.*
import kotlin.random.Random

// workshop #7 - list, mutable list, useful functions, maps

object KotlinWorkshop7 {

    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)

        // TODO create list of even numbers from 0 to 50

        print("Please enter word:")
        //storing user input in firstUserString variable
        val userWord: String? = scanner.next()

        // TODO print work that user entered, but reversed and without first and last char in separate lines (convert it to list of chars first)


        val weatherMap = mapOf(
            "Moskow" to 2,
            "St Petersburg" to -1,
            "Minsk" to 4
        )

        // TODO add weather for Kiev and Tel-Aviv to weatherMap

        // TODO filter and print trips with temperature of zero+



    }

    private fun getUpperBound(): Int? {
        println("Enter maximum number")
        val scanner = Scanner(System.`in`)
        try {
            return scanner.nextInt()
        } catch (e: InputMismatchException) {
            return null
        }
    }
}