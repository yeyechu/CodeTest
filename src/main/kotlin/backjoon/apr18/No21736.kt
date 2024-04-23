package backjoon.apr18

// 헌내기는 친구가 필요해 : 그래프 이론, 그래프 탐색, 너비우선탐색, 깊이우선탐색
// n, m -> 1 ~ 600
// 시간제한 -> 2초

// O 빈공간 X 벽 I 도연 P 사람

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (n, m) = buffer.readLine().split(" ").map { it.toInt() }
    val list = Array(n) { CharArray(m) { ' ' } }

    repeat(n) { row ->
        val input = buffer.readLine().toCharArray()
        input.forEachIndexed { index, c ->
            list[row][index] = c
        }
    }

    println(find(list))
}

fun find(grid: Array<CharArray>): String {

    var count = 0

    fun dfs(i: Int, j: Int) {
        when {
            (i < 0)
                    || (i >= grid.size)
                    || (j < 0)
                    || (j >= grid[0].size)
                    || (grid[i][j] == 'X') -> return
        }

        if (grid[i][j] == 'P') {
            count++
        }

        grid[i][j] = 'X'

        dfs(i, j + 1) // 동
        dfs(i, j - 1) // 서
        dfs(i + 1, j) // 남
        dfs(i - 1, j) // 북
    }

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 'I') {
                dfs(i, j)
            }
        }
    }

    return if (count == 0) {
        "TT"
    } else {
        count.toString()
    }
}