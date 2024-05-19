package backjoon.may01

// 점프왕 쩰리(small) : 구현, 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 브루트포스 알고리즘
// n -> 2 ~ 3 / 시간 제한 : 1초

// 확실한 조건문 사용 -> 시간 136ms 메모리 20680KB(0.02068MB)
// 가독성을 위해 적당한 조건문 사용 -> 시간 136ms 메모리 21188KB(0.02119MB)

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = buffer.readLine().toInt()
    val array = Array(size) { IntArray(size) { 0 } }

    repeat(size) { row ->
        val temp = buffer.readLine().split(" ").map { it.toInt() }
        for (i in temp.indices) {
            array[row][i] = temp[i]
        }
    }

    buffer.close()
    println(findDestination(size, array))
}

fun findDestination(n: Int, grid: Array<IntArray>): String {
    var answer = "Hing"

    fun dfs(i: Int, j: Int) {
        // 영역 내에서만 움직일 수 있음
        // 0, 0에서만 출발할 수 있음
        // 오른쪽과 아래로만 이동 가능 -> "중간에 꺾을 수 없음"
        // 한 번에 이동 가능한 수 -> 밟고 있는 숫자(0 ~ 100)
        // -1을 만나면 성공
        when {
            i >= n
                    || j >= n
                    || grid[i][j] == 0
                    || grid[i][j] >= n -> return
            grid[i][j] == -1 -> {
                answer = "HaruHaru"
                return
            }
        }

        dfs(i, j + grid[i][j])
        dfs(i + grid[i][j], j)
    }

    // -1이 없을 때 종료
    if (grid[n - 1][n - 1] != -1) {
        return answer
    }

    dfs(0, grid[0][0])
    dfs(grid[0][0], 0)

    return answer
}

/* 시간 136ms 메모리 20680KB
fun findDestination(n: Int, grid: Array<IntArray>): String {
    var answer = "Hing"

    fun dfs(i: Int, j: Int) {
        if (i >= grid.size || j >= grid[0].size || grid[i][j] == 0) {
            return
        } else if (grid[i][j] == -1) {
            answer = "HaruHaru"
            return
        }

        if (j + grid[i][j] <= n) {
            dfs(i, j + grid[i][j])
        }

        if (i + grid[i][j] <= n) {
            dfs(i + grid[i][j], j)
        }
    }

    if (grid[n - 1][n - 1] != -1) {
        return answer
    }

    if (grid[0][0] in 1..n) {
        dfs(0, grid[0][0])
        dfs(grid[0][0], 0)
    }

    return answer
}
* */