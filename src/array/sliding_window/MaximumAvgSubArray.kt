package array.sliding_window

import kotlin.math.max

//LC : 643

fun main() {
    val array = intArrayOf(-1)
    val k = 1
    println(findMaxAverage(array, k))
}

// average formula total of number of elements divide by total numbers


fun findMaxAverage(nums: IntArray, k: Int): Double {

    var totalSum = 0.0

    var maxAvg = Integer.MIN_VALUE.toDouble()
    var i = 0
    var j = 0

    while (j < nums.size) {

        // do calculations for total sum
        totalSum += nums[j]
        val windowSize = j - i + 1
        if (windowSize < k) {
            j++
        } else if (windowSize == k) {

            // do main work of calculating avg
            val avg = totalSum / k
            maxAvg = max(avg.toDouble(), maxAvg)

            //slide window but beofre doing that remove the calculation for last i index
            totalSum -= nums[i]
            j++
            i++
        }
    }
    return maxAvg
}