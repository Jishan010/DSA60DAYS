package queue

fun main() {
    val myQueue = mutableListOf<Int>()
    // Enqueue elements
    myQueue.add(1)
    myQueue.add(2)
    myQueue.add(3)

    println("Queue: $myQueue")  // Output: [1, 2, 3]

    // Dequeue an element
    val dequeuedElement = myQueue.removeAt(0)
    println("Dequeued element: $dequeuedElement")  // Output: 1

    println("Queue after dequeue: $myQueue")  // Output: [2, 3]

    myQueue.add(4)

    println("Queue: $myQueue")  // Output: [1, 2, 3]

    println("After removing first element ${myQueue.removeAt(0)} -> $myQueue")

}
