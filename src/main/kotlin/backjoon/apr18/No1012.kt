package backjoon.apr18

// 유기농 배추 : 그래프이론, 그래프 탐색, 너비우선탐색, 깊이우선탐색

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = buffer.readLine().toInt()

    repeat(size) {
        val (m, n, times) = buffer.readLine().split(" ").map { it.toInt() }
        val grid = Array(m) { IntArray(n) { 0 } }

        repeat(times) {
            val (i, j) = buffer.readLine().split(" ").map { it.toInt() }
            grid[i][j] = 1
        }

        println(findNum(grid))
    }
}

fun findNum(grid: Array<IntArray>): Int {

    fun dfs(i: Int, j: Int) {
        when {
            (i < 0)
                    || i >= grid.size
                    || j < 0
                    || j >= grid[0].size
                    || grid[i][j] == 0 -> return
        }

        grid[i][j] = 0

        dfs(i - 1, j)
        dfs(i + 1, j)
        dfs(i, j - 1)
        dfs(i, j + 1)
    }

    var count = 0

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 1) {
                dfs(i, j)
                count++
            }
        }
    }

    return count
}