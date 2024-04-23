package backjoon.apr20

// 최소 힙 : 자료구조, 우선순위큐
// 시간 제한 : 2초
//

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()

    val pq: java.util.Queue<Int> = java.util.PriorityQueue()

    repeat(times) {
        val number = buffer.readLine().toInt()
        if (number == 0) {
            if (pq.isEmpty()) {
                println(0)
            } else {
                println(pq.poll())
            }
        } else {
            pq.add(number)
        }
    }
}