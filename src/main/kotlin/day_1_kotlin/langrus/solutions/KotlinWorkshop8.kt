package day_1_kotlin.langrus.solutions

// workshop #8 - const, companion object, extension func


fun main(){
    val lst = mutableListOf("1", 3, 4, "Patrick", 3.4, "123-59")

    val p = Person("45-45-45")

    lst.replacePlacesWithThePhoneCode(p, 4)
}


class Person(phoneCode: String) {
    val code = if (phoneCode.length > maxLengthDone) phoneCode.subSequence(0, maxLengthDone) else phoneCode

    companion object {
        private const val maxLengthDone = 12
    }
}

fun List<Any>.replacePlacesWithThePhoneCode(person: Person, placeNum: Int = 3) {
    this.mapIndexed { index, any -> if (index % placeNum == 0) person.code else any}
}