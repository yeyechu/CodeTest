package backjoon.apr20

// 최소 힙 : 자료구조, 우선순위큐
// 시간 제한 : 2초
// n -> 1 ~ 100,000

// kotlin.io.println : 1544ms
// StringBuilder + LinkedList -> 시간 초과
// StringBuilder + PriorityQueue -> 300ms
// 다른 사람 힙 직접 구현 -> 148ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()
    val sb = StringBuilder()

    // 입력이 0일 때 큐 사이즈가 0이면 0을 출력, 나머지는 큐에서 가장 작은 값을 출력 후 삭제
    // 가장 작은 값을 맨 앞에 두기 위해 우선순위 큐 사용

    val pq: java.util.Queue<Int> = java.util.PriorityQueue()

    repeat(times) {
        val number = buffer.readLine().toInt()
        if (number == 0) {
            if (pq.isEmpty()) {
                sb.append(0).appendLine()
            } else {
                sb.append(pq.poll()).appendLine()
            }
        } else {
            pq.add(number)
        }
    }
    print(sb)
}