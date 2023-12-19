package recursion


fun main() {
    val result = fib(6)
    println(result)
}

fun fib(n: Int): Int {
    if (n <= 1) {
        return n
    }
    val lastFib = fib(n - 1)
    val secondLastFib = fib(n - 2)
    return lastFib + secondLastFib
}
