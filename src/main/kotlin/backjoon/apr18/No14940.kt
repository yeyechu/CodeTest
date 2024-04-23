package backjoon.apr18

// 쉬운 최단거리 : 그래프이론, 그래프 탐색, 너비우선탐색

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (n, m) = buffer.readLine().split(" ").map { it.toInt() }

    val array = Array(n) { IntArray(m) { 0 } }
    var target: Pair<Int, Int> = 0 to 0

    repeat(m) { row ->
        val data = buffer.readLine().split(" ").map { it.toInt() }
        data.forEachIndexed { column, n ->
            array[row][column] = n
            if (n == 2) {
                target = row to column
            }
        }
    }
    buffer.close()

    println(findD(target.first, target.second, array))
}

fun findD(startV: Int, startH: Int, grid: Array<IntArray>): String {
    val distance = Array(grid.size) { IntArray(grid[0].size) { -1 } }
    val sb = StringBuilder()

    var i = startV
    var j = startH

    distance[i][j] = 0

    while (true) {
        distance[i - 1][j] = distance[i][j] + 1
        distance[i + 1][j] = distance[i][j] + 1
        distance[i][j + 1] = distance[i][j] + 1
        distance[i][j - 1] = distance[i][j] + 1
    }

    return sb.toString()
}