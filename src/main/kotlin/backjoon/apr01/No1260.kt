package backjoon.apr01

// DFS 와 BFS : 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
// 노드와 간선이 주어지면 DFS, BFS 수행 결과 출력

fun main() {

    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val (n, m, v) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<Int, java.util.LinkedList<Int>>()
    val limit = {
        if (m == 1) {
            2
        } else if (n == 1) {
            1
        }
        else {
            minOf(n, m)
        }
    }

    // 입력
    repeat(m) {
        val (vertex1, vertex2) = br.readLine().split(" ").map { it.toInt() }

        map.putIfAbsent(vertex1, java.util.LinkedList())
        map.putIfAbsent(vertex2, java.util.LinkedList())

        if (!map[vertex1]!!.contains(vertex2)) {
            map[vertex1]!!.add(vertex2)
        }
        if (!map[vertex2]!!.contains(vertex1)) {
            map[vertex2]!!.add(vertex1)
        }
    }

    br.close()

    fun dfs(start: Int, limit: Int): IntArray {
        var i = start
        val path: MutableList<Int> = java.util.LinkedList()
        path.add(start)

        while (path.size < limit) {
            if (map.containsKey(i)) {
                map[i]!!.sort()
                var targetIndex = map[i]!![0]

                for (index in 0 until map[i]!!.size) {
                    if (!path.contains(map[i]!![index])) {
                        targetIndex = map[i]!![index]
                        break
                    }
                }

                i = targetIndex

                if (!path.contains(targetIndex)) {
                    path.add(targetIndex)
                }
            }
        }

        return path.toIntArray()
    }

    fun bfs(start: Int, limit: Int): IntArray {
        var i = start
        val path: MutableList<Int> = java.util.LinkedList()
        path.add(start)

       while (path.size < limit) {
           //sort()
           map[i]!!.forEach {
               if (!path.contains(it)) {
                   path.add(it)
               }
           }

           i = map[i]!![0]

           for (index in 0 until map[i]!!.size) {
               if (!path.contains(map[i]!![index])) {
                   i = map[i]!![index]
                   path.add(i)
                   break
               }
           }
       }

        return path.toIntArray()
    }

    // 출력
    dfs(v, limit()).forEach {
        sb.append(it).append(' ')
    }

    sb.append('\n')

    bfs(v, limit()).forEach {
        sb.append(it).append(' ')
    }

    println(sb)
}