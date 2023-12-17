package array.sliding_window

import kotlin.math.max


fun main() {
    val value = "bbbbb"
    println(lengthOfLongestSubstring(value))
}

fun lengthOfLongestSubstring(s: String): Int {
    val arr = s.toCharArray()
    var i = 0
    var j = 0
    var lengthOfLongestSubrstring = 0
    val map = mutableMapOf<Char, Int>()
    while (j < arr.size) {
        map[arr[j]] = map.getOrDefault(arr[j], 0) + 1;

        while (map[arr[j]]!! > 1) {
            val left = arr[i]
            map[left] = map[left]!! - 1;
            i++
        }
        // calculate the window size
        lengthOfLongestSubrstring = max(lengthOfLongestSubrstring, j - i + 1)

        j++
    }
    return lengthOfLongestSubrstring
}