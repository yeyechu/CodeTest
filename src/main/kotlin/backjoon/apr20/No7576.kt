package backjoon.apr20

// 토마토 : 그래프이론, 그래프탐색, 너비우선탐색
// m, n -> 2 ~ 1000개, 최대 1,000,000개까지 주어짐
// 1 익은 토마토 / 0 익지 않은 토마토 / -1 토마토 없음

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (m, n) = buffer.readLine().split(" ").map { it.toInt() }

    val array = Array(n) { IntArray(m) { 0 } }
    repeat(n) { row ->
        val tomato = buffer.readLine().split(" ").map { it.toInt() }
        tomato.forEachIndexed { column, n ->
            array[row][column] = n
        }
    }
    println(findDays(array))
}

fun findDays(grid: Array<IntArray>): Int {
    var count = 0

    var count1 = 0
    var count0 = 0


    return if (count == 0) {
        -1
    } else {
        count
    }
}