package day_1_kotlin.assignments

// Workshop #5 - inheritance, abstract, interface

interface Driveable {
    fun drive()
}

// Создадим сущность Bicycle, которая реализует наш Drivable
class Bicycle : Driveable {
    override fun drive() {
        println("Drive on bicycle")
    }
}

// Создадим сущность Car, которая наш Drivable.
// Для сущности Car характерна зависимость от топлива (т.к без топлива машина не поедет)
// Создадим абастрактный класс, который предоставялет механизм заправки средства передвижения топливом

abstract class Transport {

    protected abstract var passengers: Int

}

class Car(override var passengers: Int) : Transport(), Driveable {

    override fun drive() {
        println("Driving a car with a speed of light! $passengers passengers on board.")
    }
}

// TODO 1: Write your own class Bus, that behaves the same as the one from Workshop 4
//  However, instead of implementing it from scratch, make it in a way to extend Transport class
//  and implement Driveable interface
// class Bus ...

// TODO 2: Create a new interface that will be appropriate for several classes above,
//  implement it in several classes and call the method / methods in the Test object


object VehiclesTest {

    @JvmStatic
    fun main(args: Array<String>) {
        testBicycle()
        testCar()
        // testYourVehicle()
    }

    // TODO: Write function to test your vehicle
    private fun testYourVehicle() {

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