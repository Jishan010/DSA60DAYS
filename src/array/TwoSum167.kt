package array

fun main() {
    val numbers = intArrayOf(-1, 0)
    val target = -1
    val result = twoSum(numbers, target)
    println(result.asList().toString())
}

fun twoSum(numbers: IntArray, target: Int): IntArray {

    var start = 0
    var end = numbers.size - 1

    while (start <= end) {
        val totalSum = numbers[start] + numbers[end]
        when {
            totalSum == target -> {
                return intArrayOf(start + 1, end + 1)
            }

            totalSum > target -> {
                end--
            }

            else -> {
                start++
            }
        }
    }

    return intArrayOf()
}