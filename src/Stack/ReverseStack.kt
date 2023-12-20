package Stack

import java.util.*

val stack = Stack<Int>()
fun main() {

    // Default initialization of Stack

    stack.push(5)
    stack.push(4)
    stack.push(3)
    stack.push(2)
    stack.push(1)

    println(stack.toString())
    resverseStack()
    println(stack.toString())
}

fun resverseStack() {
    if (stack.isEmpty()) {
        return
    }
    val item = stack.pop()
    // println(item)
    resverseStack()
    putElementInStack(item)
}

fun putElementInStack(item: Int) {

    if (stack.isEmpty()) {
        stack.push(item)
    } else {
        val a = stack.pop()
        putElementInStack(item)
        stack.push(a)
    }
}

