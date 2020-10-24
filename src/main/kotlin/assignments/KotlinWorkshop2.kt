package assignments

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

            // TODO: add logic for comparing userInput with randomNumber with if operator.
            //  if user entered number below randomNumber - show message "Your Guess is Lower"
            //  if user entered number over randomNumber - show message "Your Guess is Higher"
            //  break while loop when user write correct number and show message "Congratulations"
        }


        // TODO uncomment and finish initialization of numbersArray. It should be array of int
        //var numbersArray =

        // TODO limit user input times to 10
        while (true) {
            print("User Input:")
            //storing user input in userInput variable
            val userInput: Int = scanner.nextInt()

            // TODO: add next logic for adding numbers from user to numbersArray without using "if" operator:
            //  if userInput is 3 - add this number(3).
            //  if userInput is 5 - add 5 * current size of numbersArray.
            //  if userInput is 9 - add 2 + current size of numbersArray.
            //  else don't add anything
        }

        // TODO print line by line elements of numbersArray with their indexes - should be like "index value"

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