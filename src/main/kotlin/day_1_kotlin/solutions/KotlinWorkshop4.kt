package day_1_kotlin.solutions

import java.util.*
import kotlin.random.Random

// Workshop #3 - functions, filters, lambda, high-order function

object KotlinWorkshop4 {

    private val guesses = mutableListOf<Int>()

    @JvmStatic
    fun main(args: Array<String>) {
        val upperBound = getUpperBound()
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val scanner = Scanner(System.`in`)

        var guessed = false
        while (!guessed) {
            guessed = playRound(scanner, randomNumber)
        }

        printGameStats(randomNumber)

        guesses.forEach {
            println("$it")
        }
    }

    private fun playRound(scanner: Scanner, randomNumber: Int): Boolean {
        print("User Input:")
        //storing user input in userInput variable
        val userInput: Int = scanner.nextInt()

        if (userInput == randomNumber) {
            println("Congratulation")
            return true
        } else if (userInput > randomNumber) {
            println("Your Guess is Lower")
        } else {
            println("Your Guess is Higher")
        }
        return false
    }

    private fun printGameStats(randomNumber: Int) {
        printTotalCountOfArray()

        getHigherGuesses(randomNumber)

        guesses.printHigherElement(randomNumber)

        printLowerGuesses(randomNumber)
    }

    // print total guesses count. Should take one parameter with default value for class var guesses,
    // but should can be reused for other arrays
    private fun printTotalCountOfArray(array: List<Any> = guesses) {
        println("Total count = $guesses")
    }

    // should return guesses that were higher than randomNumber (should pass in fun parameters)
    private fun getHigherGuesses(randomNumber: Int): List<Int> {
        val result = mutableListOf<Int>()
        for (guess in guesses) {
            if (guess > randomNumber) {
                result.add(guess)
            }
        }
        return result
    }

    val printLowerGuesses: (Int) -> Unit = {
        for (guess in guesses) {
            if (guess < it) {
                println("Guess lower than number = $guesses")
            }
        }
    }

    fun List<Int>.printHigherElement(number: Int) {
        for (guess in guesses) {
            if (guess > number) {
                println("Guess higher than number = $guesses")
            }
        }
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