package recursion

fun main() {
    println(numberOfSteps(8))
}

fun numberOfSteps(num: Int): Int {
    return helper(num, 0)
}

fun helper(num: Int, count: Int): Int {
    if (num == 0) {
        return count
    }
    if (num % 2 == 0) {
        return helper(num / 2, count + 1)
    }
    return helper(num - 1, count + 1)
}