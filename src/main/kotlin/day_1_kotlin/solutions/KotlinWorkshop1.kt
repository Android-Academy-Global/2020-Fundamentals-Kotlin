package day_1_kotlin.solutions

import java.util.*

// Workshop #1 - val, var, null, kotlin null safety, Elvis operator
object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {

        /* Exercise area */

        // Initializing variables. Pay attention - it's nullable!
        // Given:
        val nullableElvisString: String? = null
        val nullableAssertionString: String? = "potentially null"
        val emptyString = ""

        // If "nullableString" is null, "notNullUserString" should be equal to "emptyString".
        // TODO 1
        var notNullUserString: String = nullableElvisString ?: emptyString
        println("Result string is empty $notNullUserString")

        // TODO 2
        notNullUserString = nullableAssertionString!!
        println("Result string is $notNullUserString")



        /* Exercise bonus area */

        // If first number is null, result should be null. If second one is null, result should be equal to first number
        // use one safe call operation and one elvis operator in operation
        // pay attention at var and val difference
        // TODO 3
        val notNullAlternative = 0
        val firstNumber: Int? = 10
        val secondNumber: Int? = 20
        val sum : Int? = firstNumber?.plus(secondNumber ?: 0)
        println("Sum is {$sum}")


        // TODO 4
        // Look at the console. Click there. Input a string.
        print("Please, input a string: ")
        val stringInput: String? = MyScanner.scan.next() // <--- string input 1

        // TODO 5
        // Look at the console. Click there. Input a number, then second number.
        print("Please, input a number: ")
        val firstIntInput: Int? = MyScanner.scan.nextInt() // <--- number input 1
        print("Please, input a second number: ")
        val secondIntInput: Int? = MyScanner.scan.nextInt() // <--- number input 2
        val sumIntInputs : Int? = firstIntInput?.plus(secondIntInput ?: notNullAlternative) // <--- replace 'null' with correct expression
        println("String:$stringInput, Summ of numbers:$sumIntInputs")



        /* Examples area */

        val number: Int = -1
        val someNumber: Double = 2.5
        val someString: String = "Hello world"
        val someFlag: Boolean = true
        var someNullableNumber: Long? = null
    }
}

/* DO NOT TOUCH the utils below. */

class MyScanner {
    companion object {
        val scan = Scanner(System.`in`)
    }
}