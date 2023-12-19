package recursion

fun main() {
    reverseNumber(1234)
    println(sum)
}

var sum = 0
fun reverseNumber(n: Int) {
    if (n == 0) {
        return
    }
    val rem = n % 10
    sum = sum * 10 + rem
    reverseNumber(n / 10)
}