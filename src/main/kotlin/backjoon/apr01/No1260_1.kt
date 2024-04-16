package backjoon.apr01

// DFS BFS

val graph: MutableList<Vertex> = java.util.LinkedList()

fun main() {
    // 입력
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val (n, m, v) = br.readLine().split(" ").map { it.toInt() }

    repeat(m) {
        val (node1, node2) = br.readLine().split(" ").map { it.toInt() }

        graph.find { it.data == node1 }.apply {
            if (this == null) {
                graph.add(Vertex(node1, mutableListOf(node2)))
            } else {
                this.edgeList.add(node2)
            }
        }

        graph.find { it.data == node2 }.apply {
            if (this == null) {
                graph.add(Vertex(node2, mutableListOf(node1)))
            } else {
                this.edgeList.add(node1)
            }
        }
    }

    br.close()

    // 출력
    dfs(v, intArrayOf()).forEach {
        sb.append(it).append(' ')
    }

    sb.append('\n')

    bfs(v).forEach {
        sb.append(it).append(' ')
    }

    println(sb)
}

fun dfs(v: Int, e: IntArray): List<Int> {
    var visited: MutableList<Int> = e.copyOf().toMutableList()
     visited.add(v)

    graph.find { it.data == v }.apply {
        this?.let {
            edgeList.sorted().forEach {
                if (!visited.contains(it)) {
                    visited = dfs(it, visited.toIntArray()).toMutableList()
                }
            }
        }
    }

    return visited
}

fun bfs(v: Int): List<Int> {
    val visited: MutableList<Int> = java.util.LinkedList()
    visited.add(v)

    val queue: java.util.Queue<Int> = java.util.LinkedList()
    queue.add(v)

    while (queue.isNotEmpty()) {
        val v: Int = queue.poll()
        graph.find { it.data == v }.apply {
            this?.let {
                edgeList.sorted().forEach {
                    if (!visited.contains(it)) {
                        visited.add(it)
                        queue.add(it)
                    }
                }
            }
        }
    }

    return visited
}

data class Vertex(
    val data: Int,
    val edgeList: MutableList<Int> = java.util.LinkedList()
)