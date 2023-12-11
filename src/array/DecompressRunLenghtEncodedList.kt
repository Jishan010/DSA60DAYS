package array

fun main() {
    val nums = intArrayOf(1, 1, 2, 3)
    println(decompressRLElist(nums).toList().toString())
}

fun decompressRLElist(nums: IntArray): IntArray {
    val arrayMap = mutableMapOf<Int, Int>()

    var i = 0
    while (i < nums.size) {
        arrayMap[nums[i + 1]] = nums[i]
        i += 2
    }

    val list = mutableListOf<Int>()

    for ((key, value) in arrayMap) {
        var j = value
        while (j > 0) {
            list.add(key)
            j--
        }
    }
    return list.toIntArray()
}
