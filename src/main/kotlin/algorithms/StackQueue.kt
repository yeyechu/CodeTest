package algorithms

data class ListNode (
    var item: Int,
    var next: ListNode? = null
)

data class Stack(
    var max: Int,
    var last: ListNode? = null
) {
    var count = 0

    fun push(item: Int) {
        if (isAvailable()) {
            count++
            last = ListNode(item, last)
        }
    }

    fun pop(): Int? {
        last?.let {
            val item = it.item
            last = it.next
            count--

            return item
        }
        return null
    }

    private fun isAvailable(): Boolean {
        return count < max
    }

    fun allClear() {
        count = 0
        last = null
    }

    fun display() {
        last?.let {
            var node: ListNode? = it
            repeat(count) {
                print("${node!!.item} ")
                node = node!!.next
            }
            println()
        }
    }
}

fun main() {
    val stack = Stack(5)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)
    stack.push(6)

    stack.display()

    repeat(6) {
        println(stack.pop())
        stack.display()
    }
    val stackd: java.util.Deque<Char> = java.util.ArrayDeque()

    println(stack.toString())

    stack.push(1)
    stack.push(2)
    stack.allClear()

    println(stack.toString())
    // ──────────────────────────────────────────────────────
    val node1 = ListNode(1)
    val node2 = ListNode(2)

    node1.next = node2

    println(isPalindrome(node1))
}

fun isPalindrome(head: ListNode?): Boolean {
    val deque: java.util.Deque<Int> = java.util.LinkedList()
    var node = head
    while (node != null) {
        deque.add(node.item)
        node = node.next
    }

    while (!deque.isEmpty() && deque.size > 1) {
        if (deque.pollFirst() !== deque.pollLast()) {
            return false
        }
    }
    return true
}