package day_1_kotlin.assignments

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

abstract class Transport(protected var passengers: Int) : Driveable


class Car(val passengersCount: Int) : Transport(passengersCount) {
    override fun drive() {
        println("Driving a car with a speed of light! $passengers passengers on board.")
    }
}

// TODO 1: Write your own class Bus, that behaves the same as the one from Workshop 4
//  However, instead of implementing it from scratch, make it in a way to extend Transport class

// class Bus ...

// TODO 2: Create a new interface that will be appropriate for several classes above,
//  implement it in several classes and call the method / methods in the Test object


object VehiclesTest {

    @JvmStatic
    fun main(args: Array<String>) {
        testBicycle()
        testCar()
        testBus()
    }

    // TODO: Write a function to test your vehicle
    private fun testBus() {

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