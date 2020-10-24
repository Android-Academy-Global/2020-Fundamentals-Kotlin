package day_1_kotlin.assignments

import java.util.*

// Workshop #1 - val, var, null, kotlin null safety, Elvis operator
object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {

        // A bit of examples

        val number: Int = -1
        val someNumber: Double = 2.5
        val someString: String = "Hello world"
        val someFlag: Boolean = true

        // Magic
        val scanner = Scanner(System.`in`)
        print("Please, input any string:")
        val userInput: String? = scanner.next()
        //storing user input in firstUserInput variable
//        val firstUserNumber: Int? = scanner.nextInt()
//        print("Second Number:")
//        //storing user input in secondUserInput variable
//        val secondUserNumber: Int? = scanner.nextInt()



        // storing user input in firstUserString variable. Pay attention - it's nullable!
        val nullableString: String? = "Potentially null"

        // TODO 1: fix the assigning with use of elvis operator. notNullUserString has correct declaration.
        // if userString is null, notNullUserString should be equal to "emptyString"
//        var notNullUserString: String = nullableString

        // TODO 2: we know that user entered non-null string. Fix assertion using !! operator
        // TODO: Sergei - add a smart and funny comment about why we shouldn't
//        notNullUserString = nullableString
//        println("User string is " + notNullUserString)


        val sum : Int? = null
        val firstNumber: Int? = 10
        val secondNumber: Int? = 20

        // * * *

        // TODO 3: assign sum of two numbers to mainUserNumber using .plus() function. Change declaration of mainUserNumber is needed.
        // if first number is null, result should be null. If second one is null, result should be equal to first number
        // use one safe call operation and one elvis operator in operation
        // pay attention at var and val difference

        println("Sum is {$sum}")
    }

}