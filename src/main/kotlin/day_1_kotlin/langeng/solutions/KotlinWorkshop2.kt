package day_1_kotlin.langeng.solutions

import java.util.*
import kotlin.random.Random

// Workshop #2 - control flow (if, when), arrays, for loop, if expression, return & jumps

object KotlinWorkshop2 {

    // You may run the main function to test the code.
    @JvmStatic
    fun main(args: Array<String>) {



        /* Exercise area */

        // Initializing variables in runtime with input.
        // While running the program. Look at the console. Click inside the console window. Input a number.
        // Don't touch! Given:
        val upperBound = getUpperBound()
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val scanner = Scanner(System.`in`)

        while (true) {
            // TODO 1: Add logic for comparing userInput with randomNumber with If-Else operator.
            //  Break infinite while loop when user input correct number. Show message "Congratulations"
            //  If user entered number below randomNumber - show message "Your Guess is Lower"
            //  if user entered number over randomNumber - show message "Your Guess is Higher"

            print("Input a number in range 0..$nonNullUpperBound inclusive: ")
            // Storing user input in userInput variable
            // While running the program. Look at the console. Click inside the console window. Input a number.
            val userInput: Int = scanner.nextInt()
            if (userInput == randomNumber) {
                println("Congratulation, it was $randomNumber!")
                break

            } else if (userInput > randomNumber) {
                println("Your Guess is higher, continue.")

            } else {
                println("Your Guess is lower, continue.")
            }
        }



        /* Exercise bonus area */

        // TODO 2: Uncomment. Initialize "numbersArray".
        //  It should be an array of Int with capacity = 5.
        val numbersArray = intArrayOf(0, 0, 0, 0, 0)
        println("\nGiven numbersArray:")
        for ((index, number) in numbersArray.withIndex()){
            println("$index $number")
        }

        // TODO 3: Uncomment. Initialize "size".
        //  Change infinite while-loop condition. Limit user input with a size of "numbersArray".
        println("\nTraining 2. \"Fill in the collection\"")
        val size = numbersArray.size
        var counter = 0
        while (counter < size) {
            print("Input a number in range 0..10 inclusive: ")
            val userInput: Int = scanner.nextInt()

            // TODO 4: Add inputs to the "numbersArray" using the following logic:
            //  if userInput is 3 - add this 3 number "as is".
            //  if userInput is 5 - add 5 * size of numbersArray.
            //  if userInput is 9 - add 2 + size of numbersArray.
            //  else don't add anything.
            //  Use "When" operator.
            when (userInput) {
                3 -> numbersArray.set(counter, userInput)
                5 -> numbersArray.set(counter, userInput * size)
                9 -> numbersArray.set(counter, 2 + size)
                else -> { /* ignored */ }
            }

            counter++
        }

        // TODO 5: Print line by line elements of numbersArray with their indexes.
        //  Should looks like "index value".
        for ((index, number) in numbersArray.withIndex()){
            println("$index $number")
        }
    }



    /* DO NOT TOUCH the utils below. */

    private fun getUpperBound(): Int? {
        println("Training 1. \"Guess a number\"")
        print("Enter maximum number in range 10..20 inclusive: ")
        val scanner = Scanner(System.`in`)
        return try {
            scanner.nextInt()

        } catch (e: InputMismatchException) {
            null
        }
    }
}