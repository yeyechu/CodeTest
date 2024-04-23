package backjoon.apr18

// 바이러스 : 그래프이론, 그래프 탐색, 너비우선탐색, 깊이우선탐색
fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = buffer.readLine().toInt()
    val link = buffer.readLine().toInt()

    val map = java.util.HashMap<Int, java.util.LinkedList<Int>>()
    val visited = mutableListOf<Int>()

    repeat(size) {
        map[it + 1] = java.util.LinkedList()
    }

    repeat(link) {
        val (c1, c2) = buffer.readLine().split(" ").map { it.toInt() }

        if (!map[c1]!!.contains(c2)) {
            map[c1]!!.add(c2)
        }
        if (!map[c2]!!.contains(c1)) {
            map[c2]!!.add(c1)
        }
    }
    buffer.close()

    if (map.containsKey(1)) {
        map[1]!!.forEach {
            visited.add(it)
        }
    } else {
        println(0)
        return
    }

    var index = 0
    while (index < visited.size) {
        map[visited[index]]!!.forEach { n ->
            if (!visited.contains(n) && n != 1) {
                visited.add(n)
            }
        }
        index++
    }
    // ───────────────────────────────────────────────
//    map.forEach {
//        print("${it.key} : ")
//        println(it.value.toList())
//    }
//    println(visited.toList())
    // ───────────────────────────────────────────────
    println(visited.size)
}