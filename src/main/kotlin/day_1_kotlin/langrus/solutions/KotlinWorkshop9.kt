package day_1_kotlin.langrus.solutions

// workshop #9 - generics

fun main() {
    val p = ProgrammerDone<Kotlin>()

    p.learn(Kotlin("basics"))

    p.learn(Kotlin("generics"))
    p.learn(Kotlin("coroutines"))

    // should be equal to 3
    println(p.howManyConceptsDoIKnow())

    //should be Kotlin(element=coroutines)
    println(p.lastConcept())

    p.forget(Kotlin("generics"))
    // should be equal to 3
    println(p.howManyConceptsDoIKnow())
}


interface Language{
    val element: String
}

data class JavaLanguage(override val element: String) : Language
data class Kotlin(override val element: String): Language
data class Swift(override val element: String): Language
data class C_Sharp(override val element: String): Language


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