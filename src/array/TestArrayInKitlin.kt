package array

class TestArrayInKitlin {

    val arr: List<String> = listOf("Jishan", "Ansari", "Mohiuddin")

    fun accessList() {
        arr.forEach {
            println(it)
        }

        for (index in arr.indices) {
            println(index)
        }
    }


}

fun main() {
    val test = TestArrayInKitlin()
    test.accessList()
}