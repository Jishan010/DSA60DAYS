package linkedlist


fun main() {/* // Test Case 1: Both lists are null
     testAddTwoNumbers(null, null)

     // Test Case 2: One list is null, and the other is not null
     testAddTwoNumbers(ListNode1(2), null)
     testAddTwoNumbers(null, ListNode1(5))

     // Test Case 3: Lists with different lengths
     testAddTwoNumbers(ListNode1(2), ListNode1(5)) // Result: 7*/

    // Test Case 4: Lists with the same length, no carry
    testAddTwoNumbers(
        ListNode1(2, ListNode1(4, ListNode1(3))), ListNode1(5, ListNode1(6, ListNode1(4)))
    ) // Result: 7 -> 0 -> 8

    /*// Test Case 5: Lists with the same length, with carry
    testAddTwoNumbers(ListNode1(9, ListNode1(9, ListNode1(9))), ListNode1(1)) // Result: 0 -> 0 -> 0 -> 1

    // Test Case 6: Unequal lengths with carry
    testAddTwoNumbers(
        ListNode1(9, ListNode1(9, ListNode1(9, ListNode1(9)))),
        ListNode1(1)
    ) // Result: 0 -> 0 -> 0 -> 0 -> 1*/
}

class ListNode1(var `val`: Int, var next: ListNode1? = null)


fun testAddTwoNumbers(l1: ListNode1?, l2: ListNode1?) {
    val result = addTwoNumbers(l1, l2)
    print("Result for ")
    printListNode(l1)
    print(" + ")
    printListNode(l2)
    print(" : ")
    printListNode(result)
    println()
}

fun printListNode(node: ListNode1?) {
    var current = node
    while (current != null) {
        print("${current.`val`} -> ")
        current = current.next
    }
    print("null")
}

// 2 4 3 and // 5 6 4
fun addTwoNumbers(l1: ListNode1?, l2: ListNode1?): ListNode1? {

    var temp1: ListNode1? = l1
    var temp2: ListNode1? = l2

    val dummyNode = ListNode1(-1)
    var currentNode = dummyNode
    var carry = 0
    while (temp1 != null || temp2 != null) {
        val first = temp1?.`val`
        val second = temp2?.`val`

        var sum = (first ?: 0) + carry
        sum += (second ?: 0)
        val newNode = ListNode1(sum % 10)
        currentNode.next = newNode
        carry = sum / 10

        temp1 = temp1?.next
        temp2 = temp2?.next
        currentNode = newNode
    }

    if (carry > 0) {
        val newNode = ListNode1(carry)
        currentNode?.next = newNode
    }

    return dummyNode.next

}