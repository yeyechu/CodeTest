package backjoon._review.stack

// 3월 15일 재풀이
// 스택 수열 : 자료구조, 스택
// size -> 1 ~ 100_000
// 1 ~ size 만큼의 수열을 만들기 위해 push(+)/pop(-) 연산, 못 만들면 NO 출력

// 3월 15일자 mutableList                          통한 풀이 -> 2544ms / 60200kb
// BufferedReader, StringBuilder, IntArray, Deque 통한 풀이 -> 312ms / 31140kb

fun main() {
    // 입력 ───────────────────────────────────────────────────────────────────────
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val size = buffer.readLine().toInt()
    val numbers = IntArray(size) { 0 }

    repeat(size) {
        numbers[it] = buffer.readLine().toInt()
    }

    buffer.close()

    // 계산 ───────────────────────────────────────────────────────────────────────
    val stack: java.util.Deque<Int> = java.util.ArrayDeque()
    val temp: java.util.Deque<Int> = java.util.ArrayDeque()

    var num = 1

    numbers.forEach {

        while (num <= it) {
            stack.push(num)
            num++
            sb.append('+').appendLine()
        }

        if (stack.isNotEmpty() && it == stack.first) {
            temp.push(stack.pop())
            sb.append('-').appendLine()
        }
    }

    // 출력 ───────────────────────────────────────────────────────────────────────
    if (stack.size != 0) {
        println("NO")
    } else {
        println(sb)
    }
}