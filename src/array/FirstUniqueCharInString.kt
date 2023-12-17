package array

fun main() {
    val text = "loveleetcode"
    println(firstUniqChar(text))
}

fun firstUniqChar(s: String): Int {
    val map = mutableMapOf<Char, Int>();
    s.toCharArray().forEach { char ->
        map[char] = map.getOrDefault(char, 0) + 1
    }

    s.toCharArray().forEachIndexed { index, value ->
        if (map[value] == 1) {
            return index
        }
    }

    return -1
}
