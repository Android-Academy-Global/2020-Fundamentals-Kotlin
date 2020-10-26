package day_1_kotlin.langeng.assignments

// Workshop #5 - inheritance, abstract, interface

// Don't touch! Given:
// Declare a contract for a transport ability.
interface Driveable {
    fun drive()
}

// Declare a transport class which describes passenger transport of all types.
// Give this transport an ability to drive.
abstract class Transport(protected var passengersCount: Int): Driveable

// Create a Bicycle transport which can carry a single person.
class Bicycle: Transport(1) {
    override fun drive() {
        println("Ride a bicycle.")
    }
}



/* Exercise area */

// TODO 1: Create a new interface that will be appropriate for new classes below.
// ? By convention, names of Classes and Interfaces start with an upper case letter and use the camel case.
// Example: "SomeLongClassName".
//interface ...

// TODO 2: Write your own class Bus and some Car.
//  Instead of writing it from scratch, extend it from the Transport class and your new interface.
// ? Class can extends only one other class, but implements many interfaces, i.e.:
// class Kitty(): Cat, Cuteable, Sleepable, Furryable {}

//class Bus ...
//class Car ...

// TODO 3: Test your transport in appropriate sections
object VehiclesTest {

    // You can run the main function to test the code
    @JvmStatic
    fun main(args: Array<String>) {
        testBus()
        testCar()
        testBicycle()
    }

    private fun testBus() {
        println("Testing how bus drives...")
//        val bus = ...
    }

    private fun testCar() {
        println("Testing how car drives...")
//        val car = ...
    }

    private fun testBicycle() {
        println("Testing how bicycle drives...")
//        ...
    }



    /* Exercise bonus area */

    // TODO 4: Test bus abilities as separate features.
    private fun testBusParts() {
        println("Testing bus's feature 1...")


        println("Testing bus's feature 2...")

    }
}