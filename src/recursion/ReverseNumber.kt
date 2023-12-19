package recursion

fun main() {/*reverseNumber(1234)
    println(sum)*/
    println(countOfZeros(302000204, 0))
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

// 30204
fun countOfZeros(n: Int, count: Int): Any {

    if (n % 10 == n) {
        return count
    }

    if (n % 10 == 0) {
        val updatedCount = count + 1
        return countOfZeros(n / 10, updatedCount)
    }
    return countOfZeros(n / 10, count)

}