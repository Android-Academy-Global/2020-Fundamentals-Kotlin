package day_1_kotlin.langrus.info

import java.util.logging.Logger

object C_HowToPrintResults {

    // Для того, чтобы увидеть результат в консоли используйте стандартные методы ввода вывода
    // и/или классы для логирования из SDK: функции print(), println() или logger

    // Консоль находится во вкладке "Run" в нижнем меню Intellij idea.

    @JvmStatic
    fun main(args: Array<String>) {
        println("message") // Строка
        println("message " + "other") // Конкатенация строк
        println("message " + 1) // Конкатенация разных объектов

        val value = "value"
        println("message $value") // Placeholder - заглушка для вывода результата при написании его напрямую в строке

        println("message ${Results().property}") // Placeholder с вычисляемым значением

        println("message value:" + value + ", property:${Results().property}")

        println("""
            |long
            |formatted
            |message
        """.trimIndent())

        try {
            // Код с ошибкой
        } catch (expected: Exception) {
            val log = Logger.getLogger("MyWorkshopLogger")
            log.throwing("Current class name", "someMethod()", expected)
        }
    }

    class Results {
        val property = "property"
    }
}