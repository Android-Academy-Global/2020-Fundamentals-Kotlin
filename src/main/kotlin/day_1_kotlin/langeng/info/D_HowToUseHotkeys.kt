package day_1_kotlin.langeng.info

object D_HowToUseHotkeys {

    /*
    * Intellij idea and Android studio have a lot of templates, shortcuts and hot keys.
    * And is very flexible and customizable. There are several of them:
    * */

    // For a fast jump to a method or variable,
    // place a cursor on it and press "Ctrl+B"
    private fun jumpToMethod() {
    }

    // For a fast jump to the place where you just modified the code,
    // press "Ctrl+Shift+Backspace".
    // ---> Write something, place cursor to a different place, press combo.

    // To memorize several places you are working,
    // place cursor to the line and press "Ctrl+Shift+[1..9]".
    // For a jump, press "Ctrl+[1..9]"

    // For a fast jump to a line (go to the line),
    // press "Ctrl+G" and enter the number.

    // To see a description,
    // which types of arguments you have to provide to a function, or what type this function returns,
    // place a cursor on it and press "Ctrl+Q"
    private fun seeTheArgTypes() {
        hiddenArgsContainer(1, "2", 3)
    }

    // One of the "auto-complete" combos is "Alt+Enter".
    // Start typing a class name, method, or class property and hit combo to see a suggestion.

    // To fast line copy, press "Ctrl+C" at any place of the line

    // To fast line copy and cut, press "Ctrl+X" at any place of the line

    // To duplicate a current line,
    // place a cursor to the line and press "Ctrl+D"

    // To insert a new line below the current line,
    // press "Shift+Enter"

    // To move a line upper or lower,
    // place cursor to the line, press "Alt+Shift" and move line with Up or Down arrows.

    @JvmStatic
    fun main(args: Array<String>) {
        jumpToMethod()
    }

    private fun hiddenArgsContainer(a: Int, b: String, c: Any) {
    }
}