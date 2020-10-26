package day_1_kotlin.langeng.assignments

import java.util.*
import java.util.logging.Logger
import kotlin.random.Random

// Workshop #3 - functions, lambda, high-order function

object KotlinWorkshop3 {

    // You can run the main function to test the code
    @JvmStatic
    fun main(args: Array<String>) {
        // Initializing variables in runtime with input.
        // While running the program. Look at the console. Click inside the console window. Input a number.
        // Don't touch! Given:
        val scanner = Scanner(System.`in`)
        val upperBound = getUpperBound(scanner)
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val capacity = nonNullUpperBound
        val guesses = createIntArrayOfCapacity(capacity)



        /* Exercise area */

        var guessed = false
        var counter = 0
        while (!guessed && counter < capacity) {
            print("Input a number in range 0..$nonNullUpperBound inclusive: ")
            // Storing user input in userInput variable
            // While running the program. Look at the console. Click inside the console window. Input a number.
            val userInput: Int = getNextInput(scanner, nonNullUpperBound)
            guesses[counter] = userInput

            // TODO 1: Uncomment. Declare playRound function: takes 2 integer arguments and returns a boolean.
//            guessed = playRound(userInput, randomNumber)

            counter++
        }

        // TODO (bonus): Create analytics system for the game. Collect stats and print.
        printGameStats(guesses, counter, randomNumber)
    }

    // TODO 1: Uncomment. Declare playRound function: takes 2 integer arguments and returns a boolean.
    // TODO 2: Add logic for comparing userInput with randomNumber with If-Else operator.
    //  Break infinite while loop when user input correct number. Show message "Congratulations"
    //  If user entered number below randomNumber - show message "Your Guess is Lower"
    //  if user entered number over randomNumber - show message "Your Guess is Higher".
    //  See workshop #2
//    private fun playRound(...) : ... {
//
//        return false
//    }



    /* Exercise bonus area */

    // TODO (bonus): Create analytics system for the game. Collect stats and print.
    private fun printGameStats(guesses: IntArray, guessCounter: Int, randomNumber: Int) {
        // TODO 3: Uncomment. Print total guesses count.
//        printTotalCountOfGuesses(guessCounter)

        // TODO 4: Uncomment.
        //  Add high level function "countHigherGuesses" for printing higher elements from array.
        // guesses.countHigherGuesses(guesses, randomNumber)

        // TODO 5: Uncomment. Create lambda function "countLowerGuesses" for printing lower elements from array.
        //  Do not print element if its value == "-1", the default value given to array on a initializing stage.
        // countLowerGuesses(guesses, randomNumber)

        // TODO 6: Uncomment. Print every element of guesses in separate line via .forEach high-level function.
        // guesses
    }

    // TODO 3
    // Should print total guesses count.
    private fun printTotalCountOfGuesses(guessCounter: Int) {
        TODO()
    }

    // TODO 4
    // Should count and print guesses that were higher than randomNumber.
    // Should return count as fun result.
    private fun IntArray.countHigherGuesses(guesses: IntArray, randomNumber: Int): Int {
        TODO()
    }

    // TODO 5
    // Should count and print guesses that were lower than randomNumber.
    val countLowerGuesses: (IntArray, Int) -> Unit = { guesses, randomNumber ->
        TODO()
    }



    /* DO NOT TOUCH the utils below. */

    private fun getUpperBound(scanner: Scanner): Int? {
        val upperLimit = 20
        val lowerLimit = 1

        println("Game: \"Guess a number\"")
        print("Enter maximum number in range 1..20 inclusive: ")
        return try {
            var input = scanner.nextInt()
            if (input in lowerLimit..upperLimit) {
                input

            } else {
                println("Wrong number. Use default as limit: $upperLimit")
                upperLimit
            }

        } catch (e: InputMismatchException) {
            null
        }
    }

    private fun getNextInput(scanner: Scanner, nonNullUpperBound: Int): Int {
        val lowerLimit = 0
        val badResult = -1

        return try {
            var input = scanner.nextInt()
            if (input in lowerLimit..nonNullUpperBound) {
                input

            } else {
                println("Wrong input. Should be $nonNullUpperBound or lower.")
                badResult
            }

        } catch (e: InputMismatchException) {
            val log = Logger.getLogger("KotlinWorkshop3Logger")
            log.throwing("KotlinWorkshop3Logger", "getNextInput()", e)
            badResult
        }
    }

    private fun createIntArrayOfCapacity(capacity: Int): IntArray {
        return IntArray(capacity) { i -> -1 }
    }
}