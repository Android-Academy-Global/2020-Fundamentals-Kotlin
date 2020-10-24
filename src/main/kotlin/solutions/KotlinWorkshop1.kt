package solutions

import java.util.*
import kotlin.random.Random

// Workshop #1 - val, var, null, kotlin null safety, Elvis operator
object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {
        var mainUserNumber: Int? = -1

        val scanner = Scanner(System.`in`)

        print("User string:")
        //storing user input in firstUserString variable
        val firstUserString: String? = scanner.next()

        var notNullUserString: String = firstUserString ?: "emptyString"

        print("Please enter word:")
        //storing user input in firstUserString variable
        val userWord: String? = scanner.next()

        notNullUserString = firstUserString!!


        print("First Number:")
        //storing user input in firstUserInput variable
        val firstUserInput: Int? = scanner.nextInt()

        print("Second Number:")
        //storing user input in secondUserInput variable
        val secondUserInput: Int? = scanner.nextInt()

        mainUserNumber = firstUserInput?.plus(secondUserInput ?: 0)

        println("User string is " + notNullUserString)


        println("Main user number is " + mainUserNumber)
    }

}