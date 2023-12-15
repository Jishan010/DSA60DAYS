package array.sliding_window


fun main() {

    val nums = intArrayOf(1, 0, 1, 1, 0)
    println(findMaxConsecutiveOnes(nums))
}


fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var i = 0
    var j = 0
    var countOfZeroes = 0
    var maxConsecutiveOnes = Integer.MIN_VALUE
    while (j < nums.size) {

        if (nums[j] == 0) {
            countOfZeroes++
        }

        if (nums[i] == 0) {
            countOfZeroes--
        }

        if (countOfZeroes == 2) {
            //do the work
            val windowSize = j - i + 1 - 1 ///last -1 is to remove zero count
            maxConsecutiveOnes = maxOf(maxConsecutiveOnes, windowSize)

            //slide the window
            i++
        } else {
            j++
        }
    }

    return maxConsecutiveOnes
}