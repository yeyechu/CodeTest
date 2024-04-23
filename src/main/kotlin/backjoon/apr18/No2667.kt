package backjoon.apr18

// 단지번호 붙이기 : 그래프 이론, 그래프 탐색, 너비우선탐색, 깊이우선탐색

// n -> 5 ~ 25

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val dimension = buffer.readLine().toInt()
    val array = Array(dimension) { IntArray(dimension) { 0 } }
    val sb = StringBuilder()

    repeat(dimension) { row ->
        val intArray = buffer.readLine().toCharArray().map { it - '0' }
        intArray.forEachIndexed { column, n ->
            array[row][column] = n
        }
    }
    buffer.close()

    val ans = findN(array)
    sb.append(ans.size).appendLine()

    ans.forEach {
        sb.append(it).appendLine()
    }
    print(sb)
}

fun findN(grid: Array<IntArray>): List<Int> {
    val list = mutableListOf<Int>()
    var index = 0

    fun dfs(i: Int, j: Int, c: Int) {
        when {
            (i < 0)
                    || (i >= grid.size)
                    || (j < 0)
                    || (j >= grid[0].size)
                    || (grid[i][j] == 0) -> return
        }

        if (grid[i][j] == 1) {
            list[c]++
        }

        grid[i][j] = 0

        dfs(i, j + 1, c)
        dfs(i, j - 1, c)
        dfs(i + 1, j, c)
        dfs(i - 1, j, c)
    }

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 1) {
                list.add(0)
                dfs(i, j, index++)
            }
        }
    }

    return list.sorted()
}