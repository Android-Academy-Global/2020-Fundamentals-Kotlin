// workshop #5 - inheritance, abstract class, interface

interface Verificator {
    fun verify(code: String): Boolean
}

abstract class AbstractVerificator : Verificator {

    protected val consoleLogger: ConsoleLogger = ConsoleLogger()

    protected var property: String = ""

    fun setVerifiedProperty(property: String) {
        // TODO: Add code here
        //this.property = property
    }
}

// Class for demonstrate interface and abstract class using
// Compare it with SimplePhoneVerificator from KotlinWorkshop4
// Can we replace SimplePhoneVerificator with PhoneVerificator in KotlinWorkshop4?
class PhoneVerificator(private val codeChecker: CodeChecker) : AbstractVerificator() {
    override fun verify(code: String): Boolean {
        if (property.isEmpty()) {
            consoleLogger.log("Phone is empty")
            return false
        }
        if (code.length < 4) {
            consoleLogger.log("Code is too short")
            return false
        }
        return codeChecker.invoke(code)
    }
}


class GmailVerificator : AbstractVerificator() {

    val gmailCodeChecker: CodeChecker = { code -> code == "gmailCode" }

    override fun verify(code: String): Boolean {
        return false // TODO: change return value for correct tests execution

        // Solution example:
        /*val isCodeCorrect = gmailCodeChecker.invoke(code)
        val isGmail = property.contains("@gmail.com")
        return isCodeCorrect && isGmail*/
    }
}

object GmailChecker {

    @JvmStatic
    fun main(args: Array<String>) {
        val gmailVerificator = GmailVerificator()

        positiveTest(gmailVerificator) // Should print true
        negativeTest1(gmailVerificator) // Should print false
        negativeTest2(gmailVerificator) // Should print false
    }

    fun positiveTest(gmailVerificator: GmailVerificator) {
        val email = "kotlinWorkshop5@gmail.com"
        gmailVerificator.setVerifiedProperty(email)
        val code = "gmailCode"
        val isVerified = gmailVerificator.verify(code)
        println(isVerified)
    }

    fun negativeTest1(gmailVerificator: GmailVerificator) {
        val email = "kotlinWorkshop5@gmail.com"
        gmailVerificator.setVerifiedProperty(email)
        val code = "someCode"
        val isVerified = gmailVerificator.verify(code)
        println(isVerified)
    }

    fun negativeTest2(gmailVerificator: GmailVerificator) {
        val email = "kotlinWorkshop5@yandex.com"
        gmailVerificator.setVerifiedProperty(email)
        val code = "gmailCode"
        val isVerified = gmailVerificator.verify(code)
        println(isVerified)
    }
}
