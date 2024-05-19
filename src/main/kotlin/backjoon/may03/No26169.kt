package backjoon.may03

// 세번 이내 사과를 먹자 : 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 백트래킹
// n -> 5 x 5 == 25 / 시간 제한 : 1초

// 입력
// (0, 0) ~ (4, 4) : 사과가 있는 칸(1), 장애물이 있는 칸(-1), 빈칸(0)이 주어짐
// 출발점 (r, c)가 주어짐

// 규칙
// 상-하-좌-우 이동 가능, 장애물 칸으로 이동 불가, 한 번 방문한 칸에는 장애물이 생김
// 세 번 이하 이동하여 사과 칸 2회 이상 방문 -> 1출력 / 그외 0 출력

const val SIZE = 5
fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val grid = Array(SIZE) { IntArray(SIZE) { 0 } }

    repeat(SIZE) { row ->
        val temp = buffer.readLine().split(" ").map { it.toInt() }
        temp.forEachIndexed { i, n ->
            if (n != 0) {
                grid[row][i] = n
            }
        }
    }

    val (r, c) = buffer.readLine().split(" ").map { it.toInt() }
    println(findApple(r, c, grid))
}

fun findApple(r: Int, c: Int, grid: Array<IntArray>): Byte {
    var answer = 0

    fun dfs(i: Int, j: Int, c: Int, path: java.util.LinkedList<Pair<Int, Int>>) {
        var count = c
        when {
            i < 0
                    || i >= SIZE
                    || j < 0
                    || j >= SIZE -> return
        }

        for ((row, column) in path) {
            if (row == i && column == j) {
                return
            }
        }

        if (grid[i][j] == 1) {
            count++
        }

        if (path.size >= 3 || grid[i][j] == -1) {
            answer = maxOf(answer, count)
            return
        }

        path.add(i to j)

        dfs(i - 1, j, count, path)
        dfs(i + 1, j, count, path)
        dfs(i, j - 1, count, path)
        dfs(i, j + 1, count, path)

        path.removeLast()
    }

    dfs(r, c, 0, java.util.LinkedList())

    return if(answer >= 2) {
        1
    } else {
        0
    }
}