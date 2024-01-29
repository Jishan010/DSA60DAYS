package sorting


fun main() {
    insertionSortArray(intArrayOf(5, 2, 3, 1)).forEach {
        print(it)
    }
}


fun insertionSortArray(nums: IntArray): IntArray {
    var i = 1;
    while (i < nums.size) {
        val temp = nums[i]
        var j = i - 1
        while (j >= 0) {
            if (nums[j] >= temp) {
                nums[j + 1] = nums[j]
            } else {
                break
            }
            j--
        }
        nums[j + 1] = temp
        i++
    }
    return nums
}
