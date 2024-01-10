package linkedlist

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

val name: Int = getNumber()
fun main() {
    println(name)
}

fun getNumber(): Int {
    return 9
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var temp: ListNode? = head
        while (temp?.next != null) {
            if (temp.`val` == temp.next?.`val`) {
                temp.next = temp.next?.next
            } else {
                temp = temp.next
            }
        }
        return temp
    }
}


/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution1 {
    val firstNode: ListNode? = ListNode(-1)
    fun reverseList(head: ListNode?): ListNode? {
        var temp = head
        val stack = mutableListOf<ListNode>()
        while (temp != null) {
            stack.add(temp)
            temp = temp.next
        }

        temp = head
        while (temp != null) {
            val topNode: ListNode = stack.last()
            temp.`val` = topNode.`val`
            stack.removeLast()
            temp = temp.next
        }
        return head
    }
}