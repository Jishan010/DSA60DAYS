package Stack

import java.util.Stack


fun main() {
    val nums = intArrayOf(6, 8, 0, 1, 3)  //
    val result = getNextGreaterElementToRight(nums)
    println(result)
}


// 1 3 2 4
fun getNextGreaterElementToRight(array: IntArray): List<Int> {
    val stack = Stack<Int>()
    val list = mutableListOf<Int>()
    array.reversed().forEach { element ->
        if (stack.isEmpty()) {
            list.add(-1)
        } else if (stack.peek() > element) {
            list.add(stack.peek())
        } else {
            while (stack.isNotEmpty() && stack.peek() <= element) {
                stack.pop()
            }
            if (stack.isEmpty()) {
                list.add(-1)
            } else {
                list.add(stack.peek())
            }
        }
        stack.add(element)
    }
    return list.reversed()
}