package backjoon.apr05

// solved.ac 난이도 : 수학, 구현, 정렬

fun main() {
    // 입력 ─────────────────────────────────────────────────────────────────────
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = br.readLine().toInt()

    // 예외처리: 의견이 0일 때
    if (size == 0) {
        println(0)
        return
    }

    val intArray = IntArray(30) { 0 }
    val queue: java.util.Deque<Int> = java.util.ArrayDeque()

    val discardSize = {
        val t = size * 0.15
        if (t - t.toInt() >= 0.5) {
            (t + 1).toInt()
        } else {
            t.toInt()
        }
    }

    repeat(size) {
        intArray[br.readLine().toInt() - 1] += 1
    }

    br.close()

    intArray.forEachIndexed { i, n ->
        if (n != 0) {
            repeat(n) {
                queue.add(i + 1)
            }
        }
    }

    // 계산 ─────────────────────────────────────────────────────────────────────

    var sum = 0
    val count = discardSize()

    repeat(count) {
        queue.pollFirst()
    }

    repeat(count) {
        queue.pollLast()
    }

    while (queue.size > 0) {
        sum += queue.poll()
    }

    // 출력 ─────────────────────────────────────────────────────────────────────
    var ans = sum / (size.toDouble() - count * 2)

    if (ans - ans.toInt() >= 0.5) {
        ans += 1
    }
    println(ans.toInt())
}
