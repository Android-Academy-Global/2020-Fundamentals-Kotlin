package day_1_kotlin.langrus.solutions

import java.util.*

// Workshop #1 - val, var, null, kotlin null safety, Elvis operator

object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {

        // Инициализация переменных. Обрати внимание, они могут принимать значение null.
        // Не исправляй! Дано:
        val nullableElvisString: String? = null
        val nullableAssertionString: String? = "potentially null"
        val emptyString = ""



        /* Рабочая зона */

        // TODO 1: Раскомментируй.
        //  Присвой "notNullUserString" значение из "nullableElvisString".
        //  Если "nullableElvisString" null, сделай значение "notNullUserString" равным значению пустой строки "emptyString".
        //  Исправить присвоение используя Элвис-оператор "?:".
        var notNullUserString: String = nullableElvisString ?: emptyString
        println("Result string is empty $notNullUserString")

        // TODO 2: Раскомментируй.
        //  По факту мы знаем, что значение "nullableAssertionString" не равно null (см. строку 15).
        //  Сделай принудительное присвоение используя !! оператор.
        notNullUserString = nullableAssertionString!!
        println("Result string is $notNullUserString")



        /* Бонусные задания */

        // TODO 3: Раскомментируй. Сложи две переменные.
        //  Если "firstNumber" null, сумма должна быть null. Если secondNumber null, сумма должна быть равна значение "firstNumber".
        //  Используй проверку на null '?', для сложения используй функцию '.plus()'. Внутри '.plus()' используй '?:'.
        val notNullAlternative = 0
        val firstNumber: Int? = 10
        val secondNumber: Int? = 20
        val sum : Int? = firstNumber?.plus(secondNumber ?: firstNumber)
        println("Sum is {$sum}")


        // TODO 4: Раскомментируй. Сохрани строку введённую с клавиатуры в переменную "stringInput".
        // Когда программа запущена, ввод с клавиатуры ожидается внизу, во вкладке RUN.
        // Кликни в зоне открытого окна и введи строку.
        print("Please, input a string: ")
        val stringInput: String? = MyScanner.scan.next() // <--- string input 1

        // TODO 5: Раскомментируй.
        //  Сохрани значения чисел введённух с клавиатуры в переменные "firstIntInput" и "secondIntInput".
        //  Сохраните сумму введенных чисел в "sumIntInputs". Вместо потенциального 'null' подставьте значение по умолчанию.
        //  Используй проверку на null '?', для сложения используй функцию '.plus()'. Внутри '.plus()' используй '?:'.
        // Когда программа запущена, ввод с клавиатуры ожидается внизу, во вкладке RUN.
        // Кликни в зоне открытого окна и введи строку.
        print("Please, input a number: ")
        val firstIntInput: Int? = MyScanner.scan.nextInt() // <--- вводим первое число
        print("Please, input a second number: ")
        val secondIntInput: Int? = MyScanner.scan.nextInt() // <--- вводим второе число
        val sumIntInputs : Int? = firstIntInput?.plus(secondIntInput ?: notNullAlternative) // <--- делаем замену потенциального 'null' значением по умолчанию
        println("String:$stringInput, Summ of numbers:$sumIntInputs")



        /* Примеры */

        val number: Int = -1
        val someNumber: Double = 2.5
        val someString: String = "Hello world"
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