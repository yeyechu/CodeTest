package backjoon._review._01_implement

// 3월 8일 재풀이
// 최댓값 : 구현
// Scanner, mutableList, sort() -> 148ms
// BufferedReader, max 찾기 -> 132ms

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    var max = -1
    var row = 0
    var column = 0

    repeat(9) { r ->
        val numbers = br.readLine().split(" ").map { it.toInt() }
        numbers.forEachIndexed { c, n ->
            if (n > max) {
                max = n
                row = r + 1
                column = c + 1
            }
        }
    }
    br.close()
    println(max)
    println("$row $column")
}