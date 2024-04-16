package leetcode

import algorithms.ListNode

fun main() {
    println(mergeKLists(arrayOf(ListNode(1, ListNode(4, ListNode(5))), ListNode(1, ListNode(3, ListNode(4))), ListNode(2, ListNode(7)))))
    println(mergeKLists(arrayOf()))
    println(mergeKLists(arrayOf(ListNode(1))))
}

fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val pq = java.util.PriorityQueue<ListNode> { o1, o2 ->
        when {
            o1.item == o2.item -> 0
            o1.item > o2.item -> 1
            else -> -1
        }
    }

    val root = ListNode(0)
    var tail = root

    for (node in lists) {
        if (node != null) {
            pq.add(node)
        }
    }

    while (pq.isNotEmpty()) {
        tail.next = pq.poll()
        tail = tail.next!!

        if (tail.next != null) {
            pq.add(tail.next)
        }
    }
    return root.next
}