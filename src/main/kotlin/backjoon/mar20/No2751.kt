package backjoon.mar20

// 수 정렬하기 2 : 정렬

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val size = br.readLine().toInt()
    var head: ListNode? = null

    repeat(size) {
        head = ListNode(br.readLine().toInt(), head)
    }

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {

        var node1 = l1
        var node2 = l2

        if (node1 == null) return node2
        if (node2 == null) return node1

        if (node1.item > node2.item) {
            node1 = node2.also { node2 = node1 }
        }
        node1.next = mergeTwoLists(node1.next, node2)

        return node1
    }

    fun sortList(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        var half: ListNode? = null
        var slow: ListNode? = head
        var fast: ListNode? = head

        while (fast?.next != null) {
            half = slow
            slow = slow!!.next
            fast = fast.next!!.next
        }

        half!!.next = null

        val l1 = sortList(head)
        val l2 = sortList(slow)

        return mergeTwoLists(l1, l2)
    }

    sortList(head)?.let {
        var node: ListNode? = it
        repeat(size - 1) {
            sb.append(node!!.item).append('\n')
            node = node!!.next
        }
        sb.append(node!!.item).append('\n')
    }
    print(sb)
}

data class ListNode (
    var item: Int,
    var next: ListNode? = null
)