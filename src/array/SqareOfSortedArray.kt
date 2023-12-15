package array

fun main() {
    val nums = intArrayOf(-5, -3, -2, -1)
    sortedSquares(nums)
}

fun sortedSquares(nums: IntArray): IntArray {

    var i = 0
    var j = nums.size - 1
    while (j >= 0) {
        val startSquare = nums[i] * nums[i]
        val endSquare = nums[j] * nums[j]

        if (endSquare >= startSquare) {
            nums[j] = endSquare
            j--
        } else {
            nums[i] = nums[j]
            nums[j] = startSquare
            j--
        }
    }

    return nums
}