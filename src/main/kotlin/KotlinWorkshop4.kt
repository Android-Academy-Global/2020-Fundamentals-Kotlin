import jdk.nashorn.internal.runtime.linker.Bootstrap

// Workshop #4 - classes, properties, constructor, visibility modifiers

typealias CodeChecker = (String) -> Boolean

class PhoneVerificator(private val codeChecker: CodeChecker) {

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

object PhoneChecker {

    @JvmStatic
    fun main(args: Array<String>) {
        val codeChecker: CodeChecker = { string -> string == "1234" }
        val phoneVerificator = PhoneVerificator(codeChecker)

        // TODO: add logic only here
        // Use phoneVerificator to verify your phone successfully
        // You program must print "Code is verified!"

        // TODO: Uncomment
        /*if (isVerified) {
            println("Code is verified!")
        } else {
            println("Error: Code is not verified!")
        }*/
    }
}

// Solution example:
/*val phone = "89626200421"
        val code = "1234"
        phoneVerificator.setVerifiedProperty(phone)
        val isVerified = phoneVerificator.verify(code)*/