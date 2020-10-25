package day_1_kotlin.solutions

// Workshop #5 - special classes, objects, data classes

// TODO 1: add 2-4 fields to the data class
data class VideoGame(val name: String, val year: Int, val genre: Genre)

// TODO 2: create on object that will be used to test the games, call it "VideoGamesTest"
object VideoGameTest {

    @JvmStatic
    fun main(args: Array<String>) {
        // TODO 3: create an instance of VideoGame, make a copy via .copy() method and
        //  put the copy to another variable
         val game = VideoGame("Heroes of Might and Magic III", 1999, Genre.STRATEGY)
         val copy = game.copy()

        // TODO 4: print out if those data class objects are equal (use "==" for comparison)
        val equal = game == copy
        println("Objects are equal $equal")

        // TODO 5: put several data class objects into an array and print them out
        val games = arrayOf(game, game.copy(name = "Heroes 4", year = 2002), VideoGame("NFS", 2000, Genre.RACING))
        games.forEach {
            println(it)
        }
    }
}

// TODO 6: create a enum Genre with a few values, and add it as a field to the VideoGame
enum class Genre {
    STRATEGY,
    RACING,
    ACTION
}

// * * * Bonus task * * * (work on home)
// Create a new class hierarchy for an arbitrary topic