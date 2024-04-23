package backjoon.apr16

// 4월 13일 재풀이
// 동전 0 : 그리디 알고리즘
// size -> 1 ~ 10, value -> 1 ~ 100,000,000

// 시간 제한 -> 1초
// dfs -> 시간 초과
// 그리디 알고리즘 -> 132ms

fun main() {
    // 입력 ───────────────────────────────────────────────────────────────────────
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (size, value) = buffer.readLine().split(" ").map { it.toInt() }

    val list = IntArray(size) { 0 }

    repeat(size) {
        list[size - it - 1] = buffer.readLine().toInt()
    }
    buffer.close()

    // 계산 ───────────────────────────────────────────────────────────────────────
    // list.size -> 최대 10

    var start = -1
    var ans = 0
    var target = value

    for (i in list.indices) {
        if (list[i] == value) {
            println(1)
            return
        } else if (list[i] < value) {
            start = i
            break
        }
    }

    // target -> 최대 1억
    for (i in start until size) {
        if (target == 0) {
            break
        }

        if (list[i] <= target) {
            val times = target / list[i]
            target -= times * list[i]
            ans += times
        }
    }
    // 출력 ───────────────────────────────────────────────────────────────────────
    println(ans)
}