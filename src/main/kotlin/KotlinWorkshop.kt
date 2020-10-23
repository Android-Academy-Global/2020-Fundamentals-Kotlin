import java.util.*
import kotlin.random.Random

// We'll build an app that allows you to verify your account using an email or a phone number


// Workshop #1 - val, var, null, kotlin null safety, Elvis operator




// Workshop #2 - control flow (if, when), arrays, for loop, if expression, return & jumps

object GuessTheNumber {

    @JvmStatic
    fun main(args: Array<String>) {
        val upperBound = getUpperBound()
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val scanner = Scanner(System.`in`)

        // TODO: while loop (or for with limited guess count)
        while (true) {
            print("User Input:")
            //storing user input in userInput variable
            val userInput: Int = scanner.nextInt()

            // TODO: add logic

            //checking conditions and showing messages
            if (userInput == randomNumber) {
                println("Congratulation")
                break
            } else if (userInput > randomNumber) {
                println("Your Guess is Lower")
            } else {
                println("Your Guess is Higher")
            }
        }
    }

    private fun getUpperBound(): Int? {
        println("Enter maximum number")
        val scanner = Scanner(System.`in`)
        try {
            return scanner.nextInt()
        } catch (e: InputMismatchException) {
            return null
        }
    }
}


// Workshop #3 - functions, filters, lambda, high-order function


object GuessTheNumberFunctional {

    private val guesses = mutableListOf<Int>()

    @JvmStatic
    fun main(args: Array<String>) {
        val upperBound = getUpperBound()
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val scanner = Scanner(System.`in`)

        var guessed = false
        while (!guessed) {
            guessed = playRound(scanner, randomNumber)
        }

        printGameStats(randomNumber)
    }

    private fun playRound(scanner: Scanner, randomNumber: Int): Boolean {
        print("User Guess is:")
        //storing user input in userInput variable
        val userInput: Int = scanner.nextInt()

        guesses.add(userInput)

        //checking conditions and showing messages
        if (userInput == randomNumber) {
            println("Congratulation")
            return true
        }

        if (userInput > randomNumber) {
            println("Your Guess is Lower")
        } else {
            println("Your Guess is Higher")
        }
        return false
    }

    private fun printGameStats(randomNumber: Int) {
        printTotal()
        printHigherGuesses(randomNumber)
        printLowerGuesses(randomNumber)
    }

    private fun printTotal() {
        val total = guesses.size
        println("Total guesses: $total")
    }

    private fun printLowerGuesses(randomNumber: Int) {
        val guessesThatWereLower = guesses.filter { guess -> guess < randomNumber }
        println("Guesses that were lower: $guessesThatWereLower")
    }

    private fun printHigherGuesses(randomNumber: Int): List<Int> {
        val guessesThatWereHigher = guesses.filter { it > randomNumber }
        println("Guesses that were higher: $guessesThatWereHigher")
        return guessesThatWereHigher
    }


    private fun getUpperBound(): Int? {
        println("Enter maximum number")
        val scanner = Scanner(System.`in`)
        try {
            return scanner.nextInt()
        } catch (e: InputMismatchException) {
            return null
        }
    }
}


// Workshop #4 - classes, properties, constructor, visibility modifiers

// TODO: add unit tests for verify and setProperty methods
class PhoneVerificator(private val codeChecker: (String) -> Boolean) {

    var phone: String = ""
    val consoleLogger: ConsoleLogger

    init {
        consoleLogger = ConsoleLogger()
    }

    fun verify(code: String): Boolean {
        if (code.length < 4) {
            consoleLogger.log("Code is too short")
            return false
        }
        return codeChecker.invoke(code)
    }

    fun setVerifiedProperty(property: String) {
        this.phone = property
    }
}

class ConsoleLogger {
    fun log(message: String) {
        println(message)
    }
}

// workshop #5 - inheritance, abstract class, interface

interface Verificator {
    fun verify(code: String): Boolean
    fun setVerifiedProperty(property: String)
}


class EmailVerificator() : Verificator {

    var phone: String = ""

    private val shaitanMachine = { code: String -> Random.nextBoolean() }

    override fun verify(code: String): Boolean {
        val rootDomain = code.takeLastWhile { char -> char != '.' }
        val alwaysAllow = when (rootDomain) {
            "ru" -> true
            "com" -> false
            else -> false
        }
        return shaitanMachine.invoke(code) || alwaysAllow
    }

    override fun setVerifiedProperty(property: String) {
        this.phone = property
    }
}


// workshop #6 - data class, object, enum

enum class UserProperty {
    PHONE,
    EMAIL
}

data class User(val phone: String, val email: String)
data class VerificationRequest(val prop: UserProperty, val value: String, val code: String)

object UserCredentialsChecker {

    val phoneVerificator = PhoneVerificator { it.isNotEmpty() }
    val emailVerificator = EmailVerificator()

    fun verifyProperty(verificationRequest: VerificationRequest) {
        // TODO: use inheritance after classes separation and just set an instance of phone / email verificator here
        when (verificationRequest.prop) {
            UserProperty.PHONE -> {
                phoneVerificator.setVerifiedProperty(verificationRequest.value)
                phoneVerificator.verify(verificationRequest.code)
            }
            UserProperty.EMAIL -> {

            }
        }
    }
}


// workshop #7 - list, mutable list, useful functions, maps

// TODO: add     val verificaitonsLog = mutableListOf<Pair<VerificationRequest, Boolean>>() to the checker
// TODO: add     val verifictionsLog = mutableMapOf<String, String>>() to a checker, like a real backend does
// Remind about the filters again


// workshop #8 - const, companion object, extension func


// workshop #9 - generics