@file:Suppress(
    "UNREACHABLE_CODE",
    "DuplicatedCode",
    "UNUSED_VARIABLE",
    "ControlFlowWithEmptyBody",
    "ConstantConditionIf",
    "RedundantNullableReturnType",
    "RedundantExplicitType",
    "unused"
)

package day_1_kotlin.langeng.solutions

import java.util.*

// Workshop #1 - val, var, null, kotlin null safety, Elvis operator

object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {

        // Initializing variables. Pay attention - it's nullable!
        // Don't touch! Given:
        val nullableElvisString: String? = null
        val nullableAssertionString: String? = "potentially null"
        val emptyString = ""



        /* Exercise area */

        // TODO 1: Uncomment.
        //  Assign "nullableElvisString" to the "notNullUserString" and fix the assignment with elvis operator.
        //  If "nullableElvisString" is null, "notNullUserString" should be equal to "emptyString".
        var notNullUserString: String = nullableElvisString ?: emptyString
        println("Result string is empty $notNullUserString")

        // TODO 2: Uncomment.
        //  We know that "nullableString" is non-null by fact. Reassign value from "nullableAssertionString" using !! operator.
        notNullUserString = nullableAssertionString!!
        println("Result string is $notNullUserString")



        /* Exercise bonus area */

        // TODO 3: Uncomment. Assign a sum of two numbers to "sum".
        //  If first number is null, result should be null. If second one is null, result should be equal to first number.
        //  Use '?' check, '.plus()' function and '?:' to add valid alternative inside '.plus()'.
        val notNullAlternative = 0
        val firstNumber: Int? = 10
        val secondNumber: Int? = 20
        val sum : Int? = firstNumber?.plus(secondNumber ?: firstNumber)
        println("Sum is {$sum}")


        // TODO 4: Uncomment. Store user String input in a "stringInput" variable.
        // While running the program. Look at the console. Click inside the console area. Input a string.
        print("Please, input a string: ")
        val stringInput: String? = MyScanner.scan.next() // <--- string input 1

        // TODO 5: Uncomment.
        //  Store user Int input in "firstIntInput" and "secondIntInput" variables.
        //  Replace the 'null' to calculate a "sumIntInputs".
        //  Use '?' check, '.plus()' function and '?:' to add valid alternative inside '.plus()'.
        // While running the program. Look at the console. Click inside the console area. Input a string.
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