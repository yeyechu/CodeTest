package backjoon.mar20

// 덱 : 구현, 자료구조, 덱

fun main() {
    val times = readln().toInt()
    val deque: java.util.Deque<Int> = java.util.ArrayDeque()

    repeat(times) {
        val ins = readln().split(" ")
        when(ins[0]) {
            "push_front" -> { deque.addFirst(ins[1].toInt()) }
            "push_back" -> { deque.addLast(ins[1].toInt()) }
            "pop_front" -> {
                if (deque.isEmpty()) {
                    println(-1)
                } else {
                    println(deque.pollFirst())
                }
            }
            "pop_back" -> {
                if (deque.isEmpty()) {
                    println(-1)
                } else {
                    println(deque.pollLast())
                }
            }
            "size" -> { println(deque.size) }
            "empty" -> {
                if (deque.isEmpty()) {
                    println(1)
                } else {
                    println(0)
                }
            }
            "front" -> {
                if (deque.isEmpty()) {
                    println(-1)
                } else {
                    println(deque.peekFirst())
                }
            }
            "back" -> {
                if (deque.isEmpty()) {
                    println(-1)
                } else {
                    println(deque.peekLast())
                }
            }
        }
    }
}