package array.hashmap

import kotlin.math.max


// kotlin way of printing count of occurrence in array for an element
fun main() {
    val array = intArrayOf(2, 3, 4, 5, 2, 3, 3, 2, 4, 7, 8, 7, 7)
    val result = array.groupBy { it }

    result.forEach { (key, value) ->
        println("$key -> ${value.size}")
    }

    println(result)
}


/*

fun main() {
    val nums = intArrayOf(100, 4, 200, 1, 3, 2)
    println(longestConsecutive(nums))
}
*/


fun longestConsecutive(nums: IntArray): Int {

    val set = mutableSetOf<Int>();
    nums.forEach { number ->
        set.add(number)

    }

    var maxStreak = 0
    set.forEach { number ->
        if (!set.contains(number - 1)) {
            var currentStreak = 1
            var current = number
            while (set.contains(current + 1)) {
                currentStreak++
                current += 1
            }
            maxStreak = max(maxStreak, currentStreak)
        }

    }

    return maxStreak
}
