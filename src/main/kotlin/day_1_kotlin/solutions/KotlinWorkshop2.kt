package day_1_kotlin.solutions

import java.util.*
import kotlin.random.Random

// Workshop #2 - control flow (if, when), arrays, for loop, if expression, return & jumps

object KotlinWorkshop2 {

    @JvmStatic
    fun main(args: Array<String>) {
        val upperBound = getUpperBound()
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val scanner = Scanner(System.`in`)

        print("Guess number :")
        while (true) {
            print("User Input:")
            //storing user input in userInput variable
            val userInput: Int = scanner.nextInt()

            if (userInput == randomNumber) {
                println("Congratulation")
                break
            } else if (userInput > randomNumber) {
                println("Your Guess is Lower")
            } else {
                println("Your Guess is Higher")
            }
        }

        // TODO uncomment and finish initialization of numbersArray. It should be array of int
        val numbersArray = intArrayOf()

        // TODO limit user input times to 10
        var counter = 0
        while (counter < 10) {
            print("User Input:")
            val userInput: Int = scanner.nextInt()

            when (userInput) {
                3 -> numbersArray.set(numbersArray.size, userInput)
                5 -> numbersArray.set(numbersArray.size, userInput * numbersArray.size)
                9 -> numbersArray.set(numbersArray.size, 2 + numbersArray.size)
                else -> {}
            }

            counter++
        }

        for ((index, number) in numbersArray.withIndex()){
            println("$index $number")
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