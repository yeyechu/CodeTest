package backjoon.mar20

// 큐 : 자료구조, 큐
// 명령어 수 n -> 1 ~ 10,000개
// 시간 제한 -> 0.5초

// Scanner, kotlin.io.println -> 480ms
// BufferedReader, StringBuilder -> 224ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val times = buffer.readLine().toInt()
    val queue: java.util.Queue<Int> = java.util.ArrayDeque()

    repeat(times) {
        val ins = buffer.readLine().split(" ")
        when(ins[0]) {
            "push" -> {
                queue.add(ins[1].toInt())
            }
            "pop" -> {
                if (queue.isEmpty()) {
                    sb.append(-1).appendLine()
                } else {
                    sb.append(queue.poll()).appendLine()
                }
            }
            "size" -> {
                sb.append(queue.size).appendLine()
            }
            "empty" -> {
                if (queue.isEmpty()) {
                    sb.append(1).appendLine()
                } else {
                    sb.append(0).appendLine()
                }
            }
            "front" -> {
                if (queue.isEmpty()) {
                    sb.append(-1).appendLine()
                } else {
                    sb.append(queue.peek()).appendLine()
                }
            }
            "back" -> {
                if (queue.isEmpty()) {
                    sb.append(-1).appendLine()
                } else {
                    sb.append(queue.elementAt(queue.size - 1)).appendLine()
                }
            }
        }
    }
    buffer.close()
    print(sb)
}