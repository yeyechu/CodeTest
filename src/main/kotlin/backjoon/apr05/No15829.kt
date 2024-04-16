package backjoon.apr05

// 해싱 : 구현, 문자열, 해싱

fun main() {
    // 입력 ─────────────────────────────────────────────────────────────────────
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    br.readLine().toInt()
    val charArray = br.readLine().toCharArray()

    br.close()

    // 계산 ─────────────────────────────────────────────────────────────────────
    val aNum = 'a' - 1
    val m = 1234567891

    var ans = 0L
    var hash = 1L

    charArray.forEach {
        ans += (it - aNum) * hash
        hash = (hash * 31) % m
    }

    // 출력 ─────────────────────────────────────────────────────────────────────
    println(ans % m)
}