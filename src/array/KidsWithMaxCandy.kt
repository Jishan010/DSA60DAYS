package array

// leetcode 1431
fun main() {
    val candies = intArrayOf(2, 3, 5, 1, 3)
    val result = kidsWithCandies(candies, 3)
    println(result.toString())
}


fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val resultArray = BooleanArray(candies.size)
    var max = Integer.MIN_VALUE
    candies.forEach {
        max = max.coerceAtLeast(it)
    }

    candies.forEachIndexed { index, value ->
        println("value :$value and index : $index")
        val currentCandies = value + extraCandies
        if (currentCandies < max) {
            resultArray[index] = false
        } else {
            resultArray[index] = true
        }
    }
    return resultArray.toList()
}