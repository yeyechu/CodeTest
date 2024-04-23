package backjoon.apr18

// 색종이 만들기 : 분할 정복, 재귀
// n -> 2, 4, 8, 16, 32, 64, 128

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = buffer.readLine().toInt()
    val list = Array(size) { IntArray(size) { 0 } }

    repeat(size) {
        val input = buffer.readLine().split(" ").map { it.toInt() }
        input.forEachIndexed { index, n ->
            list[it][index] = n
        }
    }

    buffer.close()

    val ans = find(list)

    println(ans.first)
    println(ans.second)
}

fun find(grid: Array<IntArray>): Pair<Int, Int> {
    var countW = 0
    var countB = 0

    // i, j -> 시작 좌표, n -> grid 크기
    fun ds(s: Int, e: Int, n: Int) {
        var division = false
        val temp = grid[s][e]

        for (i in s until (s + n)) {
            for (j in e until (e + n)) {
                if (grid[i][j] != temp) {
                    division = true
                    break
                }
            }
            if (division) {
                break
            }
        }

        if (division && n >= 1) {
            ds(s, e, n / 2)
            ds(s, e + n / 2, n / 2)
            ds(s + n / 2, e, n / 2)
            ds(s + n / 2, e + n / 2, n / 2)
        } else if(!division) {
            if (grid[s][e] == 1) {
                countB++
            } else {
                countW++
            }
        }
    }

    ds(0, 0, grid.size)

    return countW to countB
}