package day_1_kotlin.assignments

// Workshop #4 - classes

class Bus(val passengersCount: Int) {

    fun drive() {
        println("Driving $passengersCount passengers to the destination")
    }
}

object BusTestFinal {

    @JvmStatic
    fun main(args: Array<String>) {
        testBus()
    }

    private fun testBus() {
         val bus = Bus(10)

         bus.drive()
    }
}