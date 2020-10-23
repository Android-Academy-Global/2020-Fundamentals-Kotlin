import java.util.*
import kotlin.collections.AbstractList
import kotlin.random.Random

// workshop #9 - generics

fun main() {
    val p = Programmer<Kotlin>()

    //TODO: uncomment all
//    p.learn(Kotlin("basics"))
//
//    p.learn(Kotlin("generics"))
//    p.learn(Kotlin("coroutines"))

    println(p.howManyConceptsDoIKnow())
    // should be equal to 3

    println(p.lastConcept())
    //should be Kotlin(element=coroutines)

//    p.forget(Kotlin("generics"))
    println(p.howManyConceptsDoIKnow())
    // should be equal to 3
}


class Programmer<T: Language>() {

    fun howManyConceptsDoIKnow(): Int = TODO()

    // TODO: add "learn" function with new concept

    //TODO: add "forget" function with one concept to forget

    fun lastConcept(): T = TODO()
}

interface Language{
    val element: String
}

data class JavaLanguage(override val element: String) : Language
data class Kotlin(override val element: String): Language
data class Swift(override val element: String): Language
data class C_Sharp(override val element: String): Language


//===========================================================


class ProgrammerDone<T: Language>() {

    private val concepts = mutableListOf<T>()

    fun howManyConceptsDoIKnow(): Int = concepts.size

    fun learn(concept: T) {
        concepts.add(concept)
    }

    fun forget(concept: T) {
        concepts.remove(concept)
    }

    fun lastConcept(): T = concepts.last()
}