package array

import kotlin.math.max

fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1)
    findMaxConsecutiveOnes(nums)
}

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var i = 0
    var maxConsecutiveCount = Integer.MIN_VALUE
    var count = 0
    while (i < nums.size) {
        if (nums[i] == 1) {
            count++;
            maxConsecutiveCount = max(maxConsecutiveCount, count);
        } else {
            count = 0;
        }
        i++
    }

    return maxConsecutiveCount
}