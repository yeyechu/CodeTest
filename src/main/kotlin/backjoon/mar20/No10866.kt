package backjoon.mar20

// 덱 : 구현, 자료구조, 덱
// n -> 1 ~ 10,000 / 시간 제한 -> 0.5초

// kotlin.io -> 488ms
// BufferedReader, StringBuilder -> 204ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()
    val sb = StringBuilder()

    val deque: java.util.Deque<Int> = java.util.ArrayDeque()

    repeat(times) {
        val ins = buffer.readLine().split(" ")
        when(ins[0]) {
            "push_front" -> { deque.addFirst(ins[1].toInt()) }
            "push_back" -> { deque.addLast(ins[1].toInt()) }
            "pop_front" -> {
                if (deque.isEmpty()) {
                    sb.append(-1).appendLine()
                } else {
                    sb.append(deque.pollFirst()).appendLine()
                }
            }
            "pop_back" -> {
                if (deque.isEmpty()) {
                    sb.append(-1).appendLine()
                } else {
                    sb.append(deque.pollLast()).appendLine()
                }
            }
            "size" -> { sb.append(deque.size).appendLine() }
            "empty" -> {
                if (deque.isEmpty()) {
                    sb.append(1).appendLine()
                } else {
                    sb.append(0).appendLine()
                }
            }
            "front" -> {
                if (deque.isEmpty()) {
                    sb.append(-1).appendLine()
                } else {
                    sb.append(deque.peekFirst()).appendLine()
                }
            }
            "back" -> {
                if (deque.isEmpty()) {
                    sb.append(-1).appendLine()
                } else {
                    sb.append(deque.peekLast()).appendLine()
                }
            }
        }
    }
    buffer.close()
    print(sb)
}