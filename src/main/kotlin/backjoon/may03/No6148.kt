package backjoon.may03

// Bookshelf2 : 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 브루트포스 알고리즘, 백트래킹, 비트 마스킹
// n -> 1 ~ 20 / 시간 제한 -> 1초

// 소의 체고 H -> 1 ~ 1_000_000 / H의 합 -> S / 책장 높이 B -> 1 ~ S
// 입력1 : 소의 마릿수 N과 책장 높이 B
// 입력2 : N마리 각각의 체고가 주어짐
// 출력 : (가능한 최소 체고의 합) - (책장 높이)

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val input = buffer.readLine().split(" ")

    val n = input[0].toInt()
    val b = input[1].toInt()
    val list = IntArray(n) { 0 }

    repeat(n) { i ->
        val num = buffer.readLine().split(" ")
        list[i] = num[0].toInt()
    }
    buffer.close()

    println(findHeight(n, b, list))
}

fun findHeight(n: Int, t: Int, heights: IntArray): Int {

    var answer = Int.MAX_VALUE
    val heightList = heights.sorted()

    fun dfs(target: Int, index: Int) {
        if (index >= n) {
            return
        }

        for (i in index until n) {
            val temp = target + heightList[i]
            if (temp < t) {
                dfs(temp, i + 1)
            } else {
                answer = minOf(temp, answer)
            }
        }
    }

    dfs(0, 0)

    return  answer - t
}