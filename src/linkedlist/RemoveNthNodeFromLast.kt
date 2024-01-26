package linkedlist

fun main() {
    // Test Case 1: Remove the 2nd node from the end
    /*  val testCase1 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
      printList("Input: ", testCase1)
      val result1 = removeNthFromEnd(testCase1, 2)
      printList("Result: ", result1)*/

    // Test Case 2: Remove the only node from the list
    val testCase2 = createLinkedList(intArrayOf(1))
    printList("Input: ", testCase2)
    val result2 = removeNthFromEnd(testCase2, 1)
    printList("Result: ", result2)

    // Test Case 3: Remove the 1st node from the end
    /* val testCase3 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
     printList("Input: ", testCase3)
     val result3 = removeNthFromEnd(testCase3, 5)
     printList("Result: ", result3)

     // Test Case 4: Remove the 3rd node from the end
     val testCase4 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
     printList("Input: ", testCase4)
     val result4 = removeNthFromEnd(testCase4, 3)
     printList("Result: ", result4)*/
}


fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var count = 0
    var fast: ListNode? = head
    while (fast?.next != null) {
        count++
        fast = fast.next
        if (count == n) {
            break
        }
    }

    if (count == 0) {
        // Special case: Only one element in the list and n is 1
        return null
    }

    if (fast == null) {
        return head?.next
    }

    var slow: ListNode? = head
    while (fast?.next != null) {
        fast = fast?.next
        slow = slow?.next
    }
    slow?.next = slow?.next?.next

    return head
}

fun createLinkedList(values: IntArray): ListNode? {
    var head: ListNode? = null
    var current: ListNode? = null

    for (value in values) {
        val newNode = ListNode(value)
        if (head == null) {
            head = newNode
            current = head
        } else {
            current?.next = newNode
            current = newNode
        }
    }

    return head
}

fun printList(label: String, head: ListNode?) {
    print("$label: ")
    var current = head
    while (current != null) {
        print("${current.`val`} -> ")
        current = current.next
    }
    println("null")
}