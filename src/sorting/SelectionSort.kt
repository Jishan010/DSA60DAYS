package sorting


fun main() {
    sortArray(intArrayOf(5, 2, 3, 1, 1, 2)).forEach {
        print(it)
    }
}


fun sortArray(nums: IntArray): IntArray {
    for (i in 0 until nums.size - 1) {
        var minIndex = i
        var minValue = nums[i]
        for (j in i + 1 until nums.size) {
            if (minValue >= nums[j]) {
                minValue = nums[j]
                minIndex = j
            }
        }
        nums[i] = nums[minIndex].also {
            nums[minIndex] = nums[i]
        }
    }
    return nums
}
