package day_1_kotlin.langeng.info

/**
 * This is Class java-doc.
 * Place cursor onto the class name [A_HowToComment] and press ctrl+Q.
 * You may comment classes, functions, etc.
 */
object A_HowToComment {

    // Commented code ignored by compiler.

    // How to comment:

    // 1. Use double slash in the beginning of the string. One line comment:
    // val commented = "ignored"
    // Place cursor on any position in the line 17 and press Ctrl+/
    val plzCommentMe = "null"

    // 2. Surround part of code with /**/
    val commented = /*"ignored"*/ "not ignored"

    // 3a. Surround multiple lines with /**/
    /*
    * val firstLine = "ignored"
    * val secondLine = "ignored"
    * */

    // 3b. Or like this:
    /*
    val firstLine = "ignored"
    val secondLine = "ignored"
    */

    // 4. These are common reserved words to highlight tasks:
    // TODO
    // FIXME
    // i.e. FIXME AuthorName 10/26/2020: have to refactor something
}