package array

fun main() {
    val arr1 = intArrayOf(2, 3, 5, 6)
    val arr2 = intArrayOf(1, 4, 2, 8)

    println(findDifference(arr1, arr2))
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