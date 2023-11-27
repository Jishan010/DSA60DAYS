package array.hashmap


fun main() {
    val hashmap = HashMap<Int, String>()
    hashmap[1] = "Jishan"
    hashmap[2] = "Ansari"
    hashmap[3] = "Gulista"

    println(hashmap[3])

    val hashSet = HashSet<Int>()
    hashSet.add(1)
    hashSet.add(2)
    hashSet.add(3)

    hashSet.forEach {
        println(it)
    }


    val randomNums = intArrayOf(1, 2, 3, 4, 9, 5, 8, 9)
    val numsSet = mutableSetOf<Int>()
    randomNums.forEach {
        val success = numsSet.add(it)
        if (!success) {
            println("$it")
        }
    }

}

