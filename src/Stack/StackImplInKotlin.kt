package Stack

fun main() {

    val array = Array(5) { 0 }
    val stackImplInKotlin = StackImplInKotlin(array)


    stackImplInKotlin.push(1)
    stackImplInKotlin.push(2)
    stackImplInKotlin.push(3)
    stackImplInKotlin.push(4)
    stackImplInKotlin.push(5)

    println(stackImplInKotlin.peek())


    println(stackImplInKotlin.pop())
    println(stackImplInKotlin.pop())
    println(stackImplInKotlin.pop())

    println(stackImplInKotlin.peek())

}

class StackImplInKotlin<T>(val array: Array<T>) {

    var index = 0

    fun push(value: T) {
        array[index] = value
        if (index < 4) index++
    }

    fun pop(): T {
        return array[index--]
    }

    fun peek(): T {
        return array[index]
    }

}