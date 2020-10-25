package day_1_kotlin.solutions

// Workshop #5 - inheritance, abstract, interface

interface Driveable {
    fun drive()
}

// Создадим сущность Bicycle, которая является транспортом для 1 человека
class Bicycle : Transport(1) {
    override fun drive() {
        println("Drive on bicycle")
    }
}

abstract class Transport(protected var passengersCount: Int) : Driveable


class Car(passengersCount: Int) : Transport(passengersCount), Fuelable {

    private var hasFuel = false

    override fun drive() {
        if (isFueled()) {
            println("Driving a car with a speed of light! $passengersCount passengers on board.")
            hasFuel = false
        } else {
            println("Don't have fuel")
        }
    }

    override fun isFueled(): Boolean = hasFuel

    override fun fuel() {
        hasFuel = true
    }
}

class Bus(passengersCount: Int) : Transport(passengersCount), Fuelable {

    private var hasFuel = false

    override fun drive() {
        if (isFueled()) {
            println("Driving $passengersCount passengers to the destination")
            hasFuel = false
        } else {
            println("Don't have fuel. Hey passengers, let's push this thing together!")
        }
    }

    override fun isFueled(): Boolean = hasFuel

    override fun fuel() {
        hasFuel = true
        println("Fueled a bit!")
    }
}

// TODO 2: Create a new interface that will be appropriate for several classes above,
//  implement it in several classes and call the method / methods in the Test object
interface Fuelable {
    fun isFueled(): Boolean
    fun fuel()
}


object VehiclesTest {

    @JvmStatic
    fun main(args: Array<String>) {
        testBicycle()
        testCar()
        testBus()
    }

    // TODO: Write function to test your vehicle
    private fun testBus() {
        println("Test how a bus drives.")
        val bus = Bus(10)
        bus.drive()
        bus.drive()
        bus.fuel()
        bus.drive()
    }

    private fun testBicycle() {
        println("Test how bicycle drives..")
        val bicycle = Bicycle()
        bicycle.drive()
    }

    private fun testCar() {
        println("Test how car drives..")
        val car = Car(4)
        car.drive()
    }
}


// * * * Bonus task * * * (work on home)
// Create a new class hierarchy for an arbitrary topic