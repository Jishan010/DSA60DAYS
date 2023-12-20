package Stack

import java.util.Stack

fun main() {
    println(isValid(")(){}[]("))
}

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()

    for (char in s) {
        when (char) {
            '(', '{', '[' -> stack.addLast(char)
            ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
            '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
            ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
        }
    }

    return stack.isEmpty()
}