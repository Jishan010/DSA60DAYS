package recursion

fun main() {
    //  println(fact(5))
    val n = 1234
    println(sumOfDigits(n))
}

fun printNumber(n: Int) {
    if (n < 1) {
        return
    }
    println("$n")
    printNumber(n - 1)
    println("$n")
}


fun fact(n: Int): Int {
    if (n == 1) {
        return 1
    }
    return n * fact(n - 1)
}

fun sumOfDigits(n: Int): Int {
    if (n == 0) return 0

    val remaining = n / 10
    val remainder = n % 10

    return remainder + sumOfDigits(remaining)
}

