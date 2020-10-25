package day_1_kotlin.assignments

// Workshop #4 - classes, inheritance, abstract, interface

// По сути это будет урок про ООП в котлине
// Пусть студенты напишут свой класс на котлине

// Можно добавить интерактива - чтобы студенты быстро представли свои классы
// С учетом объединения воркшопов 4 и 5 это становится возможным, если на каждого студента потратить от 30 секунд до 1 минуты

// Допустим мы хотим спроектировать завод, производящий разные виды средств передвижений
// Все средства передвижения должны передвигаться -> объявим интерфейс, отвечающий за передвижение
interface Drivable {
    fun drive()
}

// Создадим сущность Bicycle, которая реализует наш Drivable
class Bicycle : Drivable {
    override fun drive() {
        println("Drive on bicycle")
    }
}

// Создадим сущность Car, которая наш Drivable.
// Для сущности Car характерна зависимость от топлива (т.к без топлива машина не поедет)
// Создадим абастрактный класс, который предоставялет механизм запарвки средства передвижения топливом

abstract class Fuelable {

    protected var isFueled = false

    fun fill() {
        println("Your vehicle fueled")
        isFueled = true
    }
}

class Car : Fuelable(), Drivable {
    override fun drive() {
        if (isFueled) {
            println("Drive on car")
        } else {
            println("Can't drive - no fuel")
        }
    }
}

// TODO: Write your own class, that implements Drivible, Fuelable and one your own Interface/Abstract class

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
        val car = Car()
        car.fill()
        car.drive()
    }
}