package backjoon.apr20

// 연결 요소의 개수 : 그래프이론, 그래프탐색, 너비우선탐색, 깊이우선탐색

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (numbers, links) = buffer.readLine().split(" ").map { it.toInt() }

    repeat(links) {
        val (n1, n2) = buffer.readLine().split(" ").map { it.toInt() }

    }
}
