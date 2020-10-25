package day_1_kotlin.langrus.solutions

// Workshop #7 - list, mutable list, useful functions, maps

object KotlinWorkshop7 {

    @JvmStatic
    fun main(args: Array<String>) {

        // Не исправляй! Дано:
        val poem = arrayOf(
            "Истинное счастье доступно",
            "Лишь только тогда, когда всё хорошо",
            "Я не верю что добро существует",
            "На самом деле",
            "Реальность",
            "Определяет",
            "Восприятие",
            "Ничто мне неподвластно",
            "И я никогда не скажу что",
            "Сегодня был прекрасный день"
        )



        /* Рабочая зона */

        // TODO 1: Распечатай "poem" в двух вариантах:
        //  1. Только отфильтрованные строки длиной короче 12 символов;
        //  2. Все строки в обратном порядке.
        val filtered = poem.filter { it.length < 12 }
        val reversed = poem.reversed()
        println("\nFiltered: $filtered")
        println("\nReversed:")
        reversed.forEach { println(it) }
        println("\n")

        // TODO 2: Раскомментируй.
        //  Инициализируй переменную с коллекцией чисел "evenList"
        //  и добавь в неё только чётные числа в диапазоне от 0 до 50, включая 0.
        val evenList = mutableListOf<Int>()
        for (i in 0..50 step 2) {
            evenList.add(i)
        }
        println("\nEven numbers: $evenList")



        // Не исправляй! Дано:
        val weatherMap = mutableMapOf(
            "Moscow" to 2,
            "St. Petersburg" to -1,
            "Minsk" to 4
        )



        /* Бонусные задания */

        // TODO 3. В погодную карту "weatherMap" добавь погоду в "Kiev" и в "Tel-Aviv".
        weatherMap["Kiev"] = 6
        weatherMap["Tel-Aviv"] = 20

        // TODO 4. Отфильтруй и выведи в консоль города с погодой выше +0С.
        //  Вызывай операторы один за другим, в виде "цепи" (chaining operators).
        weatherMap.filter {
            it.value > 0
        }.forEach {
            println("City ${it.key} has temperature of ${it.value}")
        }
    }
}