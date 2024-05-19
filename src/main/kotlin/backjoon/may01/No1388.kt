package backjoon.may01

// 바닥 장식 : 구현, 그래프 이론, 그래프 탐색, 깊이 우선 탐색
// n -> 2500 / 시간 제한 -> 2초

// n, m -> 50

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (n, m) = buffer.readLine().split(" ").map { it.toInt() }
    val array = Array(n) { CharArray(m) { ' ' } }

    repeat(n) { row ->
        val temp = buffer.readLine().toCharArray()
        temp.forEachIndexed { i, c ->
            array[row][i] = c
        }
    }
    buffer.close()

    println(findBlocks(n, m, array))
}

fun findBlocks(n: Int, m: Int, grid: Array<CharArray>): Int {
    var count = 0

    fun horizontalDfs(i: Int, j: Int) {
        when {
            (i < 0)
                    || (i >= grid.size)
                    || (j < 0)
                    || (j >= grid[0].size)
                    || grid[i][j] == '*'
                    || grid[i][j] == '|' -> return
        }

        grid[i][j] = '*'

        horizontalDfs(i, j - 1)
        horizontalDfs(i, j + 1)

    }

    fun verticalDfs(i: Int, j: Int) {
        when {
            i < 0
                    || i >= grid.size
                    || j < 0
                    || j >= grid[0].size
                    || grid[i][j] == '*'
                    || grid[i][j] == '-' -> return
        }

        grid[i][j] = '*'

        verticalDfs(i - 1, j)
        verticalDfs(i + 1, j)
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (grid[i][j] == '|') {
                verticalDfs(i, j)
                count++
            } else if (grid[i][j] == '-') {
                horizontalDfs(i, j)
                count++
            }
        }
    }

    return count
}