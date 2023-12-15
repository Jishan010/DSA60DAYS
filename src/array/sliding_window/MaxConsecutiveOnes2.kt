package array.sliding_window

//LC : 487
fun main() {

    val nums = intArrayOf(1, 0, 1, 1, 0)
    println(findMaxConsecutiveOnes(nums))
}

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var i = 0
    var j = 0
    var countOfZeroes = 0
    var maxConsecutiveOnes = 0 // Initialize to 0

    while (j < nums.size) {
        if (nums[j] == 0) {
            countOfZeroes++
        }

        // If there are more than one 0 in the window, shrink the window
        while (countOfZeroes > 1) {
            if (nums[i] == 0) {
                countOfZeroes--
            }
            i++
        }

        // Calculate window size
        maxConsecutiveOnes = maxOf(maxConsecutiveOnes, j - i + 1)
        j++
    }
    return maxConsecutiveOnes
}
