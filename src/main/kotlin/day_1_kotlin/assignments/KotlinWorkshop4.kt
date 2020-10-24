package day_1_kotlin.assignments

// Workshop #4 - classes, properties, constructor, visibility modifiers

object SimplePhoneChecker {

    @JvmStatic
    fun main(args: Array<String>) {
        val codeChecker: (String) -> Boolean = { code -> code == "1234" }

        // TODO 1: Create an instance of SimplePhoneVerificator
        val phoneVerificator = SimplePhoneVerificator(codeChecker)

        val isVerified = false
        // TODO 2: add logic here
        //  Use SimplePhoneVerificator.verify and SimplePhoneVerificator.setVerifiedProperty methods to verify your phone
        //  You program should print "Code is verified!"

        if (isVerified) {
            println("Code is verified!")
        } else {
            println("Error: Code is not verified!")
        }
    }
}


// Don't touch this part:
class Animal(private val codeChecker: (String) -> Boolean) {

    private var phone: String = ""

    /**
     * Checks if a [code] is valid:
     * 1. Not empty
     * 2. Longer than 3 symbols
     * 3. [codeChecker] returns true
     */
    fun verify(code: String): Boolean {
        if (phone.isEmpty()) {
            println("Phone is empty")
            return false
        }
        if (code.length < 4) {
            println("Code is too short")
            return false
        }
        return codeChecker.invoke(code)
    }

    fun setVerifiedProperty(property: String) {
        phone = property
    }
}