@file:Suppress("MayBeConstant", "unused", "UNUSED_VARIABLE")

package day_1_kotlin.langrus.assignments
// workshop #8 - const, companion object, extension func*

/*
 * Сокращаем телефон до максимально докустимой длины maxLength
 * и пишем функцию экстеншен на лист, которая заменяет каждый i-й элемент номером телефона
 */

// TODO 1: make maxLength const that is visible only inside the Person class
val maxLength = 12

// TODO 2: make companionConstant part of companion object
val companionConstant = 12

class Person(phoneCode: String) {

    val code = if (phoneCode.length > maxLength) phoneCode.subSequence(0, maxLength) else phoneCode

    companion object {
        // TODO 2
    }

    // * * * Bonus task * * * (work on home)

    //TODO 3: make this fun as extension to a list outside the Person class
    private fun replacePlacesWithThePhoneCode(list: List<Any>, placeNum: Int = 3): List<Any> {
        return list.mapIndexed { index, any -> if (index % placeNum == 0) code else any}
    }
}

fun main(){
    val list = mutableListOf("1", 3, 4, "Patrick", 3.4, "123-59")

    val p = Person("45-45-45")


    // TODO: uncomment after finishing TODO 1
    //  println(Person.maxLength)

    //TODO *: uncomment after doing function
    // lst.replacePlacesWithThePhoneCode(p, 4)
}

