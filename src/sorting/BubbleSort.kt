package sorting

fun main() {
    bubbleSortArray(intArrayOf(5, 2, 3, 1)).forEach {
        print(it)
    }
}

//function to sort array with bubble sort algorithm
fun bubbleSortArray(nums: IntArray): IntArray {
    var i = nums.size - 1
    while (i > 0) {
        for (j in 0 until i) {
            if (nums[j] > nums[j + 1]) {
                nums[j] = nums[j + 1].also {
                    nums[j + 1] = nums[j]
                }
            }
        }
        i--
    }
    return nums
}
