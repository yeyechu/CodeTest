package backjoon._review._01_implement

// 3월 8일 재풀이
// X보다 작은 수 : 구현
// scanner 입력 받음 -> 488ms
// BufferedReader 입력 + limit 값 설정 -> 204ms
// BufferedReader 입력 -> 180ms

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    val (size, number) = br.readLine().split(" ").map { it.toInt() }
    val numbers = br.readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()

    numbers.forEach {
        if (number > it) {
            sb.append(it).append(' ')
        }
    }
    println(sb)
}