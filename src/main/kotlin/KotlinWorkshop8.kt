// workshop #8 - const, companion object, extension func


fun main(){
    val lst = mutableListOf("1", 3, 4, "Patrick", 3.4, "123-59")

    val p = Person("45-45-45")

    //TODO: uncomment after doing function
    //lst.replacePlacesWithThePhoneCode(p, 4)
}

// TODO: make maxLength const that is visible only inside the Person class
val maxLength = 12

class Person(phoneCode: String) {
    val code = if (phoneCode.length > maxLength) phoneCode.subSequence(0, maxLength) else phoneCode

    //TODO: make this fun as extension to a list outside the Person class
    private fun replacePlacesWithThePhoneCode(list: List<Any>, placeNum: Int = 3) {
        list.mapIndexed { index, any -> if (index % placeNum == 0) code else any}
    }
}



//======================================================================

class PersonDone(phoneCode: String) {
    val code = if (phoneCode.length > maxLengthDone) phoneCode.subSequence(0, maxLengthDone) else phoneCode

    companion object {
        private const val maxLengthDone = 12
    }
}

//TODO: make this fun as extension to a list outside the Person class
fun List<Any>.replacePlacesWithThePhoneCode(person: Person, placeNum: Int = 3) {
    this.mapIndexed { index, any -> if (index % placeNum == 0) person.code else any}
}