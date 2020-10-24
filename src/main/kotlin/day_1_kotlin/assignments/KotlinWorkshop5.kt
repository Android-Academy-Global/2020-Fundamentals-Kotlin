package day_1_kotlin.assignments

// workshop #5 - inheritance, abstract class, interface


// TODO Sergey: format

interface CanSpeak {
    fun verify(code: String): Boolean
}

abstract class AbstractVerificator : Verificator {

    protected var property: String = ""

    fun setVerifiedProperty(property: String) {
        this.property = property
    }
}

// EXAMPLE:
// Class for demonstrate interface and abstract class using
// Compare it with SimplePhoneVerificator from KotlinWorkshop4
// Can we replace SimplePhoneVerificator with PhoneVerificator in KotlinWorkshop4?
class PhoneVerificator(private val codeChecker: (String) -> Boolean) : AbstractVerificator() {
    override fun verify(code: String): Boolean {
        if (property.isEmpty()) {
            println("Phone is empty")
            return false
        }
        if (code.length < 4) {
            println("Code is too short")
            return false
        }
        return codeChecker.invoke(code)
    }
}

// Work zone: create a class similar to the one above
// TODO 1: Define GmailVerificator that extends AbstractVerificator
class ... () {

    private val gmailCodeChecker: (String) -> Boolean = { code -> code == "gmailCode" }

    override fun verify(code: String): Boolean {
        return false // TODO 2: change return value for correct tests execution
    }
}


object GmailChecker {

    @JvmStatic
    fun main(args: Array<String>) {
        val gmailVerificator = GmailVerificator()

        positiveTest(gmailVerificator)  // Should print true
        negativeTest1(gmailVerificator) // Should print false
        negativeTest2(gmailVerificator) // Should print false
    }

    fun positiveTest(gmailVerificator: GmailVerificator): Boolean {
        val email = "kotlinWorkshop5@gmail.com"
        gmailVerificator.setVerifiedProperty(email)
        val code = "gmailCode"
        val isVerified = gmailVerificator.verify(code)
        return isVerified
    }

    fun negativeTest1(gmailVerificator: GmailVerificator): Boolean {
        val email = "kotlinWorkshop5@gmail.com"
        gmailVerificator.setVerifiedProperty(email)
        val code = "someCode"
        val isVerified = gmailVerificator.verify(code)
        return isVerified
    }

    fun negativeTest2(gmailVerificator: GmailVerificator): Boolean {
        val email = "kotlinWorkshop5@yandex.com"
        gmailVerificator.setVerifiedProperty(email)
        val code = "gmailCode"
        val isVerified = gmailVerificator.verify(code)
        return isVerified
    }
}