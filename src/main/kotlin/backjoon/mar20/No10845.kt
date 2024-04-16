package backjoon.mar20

// 큐 : 자료구조, 큐

fun main() {
    val times = readln().toInt()
    val queue: java.util.Queue<Int> = java.util.ArrayDeque()

    repeat(times) {
        val ins = readln().split(" ")
        when(ins[0]) {
            "push" -> {
                queue.add(ins[1].toInt())
            }
            "pop" -> {
                if (queue.isEmpty()) {
                    println(-1)
                } else {
                    println(queue.poll())
                }
            }
            "size" -> {
                println(queue.size)
            }
            "empty" -> {
                if (queue.isEmpty()) {
                    println(1)
                } else {
                    println(0)
                }
            }
            "front" -> {
                if (queue.isEmpty()) {
                    println(-1)
                } else {
                    println(queue.peek())
                }
            }
            "back" -> {
                if (queue.isEmpty()) {
                    println(-1)
                } else {
                    println(queue.elementAt(queue.size - 1))
                }
            }
        }
    }
}