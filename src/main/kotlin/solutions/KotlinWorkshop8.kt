package solutions// workshop #8 - const, companion object, extension func


fun main(){
    val lst = mutableListOf("1", 3, 4, "Patrick", 3.4, "123-59")

    val p = PersonDone("45-45-45")

    lst.replacePlacesWithThePhoneCode(p, 4)
}


class PersonDone(phoneCode: String) {
    val code = if (phoneCode.length > maxLengthDone) phoneCode.subSequence(0, maxLengthDone) else phoneCode

    companion object {
        private const val maxLengthDone = 12
    }
}

//TODO: make this fun as extension to a list outside the Person class
fun List<Any>.replacePlacesWithThePhoneCode(person: PersonDone, placeNum: Int = 3) {
    this.mapIndexed { index, any -> if (index % placeNum == 0) person.code else any}
}