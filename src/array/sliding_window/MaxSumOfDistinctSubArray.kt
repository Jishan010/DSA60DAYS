package array.sliding_window

import kotlin.math.max

//LT : 2561
fun main() {
      val nums = intArrayOf(9, 9, 9, 1, 2, 3)
      val k = 3
      val result = maximumSubarraySum(nums, k)
      println(result)

   /* val stack = ArrayDeque<Int>()

    // Push elements onto the stack
    stack.addLast(10)
    stack.addLast(20)
    stack.addLast(30)

// Accessing the top element
    val topElement = stack.first()
    println(topElement) // Output: 30

// Popping elements from the stack
    val poppedElement = stack.removeFirst()
    println(poppedElement) // Output: 30

// Check if the stack is empty
    val isEmpty = stack.isEmpty()
    println(isEmpty) // Output: false

// Print the remaining elements in the stack
    println(stack) // Output: [20, 10]*/
}

fun maximumSubarraySum(nums: IntArray, k: Int): Long {
    var sum: Long = 0
    var maxSum: Long = 0
    var i = 0
    var j = 0
    val hs = HashSet<Int>()

    while (j < nums.size) {
        if (j - i < k && hs.size < k) {
            while (hs.isNotEmpty() && hs.contains(nums[j])) {
                sum -= nums[i]
                hs.remove(nums[i])
                i++
            }
            sum += nums[j]
            hs.add(nums[j])
            j++
        } else {
            if (j - i == k && hs.size == k) {
                maxSum = maxOf(maxSum, sum)
            }
            sum -= nums[i]
            hs.remove(nums[i])
            i++
        }
    }

    if (j - i == k && hs.size == k) {
        maxSum = maxOf(maxSum, sum)
    }

    return maxSum
}
