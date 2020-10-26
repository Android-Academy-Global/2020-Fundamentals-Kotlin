package day_1_kotlin.langrus.solutions

// Workshop #5 - inheritance, abstract, interface

// Не исправляй! Дано:
// Объявляем контракт, представляющий некое свойство транспорта.
interface Driveable {
    fun drive()
}

// Объявляем класс пассажирского транспорта вцелом.
// Придадим такому транспорту свойство перемещаться под управлением водителя.
abstract class Transport(protected var passengersCount: Int): Driveable

// Создадим реальный транспорт: "Велосипед". Он может управляться водителем и перевозит одного пассажира.
class Bicycle: Transport(1) {
    override fun drive() {
        println("Ride a bicycle.")
    }
}



/* Рабочая зона */

// TODO 1: Создай свой интерфейс - контракт, который бы также подошел по смыслу классу транспорт.
//  См. ниже.
// ? Имена классов и файлов Котлин принято называть с заглавной буквы, в формате "camelCase".
// Например: "SomeLongClassName"
interface Fuelable {
    fun isFull(): Boolean
    fun fuel()
}

// TODO 2: Создай свои собственные классы, например "Bus" и "Car".
//  Эти классы не будут полностью написаны с нуля, они должны расширять общий класс "Transport",
//  и дополнительно реализовывать придуманный тобой интерфейс.
// ? Класс может наследовать только один класс, но реализовывать несколько интерфейсов, например:
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

// TODO 2: Создай свои собственные классы, например "Bus" и "Car".
//  Эти классы не будут полностью написаны с нуля, они должны расширять общий класс "Transport",
//  и дополнительно реализовывать придуманный тобой интерфейс.
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

// TODO 3: Протестируй работоспособность твоего транспорта.
object VehiclesTest {

    // Запусти исполнение main() функции, для выполнения кода.
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



    /* Бонусные задания */

    // TODO 4: Протестируй агрегаты автобуса, как независимые компоненты.
    //  Т.е. каждый набор независимых свойств - отдельно, чтобы в тестируемой сущности были скрыты все свойства,
    //  не принадлежащие к данному набору.
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