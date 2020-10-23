import java.util.*
import kotlin.random.Random

// Workshop #1 - val, var, null, kotlin null safety, Elvis operator
object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {
        val mainUserNumber = -1

        val scanner = Scanner(System.`in`)

        print("User string:")
        //storing user input in firstUserString variable
        val firstUserString: String? = scanner.next()

        // TODO fix the assigning with use of elvis operator. notNullUserString has correct declaration.
        // if userString is null, notNullUserString should be equal to "emptyString"
        var notNullUserString: String = firstUserString

        print("Please enter word:")
        //storing user input in firstUserString variable
        val userWord: String? = scanner.next()

        // TODO we know that user entered non-null string. fix assertion without use of elvis operator
        notNullUserString = firstUserString

        print("First Number:")
        //storing user input in firstUserInput variable
        val firstUserInput: Int? = scanner.nextInt()

        print("Second Number:")
        //storing user input in secondUserInput variable
        val secondUserInput: Int? = scanner.nextInt()

        // TODO assign sum of two numbers to mainUserNumber using .plus() function. Change declaration of mainUserNumber is needed.
        // if first number is null, result should be null. If second one is null, result should be equal to first number
        // use one safe call operation and one elvis operator in operation

        println("User string is " + notNullUserString)

        // TODO
        println("Main user number is " + mainUserNumber)

        println("Your Guess is Lower")
    }

}



object KotlinWorkshop1Expected {

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