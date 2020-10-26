@file:Suppress("RedundantNullableReturnType", "RedundantExplicitType", "UNUSED_VARIABLE")

package day_1_kotlin.langrus.solutions

import java.util.*

// Практическая работа #1 - val, var, null, kotlin null безопасность, Элвис оператор

object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {

        // Инициализация переменных. Обрати внимание, они могут принимать значение null.
        // Не исправляй! Дано:
        val nullableElvisString: String? = null
        val nullableAssertionString: String? = "потенциально null"
        val emptyString = ""


        /* Рабочая зона */

        // TODO 1: Раскомментируй.
        //  Если "nullableElvisString" равно null, сделай значение "notNullUserString" равным значению пустой строки "emptyString".
        //  Присвой "notNullUserString" значение из "nullableElvisString". Исправиь присвоение используя Элвис-оператор.
        //  Исправить присвоение используя Элвис-оператор "?:".
        var notNullUserString: String = nullableElvisString ?: emptyString
        println("Строка результат пустая $notNullUserString")

        // TODO 2: Раскомментируй.
        //  По факту мы знаем, что значение "nullableAssertionString" не равно null (см. строку 17).
        //  Сделай принудительное присвоение используя !! оператор.
        notNullUserString = nullableAssertionString!!
        println("Строка результат равна $notNullUserString")


        /* Бонусные задания */

        // TODO 3: Раскомментируй. Сложи две переменные.
        //  Если firstNumber равно null, сумма должна быть null. Если secondNumber равно null, сумма должна быть равна значение firstNumber.
        //  Используй проверку на null '?', для сложения используй функцию '.plus()'. Внутри '.plus()' используй '?:'.
        val notNullAlternative = 0
        val firstNumber: Int? = 10
        val secondNumber: Int? = 20
        val sum: Int? = firstNumber?.plus(secondNumber ?: firstNumber)
        println("Сумма равна {$sum}")


        // TODO 4: Раскомментируй. Сохрани строку введённую с клавиатуры в переменную "stringInput".
        // Когда программа запущена, ввод с клавиатуры ожидается внизу, во вкладке RUN.
        // Кликни в зоне открытого окна и введи строку.
        print("Пожалуйста введите строку: ")
        val stringInput: String? = MyScanner.scan.next() // <--- string input 1

        // TODO 5: Раскомментируй.
        //  Сохрани значения чисел введённух с клавиатуры в переменные "firstIntInput" и "secondIntInput".
        //  Сохраните сумму введенных чисел в "sumIntInputs". Вместо потенциального 'null' подставьте значение по умолчанию.
        //  Используй проверку на null '?', для сложения используй функцию '.plus()'. Внутри '.plus()' используй '?:'.
        // Когда программа запущена, ввод с клавиатуры ожидается внизу, во вкладке RUN.
        // Кликни в зоне открытого окна и введи строку.
        print("Пожалуйста введите первое число: ")
        val firstIntInput: Int? = MyScanner.scan.nextInt() // <--- вводим первое число
        print("Пожалуйста введите второе число: ")
        val secondIntInput: Int? = MyScanner.scan.nextInt() // <--- вводим второе число
        val sumIntInputs: Int? = firstIntInput?.plus(
            secondIntInput ?: notNullAlternative
        ) // <--- делаем замену потенциального 'null' значением по умолчанию
        println("Исходная строка: $stringInput, Сумма чисел: $sumIntInputs")


        /* Примеры */

        val number: Int = -1
        val someNumber: Double = 2.5
        val someString: String = "Привет, мир!"
        val someFlag: Boolean = true
        var someNullableNumber: Long? = null
    }
}


/* Для корректного прогона воркшопа не модифицируй утилиты ниже */

class MyScanner {
    companion object {
        val scan = Scanner(System.`in`)
    }
}