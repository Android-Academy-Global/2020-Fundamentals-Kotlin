package day_1_kotlin.langrus.solutions

// Workshop #6 - special classes, objects, data classes



/* Рабочая зона */

// TODO 1: Добавь в data class 2-4 свойства.
data class VideoGame(
    val name: String,
    val year: Int,
    val genre: Genre /* добавится только после TODO 6 */,
    val rate: Int = 5 /* добавится только после TODO 7 */
)

// TODO 2: Создай объект "VideoGamesTest", который будет использоваться для тестирования игр.
object VideoGameTest {

    @JvmStatic
    fun main(args: Array<String>) {
        // TODO 3: Создай экземпляр класса "VideoGame".
        //  Создай копию игры с помощью функции ата класса ".copy()", сохрани копию в другой переменной.
         val game = VideoGame("Heroes of Might and Magic III", 1999, Genre.STRATEGY)
         val copy = game.copy()

        // TODO 4: Выведи в консоль результат сравнения игры и её копии, используя оператор сравнения "==".
        //  Результат должен быть типа Boolean "true".
        val equal = game == copy
        println("Objects are equal $equal")

        // TODO 5: Создай массив игр. В момент создания, наполни его несколькими играми и массив в консоль.
        val games = arrayOf(
            game,
            game.copy(name = "Heroes 4", year = 2002),
            VideoGame("NFS", 2000, Genre.RACING)
        )
        games.forEach {
            println(it)
        }



        /* Примеры */

        // TODO 6, TODO 7
        val dn3d = VideoGame(
            name = "Duke Nukem 3D",
            year = 1996,
            genre = Genre.ACTION
        )
        println("\n" + dn3d)
    }
}



/* Бонусные задания */

// TODO 6: Создай "enum class", назови его "Genre", добавь в него несколько вариантов значений.
//  Добавь его, как новое свойство класса "VideoGame".
//  Поправь созданные сущности видеоигр в коде коде воркшопа.
//  Запусти выполнение функции "main()" и посмотри результат.
enum class Genre {
    STRATEGY,
    RACING,
    ACTION
}

// TODO 7: Добавь новое свойство класса "VideoGame", присвой ему значение "по-умолчанию".
//  Как ты можешь убедиться, новое свойство со значением "по-умолчанию" не требует делать исправлений в таком коде.
//  Но надо помнить, что поведение созданных сущностей может измениться.
//  Запусти выполнение функции "main()" и посмотри результат.