package backjoon.may06

// DFS와 BFS : 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색
// 정점 개수 n -> 1 ~ 1,000 & 간선 개수 m -> 1 ~ 10,000 / 시간 제한 -> 2초

// 간선은 양방향

// 입력
// 노드, 간선, 시작노드 번호
// 간선 수만큼의 경로

// 출력
// dfs 방문 경로
// bfs 방문 경로

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val (n, m, s) = buffer.readLine().split(" ").map { it.toInt() }
    val graph = java.util.HashMap<Int, java.util.PriorityQueue<Int>>()

    repeat(m) {
        val (n1, n2) = buffer.readLine().split(" ").map { it.toInt() }
        graph.putIfAbsent(n1, java.util.PriorityQueue())
        graph.putIfAbsent(n2, java.util.PriorityQueue())

        graph[n1]?.add(n2)
        graph[n2]?.add(n1)
    }

    dfs(n, s, graph).forEach {
        sb.append(it).append(' ')
    }

    sb.appendLine()

    bfs(n, s, graph).forEach {
        sb.append(it).append(' ')
    }

    print(sb)
}

fun dfs(n: Int, s: Int, graph: java.util.HashMap<Int, java.util.PriorityQueue<Int>>): IntArray {
    val visited = BooleanArray(n + 1) { false }
    val path: java.util.Queue<Int> = java.util.ArrayDeque()

    fun recur(c: Int) {
        visited[c] = true
        path.offer(c)

        graph[c]?.let { list->
            list.sorted().forEach {
                if (!visited[it]) {
                    recur(it)
                }
            }
        }
    }

    recur(s)

    return path.toIntArray()
}

fun bfs(n: Int, s: Int, graph: java.util.HashMap<Int, java.util.PriorityQueue<Int>>): IntArray {
    val visited = BooleanArray(n + 1) { false }
    val queue: java.util.Queue<Int> = java.util.ArrayDeque()
    val path: java.util.Queue<Int> = java.util.ArrayDeque()

    queue.offer(s)

    while (queue.isNotEmpty()) {
        val temp = queue.poll()

        if (!visited[temp]) {
            visited[temp] = true
            path.offer(temp)

            graph[temp]?.let { list ->
                list.sorted().forEach {
                    if (!visited[it]) {
                        queue.offer(it)
                    }
                }
            }
        }

        if (path.size >= n) {
            break
        }
    }

    return path.toIntArray()
}
