package backjoon.apr01

// 섬의 개수 : 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    fun find(grid: List<IntArray>): Int {

        fun dfs(i: Int, j: Int) {
            when {
                i < 0 || i >= grid.size
                        || j < 0 || j >= grid[0].size
                        || grid[i][j] == 0 -> return
            }
            grid[i][j] = 0

            dfs(i, j + 1)
            dfs(i, j - 1)
            dfs(i + 1, j)
            dfs(i - 1, j)

            dfs(i + 1, j + 1)
            dfs(i + 1, j - 1)

            dfs(i - 1, j + 1)
            dfs(i - 1, j - 1)
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

    while (true) {
        val (column, row) = br.readLine().split(" ").map { it.toInt() }

        if (column == 0 && row == 0) {
            return
        }

        val array: MutableList<IntArray> = java.util.LinkedList()

        repeat(row) {
            val list = br.readLine().split(" ").map { it.toInt() }
            array.add(list.toIntArray())
        }
        println(find(array))
    }
}