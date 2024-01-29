package sorting

fun main() {
    bubbleSortArray(intArrayOf(5, 6, 7, 8, 8, 9, 19, 1, 15, 20)).forEach {
        println(it)
    }
}

//function to sort array with bubble sort algorithm
fun bubbleSortArray(nums: IntArray): IntArray {
    var i = nums.size - 1
    while (i > 0) {
        var swapped = false
        for (j in 0 until i) {
            if (nums[j] > nums[j + 1]) {
                swapped = true
                nums[j] = nums[j + 1].also {
                    nums[j + 1] = nums[j]
                }
            }
        }
        if (!swapped) {
            break
        }
        i--
    }
    return nums
}
