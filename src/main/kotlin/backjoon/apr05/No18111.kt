package backjoon.apr05

// 마인크래프트 : 구현, 브루트포스 알고리즘

fun main() {
    // 입력 ───────────────────────────────────────────────────────────
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (n, m, b) = br.readLine().split(" ").map { it.toInt() }

    val list = IntArray(n * m) { 0 }
    var sum = 0

    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    val itemMax = 64_000_000

    repeat(n) { row ->
        val input = br.readLine().split(" ", limit = m).map { it.toInt() }

        input.forEachIndexed { index, num ->
            list[row * m + index] = num
            sum += num
            min = minOf(min, num)
            max = maxOf(max, num)
        }
    }

    br.close()

    // 계산 ───────────────────────────────────────────────────────────
    // (배치, 제거) : 블록 배치에 1초, 제거에 2초
    var resultTime = Int.MAX_VALUE
    var resultHeight = 0

    for (height in min..max) {
        var item = b
        var time = 0

        list.forEach {
            val diff = it - height
            if (diff < 0) {
                item -= kotlin.math.abs(diff)
                time += kotlin.math.abs(diff)
            } else if (diff > 0) {
                item += diff
                time += diff * 2
            }
        }

        if (item in 0 until itemMax) {
            if (time <= resultTime) {
                resultTime = time
                resultHeight = height
            } else {
                break
            }
        }
    }

    // 출력 ───────────────────────────────────────────────────────────
    println("$resultTime $resultHeight")
}