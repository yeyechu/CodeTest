package leetcode

fun main() {
    println(numIslands(arrayOf(
        charArrayOf('1', '1', '1', '1', '0'),
        charArrayOf('1', '1', '0', '1', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '0', '0', '1'))))
    println(numIslands(arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1'))))
}

fun numIslands(grid: Array<CharArray>): Int {

    // 행과 열 단위로 육지(1)을 찾음 -> 중첩 반복
    // 육지(1)을 발견 하면 -> DFS 탐색

    // DFS : 동서남북 모두 탐색하며 재귀 호출, 육지가 아니면 함수 종료(return)
    // 일종의 가지치기, 이미 방문한 곳은 값을 물(0)로 표시하여 재방문 x
    // 코틀린은 중첩 함수를 지원하므로 부모 함수의 변수를 공유할 수 있음

    fun dfs(i: Int, j: Int) {
        when {
            (i < 0) ||
                    (i >= grid.size) ||
                    (j < 0) ||
                    (j >= grid[0].size) ||
                    (grid[i][j] == '0') -> return
        }

        grid[i][j] = '0'

        dfs(i, j + 1) // 동
        dfs(i, j - 1) // 서
        dfs(i + 1, j) // 남
        dfs(i - 1, j) // 북
    }

    var count = 0

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == '1') {
                dfs(i, j)
                count++
            }
        }
    }
    return count
}
