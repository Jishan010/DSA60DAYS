package queue

fun main() {

    val queue = QueueImplKotlin<Int>(capacity = 6)

    queue.insertElement(5)
    queue.insertElement(4)
    queue.insertElement(3)
    queue.insertElement(2)
    queue.insertElement(1)
    queue.insertElement(0)


    println(queue.peakElement())

    queue.deleteElement()
    queue.deleteElement()

    println(queue.peakElement())

    println(queue.isEmpty())

    queue.deleteElement()
    queue.deleteElement()
    println(queue.peakElement())

    queue.deleteElement()
    queue.deleteElement()
    println(queue.isEmpty())

    queue.insertElement(7)
    queue.insertElement(9)
    println(queue.isEmpty())
    println(queue.peakElement())
    queue.insertElement(10)
    queue.insertElement(11)
    println(queue.peakElement())
    queue.deleteElement()
    queue.deleteElement()
    queue.deleteElement()
    println(queue.peakElement())
}

class QueueImplKotlin<T>(private val capacity: Int) {

    private val array: Array<T?>
    private var size = 0
    private var index = 0
    private var top = 0

    init {
        @Suppress("UNCHECKED_CAST")
        array = arrayOfNulls<Any?>(capacity) as Array<T?>
    }

    fun insertElement(element: T) {
        if (size < capacity) {
            array[index] = element
            index = (index + 1) % capacity
            size++
        } else {
            println("Queue is full")
        }
    }

    fun deleteElement(): T? {
        if (isEmpty()) {
            println("Queue is empty")
            return null
        }
        val topElement = array[top]
        array[top] = null
        top = (top + 1) % capacity
        size--
        return topElement
    }

    fun peakElement(): T? {
        return if (!isEmpty()) array[top] else null
    }

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun isFull(): Boolean {
        return size == capacity
    }
}
