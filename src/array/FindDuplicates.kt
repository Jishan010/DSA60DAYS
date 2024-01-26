package array

fun main() {/*  val arr1 = intArrayOf(2, 3, 5, 6)
      val arr2 = intArrayOf(1, 4, 2, 8)

      println(findDifference(arr1, arr2))*/
    println(isAnagram("hello", "lolehh"))
}

fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val firstSet = nums1.toMutableSet()
    val secSet = nums2.toMutableSet()
    var answer0 = mutableListOf<Int>()

    for (num in firstSet) {
        if (!secSet.contains(num)) {
            answer0.add(num)
        } else {
            secSet.remove(num)
        }
    }
    return mutableListOf(answer0, secSet.toList())
}

fun isAnagram(s1: String, s2: String): Boolean {

    if (s1.length != s2.length) return false

    val hashMap = mutableMapOf<Char, Int>()
    for (char in s1.toCharArray()) {
        hashMap[char] = hashMap.getOrDefault(char, 0) + 1
    }

    for (char in s2.toCharArray()) {
        if (hashMap.containsKey(char)) {
            val elemt = hashMap[char]
            if (elemt != null) {
                if (elemt > 1) {
                    hashMap[char] = hashMap[char]!! - 1
                } else {
                    hashMap.remove(char)
                }
            }
        }
    }

    return hashMap.isEmpty()
}