package backjoon.may03

// Daisy Chains in the Field : 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색
// n -> 1 ~ 250 / 시간 제한 -> 1초

// 입력
// n 마리 m 쌍
// m쌍이 어떻게 연결되어 있는지

// 출력
// 소 1과 연결되지 않은 소의 번호를 오름차순으로 출력, 없으면 0을 출력

// -> 노드와 링크

// map + BooleanArray + ArrayDeque -> 356ms(꼴지)
// 코틀린 풀이 전체 중 최소 시간 -> 152ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val (n, m) = buffer.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<Int, java.util.LinkedList<Int>>()

    repeat(m) {
        val (n1, n2) = buffer.readLine().split(" ").map { it.toInt() }
        map.putIfAbsent(n1, java.util.LinkedList())
        map.putIfAbsent(n2, java.util.LinkedList())
        if (!map[n1]!!.contains(n2)) {
            map[n1]!!.add(n2)
        }
        if (!map[n2]!!.contains(n1)) {
            map[n2]!!.add(n1)
        }
    }
    buffer.close()

    findCouples(n, m, map).forEach {
        sb.append(it).appendLine()
    }

    print(sb)
}

fun findCouples(n: Int, m: Int, map:Map<Int, java.util.LinkedList<Int>>): IntArray {

    val queue: java.util.Queue<Int> = java.util.ArrayDeque()
    val visited = BooleanArray(n + 1) { false }

    queue.add(1)

    while (queue.isNotEmpty()) {
        val temp = queue.poll()

        if (!visited[temp]) {
            visited[temp] = true

            map[temp]?.let { list ->
                list.forEach {
                    if (!visited[it]) {
                        queue.add(it)
                    }
                }
            }
        }
    }

    val answers = mutableListOf<Int>()

    for (i in 1..n) {
        if (!visited[i]) {
            answers.add(i)
        }
    }

    if (answers.size == 0) {
        answers.add(0)
    }

    return answers.toIntArray()
}