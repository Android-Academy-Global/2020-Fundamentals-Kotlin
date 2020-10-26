package day_1_kotlin.langeng.solutions

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
interface Fuelable {
    fun isFull(): Boolean
    fun fuel()
}

// TODO 2: Write your own class Bus and some Car.
//  Instead of writing it from scratch, extend it from the Transport class and your new interface.
// ? Class can extends only one other class, but implements many interfaces, i.e.:
// class Kitty(): Cat, Cuteable, Sleepable, Furryable {}
class Bus(passengersCount: Int): Transport(passengersCount), Fuelable {

    private var hasFuel = false

    override fun drive() {
        if (isFull()) {
            hasFuel = false
            println("Driving $passengersCount passengers to the destination")

        } else {
            println("Don't have fuel. Hey passengers, let's push this thing together!")
        }
    }

    override fun isFull(): Boolean = hasFuel

    override fun fuel() {
        hasFuel = true
        println("Fueled a bit!")
    }
}

// TODO 2: Write your own class Bus and some Car.
//  Instead of writing it from scratch, extend it from the Transport class and your new interface.
class Car(passengersCount: Int): Transport(passengersCount), Fuelable {

    private var hasFuel = false

    override fun drive() {
        if (isFull()) {
            println("Driving a car with a speed of light! $passengersCount passengers on board.")
            hasFuel = false

        } else {
            println("Don't have fuel.")
        }
    }

    override fun isFull(): Boolean = hasFuel

    override fun fuel() {
        hasFuel = true
        println("Filled up with gasoline!")
    }
}

// TODO 3: Test your transport in appropriate sections
object VehiclesTest {

    // You can run the main function to test the code
    @JvmStatic
    fun main(args: Array<String>) {
        testBus()
        testCar()
        testBicycle()

        testBusParts()
    }

    private fun testBus() {
        println("\nTesting how bus drives...")
        val bus = Bus(10)
        bus.drive()
        bus.fuel()
        bus.drive()
    }

    private fun testCar() {
        println("\nTesting how car drives...")
        val car = Car(4)
        car.drive()
        car.fuel()
        car.drive()
    }

    private fun testBicycle() {
        println("\nTesting how bicycle drives...")
        val bicycle = Bicycle()
        bicycle.drive()
    }



    /* Exercise bonus area */

    // TODO 4: Test bus abilities as separate features.
    private fun testBusParts() {
        val bus = Bus(0)

        val engine: Driveable = bus
        println("\nTesting bus's engine:")
        println(engine.drive())

        val pump: Fuelable = bus
        println("\nTesting bus's fuel system:")
        println("has fuel: ${pump.isFull()}")
        println(pump.fuel())
        println("has fuel: ${pump.isFull()}")
    }
}