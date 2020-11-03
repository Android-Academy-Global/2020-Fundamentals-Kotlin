package day_1_kotlin.langeng.solutions

// workshop #8 - const, companion object, extension func


fun main(){
    val list = mutableListOf("1", 3, 4, "Patrick", 3.4, "123-59")

    val p = Person("45-45-45")

    println("list:$list, code:${p.code}")
    val changedList = list.replacePlacesWithThePhoneCode(p, 4)
    println("changedList:$changedList")
}


class Person(phoneCode: String) {
    val code = if (phoneCode.length > maxLengthDone) phoneCode.subSequence(0, maxLengthDone) else phoneCode

    companion object {
        private const val maxLengthDone = 12
    }
}

fun List<Any>.replacePlacesWithThePhoneCode(person: Person, placeNum: Int = 3): List<Any> {
    return this.mapIndexed { index, any -> if (index % placeNum == 0) person.code else any}
}