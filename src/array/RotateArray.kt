package array

//LC - 189
fun main() {
    val nums = intArrayOf(1, 2)
    val k = 3
   // print(16 % 7)
     rotate(nums, k)
}

fun rotate(nums: IntArray, m: Int): Unit {
    val k = m % nums.size
    if (nums.size <= 1) {
        return
    }

    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, k - 1)
    reverse(nums, k, nums.size - 1)
    println(nums.asList().toString())
}

fun reverse(nums: IntArray, i: Int, j: Int) {
    var start = i
    var end = j
    while (start <= end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
}