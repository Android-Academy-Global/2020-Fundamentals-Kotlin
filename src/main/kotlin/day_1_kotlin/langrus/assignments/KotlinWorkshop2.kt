package day_1_kotlin.langrus.assignments

import java.util.*
import kotlin.random.Random

// Workshop #2 - control flow (if, when), arrays, for loop, if expression, return & jumps

object KotlinWorkshop2 {

    // Запусти исполнение main() функции, для выполнения кода.
    // См. подробнее в /../info/B_HowToRunProgram
    @JvmStatic
    fun main(args: Array<String>) {



        /* Рабочая зона */

        // Когда программа запущена, ввод с клавиатуры ожидается внизу, во вкладке RUN.
        // Кликни в зоне открытого окна и введи строку.
        // Не исправляй! Дано:
        val upperBound = getUpperBound()
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val scanner = Scanner(System.`in`)

        while (true) {
            // TODO 1: Напиши логику сравнения "userInput" с "randomNumber" используя If-Else выражение.
            //  Когда ввод с клавиатуры равен значению "randomNumber", прерви бесконечный цикл while
            //  используя ключевое слово "break" и выведи сообщение "Congratulations!"
            //  Если введено число меньше "randomNumber", выведи сообщение "Your Guess is higher, continue."
            //  Если введено число больше "randomNumber", выведи сообщение "Your Guess is higher, continue."

            print("Input a number in range 0..$nonNullUpperBound inclusive: ")
            // Сохраняем введённое с клавиатуры число в "userInput".
            val userInput: Int = scanner.nextInt()
            if (true) {

            }
        }



        /* Бонусные задания */

        // TODO 2: Раскомментируй. Проинициализируй "numbersArray".
        //  "numbersArray" это массив целочисленных значений, длинной 5 чисел.
//        val numbersArray =

        // TODO 3: Раскомментируй. Проинициализируй свойство "size" длинной массива "numbersArray".
        //  Измени условия повтора бесконечного цикла while так, чтобы он стал конечным и выполнился не более "size" раз.
        println("\nTraining 2. \"Fill in the collection\"")
//        val size =
        var counter = 0
        while (true) {
            print("Input a number in range 0..10 inclusive: ")
            val userInput: Int = scanner.nextInt()

            // TODO 4: Сохрани и добавь введённые с клавиатуры числа в массив "numbersArray" согласно следующей логики:
            //  - Если введено 3 - добавь число в массив без изменений;
            //  - Если введено 5 - умнож и добавь (5 * size);
            //  - Если введено 9 - сложи и добавь (2 + size);
            //  - Иначе не добавляй ничего.
            //  Используй выражение "When".
            when {

            }

            counter++
        }

        // TODO 5: Выведи в консоль значения элементов массива и индекс, на котором они находятся.
        //  Новый элемент на новой строке. Это должно выглядеть как "index value".

    }



    /* Для корректного прогона воркшопа, не модифицируй утилиты ниже */

    private fun getUpperBound(): Int? {
        println("Training 1. \"Guess a number\"")
        print("Enter maximum number in range 10..20 inclusive: ")
        val scanner = Scanner(System.`in`)
        return try {
            scanner.nextInt()

        } catch (e: InputMismatchException) {
            null
        }
    }
}