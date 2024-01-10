package linkedlist

fun main() {
    val originalList = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }
    }

    val reversedList = reverseList(originalList)
    var temp = reversedList
    while (temp != null) {
        println(temp.`val`)
        temp = temp.next
    }
}

// 1 2 3 4
fun reverseList(head: ListNode?): ListNode? {
    var temp = head
    var prev: ListNode? = null
    var front: ListNode?
    while (temp != null) {
        front = temp.next
        temp.next = prev
        prev = temp
        temp = front
    }
    return prev
}