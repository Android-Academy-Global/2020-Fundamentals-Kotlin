package day_1_kotlin.assignments

import java.util.*
import kotlin.random.Random

// Workshop #3 - functions, filters, lambda, high-order function

object KotlinWorkshop3 {

    private val guesses = mutableListOf<Int>()

    @JvmStatic
    fun main(args: Array<String>) {
        // Don't touch!
        val upperBound = getUpperBound()
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val scanner = Scanner(System.`in`)

        // Working zone

        var guessed = false
        while (!guessed) {
            val guess = scanner.nextInt()
//            guessed = playRound(guess, randomNumber)
        }

        // TODO (bonus): print every element of guesses in separate line via .forEach high-level function
        printGameStats(randomNumber)
    }

    // TODO 1: declare playRound function: takes 2 integer arguments and returns a boolean
    // TODO 2: fill in with logic for guessing number from workshop 2.
//    private fun playRound(...) : ... {
//        return false
//    }


    //region BONUS TASK

    // * * * Bonus task * * * (work on home)
    // Create analytics system for the game. Collect stats and print them
    private fun printGameStats(randomNumber: Int) {
        printTotalCountOfArray()

        // TODO fill getHigherGuesses function
        // getHigherGuesses(randomNumber)

        // TODO add high level function for printing max element from array, so you can uncomment next string and check result
        // guesses.printHigherElement()

        // TODO create lambda function printLowerGuesses that print guesses that were lower than randomNumber (should pass in fun parameters)
        // printLowerGuesses(randomNumber)
    }

    // print total guesses count. Should take one parameter with default value for class var guesses,
    // but should can be reused for other arrays
    private fun printTotalCountOfArray() {
        TODO()
    }

    // should return guesses that were higher than randomNumber (should pass in fun parameters)
    private fun getHigherGuesses(): List<Int> {
        TODO()
    }

    val printLowerGuesses: (Int) -> Int = {
        TODO()
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
    //endregion
}