package day_1_kotlin.langeng.assignments

// workshop #9 - generics
/*
 * Класс программиста, который может учить и забывать концепты на определенном языке.
 */

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
    // should be equal to 2
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
