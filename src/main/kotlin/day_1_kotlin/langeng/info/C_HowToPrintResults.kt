package day_1_kotlin.langeng.info

import java.util.logging.Logger

object C_HowToPrintResults {

    // To see results in the console use some Standard output and/or logger classes in the Sdk.
    // Functions print(), println() or logger.

    // Console is in the "Run" tab. In the bottom menu of the Intellij idea.

    @JvmStatic
    fun main(args: Array<String>) {
        println("message") // A string
        println("message " + "other") // A concatenation of strings
        println("message " + 1) // A concatenation of different objects

        val value = "value"
        println("message $value") // A placeholder

        println("message ${Results().property}") // A placeholder with calculated result

        println("message value:" + value + ", property:${Results().property}")

        println("""
            |long
            |formatted
            |message
        """.trimIndent())

        try {
            // Code with error
        } catch (expected: Exception) {
            val log = Logger.getLogger("MyWorkshopLogger")
            log.throwing("Current class name", "someMethod()", expected)
        }
    }

    class Results {
        val property = "property"
    }
}