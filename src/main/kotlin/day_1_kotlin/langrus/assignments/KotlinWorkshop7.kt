package day_1_kotlin.langrus.assignments

// Workshop #7 - list, mutable list, useful functions, maps

object KotlinWorkshop7 {

    @JvmStatic
    fun main(args: Array<String>) {

        // Не исправляй! Дано:
        val poem = arrayOf(
            "The", "leaves", "are", "falling",
            "One", "by", "one",
            "Summer’s", "over",
            "School’s", "begun"
        )



        /* Рабочая зона */

        // TODO 1: Раскомментируй.
        //  Инициализируй переменную с коллекцией чисел "evenList"
        //  и добавь в неё только чётные числа в диапазоне от 0 до 50, включая 0.
        /*
        val evenList = ...
        for (i in 0..50) {
        }
        println(evenList)
        */

        // TODO 2: Распечатай "poem" в двух вариантах:
        //  1. Только отфильтрованные слова длиной короче 5 символов;
        //  2. Все слова в обратном порядке.
        /*
        val filtered = ...
        val reversed = ...
        println(filtered)
        println(reversed)
        * */



        // Не исправляй! Дано:
        val weatherMap = mapOf(
            "Moscow" to 2,
            "St. Petersburg" to -1,
            "Minsk" to 4
        )



        /* Бонусные задания */

        // TODO 3. В погодную карту "weatherMap" добавь погоду в "Kiev" и в "Tel-Aviv".
//        weatherMap... =

        // TODO 4. Отфильтруй и выведи в консоль города с погодой выше +0С.
        //  Вызывай операторы один за другим, в виде "цепи" (chaining operators).
//        weatherMap
    }
}