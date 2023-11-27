package array.hashmap


// leetcode
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 5, 5, 6, 6, 6, 6, 6, 7)
    val frequencyMap = mutableMapOf<Int, Int>()
    // Counting the frequency of each number
    for (number in numbers) {
        frequencyMap[number] = frequencyMap.getOrDefault(number, 0) + 1
    }
    // Finding the maximum frequency and the corresponding number
    var maxFrequency = 0
    var numberWithMaxFrequency = 0

    for ((number, frequency) in frequencyMap) {
        if (frequency > maxFrequency) {
            maxFrequency = frequency
            numberWithMaxFrequency = number
        }
    }

    println("Number with the maximum frequency is $numberWithMaxFrequency with a frequency of $maxFrequency")
}