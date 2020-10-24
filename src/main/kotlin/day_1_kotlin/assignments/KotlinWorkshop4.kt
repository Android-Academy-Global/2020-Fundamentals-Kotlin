package day_1_kotlin.assignments// Workshop #4 - classes, properties, constructor, visibility modifiers

typealias CodeChecker = (String) -> Boolean

class SimplePhoneVerificator(private val codeChecker: CodeChecker) {

    private val consoleLogger: ConsoleLogger = ConsoleLogger()

    private var phone: String = ""

    fun verify(code: String): Boolean {
        if (phone.isEmpty()) {
            consoleLogger.log("Phone is empty")
            return false
        }
        if (code.length < 4) {
            consoleLogger.log("Code is too short")
            return false
        }
        return codeChecker.invoke(code)
    }

    fun setVerifiedProperty(property: String) {
        phone = property
    }
}

class ConsoleLogger {
    fun log(message: String) {
        println(message)
    }
}

object SimplePhoneChecker {

    @JvmStatic
    fun main(args: Array<String>) {
        val codeChecker: CodeChecker = { code -> code == "1234" }
        val phoneVerificator = SimplePhoneVerificator(codeChecker)

        // TODO: add logic only here
        // Use SimplePhoneVerificator.verify and SimplePhoneVerificator.setVerifiedProperty methods to verify your phone
        // You program should print "Code is verified!"

        // Solution example:
        /*val phone = "89626200421"
        val code = "1234"
        phoneVerificator.setVerifiedProperty(phone)
        val isVerified = phoneVerificator.verify(code)*/

        // TODO: Uncomment
        /*if (isVerified) {
            println("Code is verified!")
        } else {
            println("Error: Code is not verified!")
        }*/
    }
}