package assignments

import java.util.*

// Workshop #1 - val, var, null, kotlin null safety, Elvis operator
object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {

        val sum: Int = -1
        val someNumber: Double = 2.5
        val someString: String = "Hello world"
        val someFlag: Boolean = true
        // Magic
        val scanner = Scanner(System.`in`)


        print("Please, input any string:")

        // storing user input in firstUserString variable. Pay attention - it's nullable!
        val firstUserString: String? = scanner.next()

        // TODO: fix the assigning with use of elvis operator. notNullUserString has correct declaration.
        // if userString is null, notNullUserString should be equal to "emptyString"
        var notNullUserString: String = firstUserString

        print("Please enter word:")
        //storing user input in firstUserString variable
        val userWord: String? = scanner.next()

        // TODO: we know that user entered non-null string. Fix assertion using !! operator
        // TODO: Sergei - add a smart and funny comment about why we shouldn't
        notNullUserString = firstUserString

        print("First Number:")
        //storing user input in firstUserInput variable
        val firstUserNumber: Int? = scanner.nextInt()

        print("Second Number:")
        //storing user input in secondUserInput variable
        val secondUserNumber: Int? = scanner.nextInt()

        // *
        // TODO: assign sum of two numbers to mainUserNumber using .plus() function. Change declaration of mainUserNumber is needed.
        // if first number is null, result should be null. If second one is null, result should be equal to first number
        // use one safe call operation and one elvis operator in operation
        // pay attention at var and val difference

        println("User string is " + notNullUserString)

        println("Sum is {$sum}")
    }

}