package backjoon._review.stack.parenthesis

// 3월 15일 재풀이, 괄호 정리(1)
// 괄호 : 자료구조, 문자열, 스택

// kotlin.io.readln / map 사용 -> 124ms
// bufferedReader / map 사용 -> 112ms
// bufferedReader / char 사용 -> 104ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()

    repeat(times) {
        // 입력 ──────────────────────────────────────────────────────
        val stack: java.util.Deque<Char> = java.util.ArrayDeque()
        val input = buffer.readLine().toCharArray()
        var isCorrect = true

        // 계산 ──────────────────────────────────────────────────────
        for (c in input) {
            if (c != ')') {
                stack.push(c)
            } else if (stack.isEmpty() || stack.pop() != '(') {
                isCorrect = false
                break
            }
        }
        if (isCorrect) {
            isCorrect = stack.size == 0
        }

        // 출력 ──────────────────────────────────────────────────────
        if (isCorrect) {
            println("YES")
        } else {
            println("NO")
        }
    }

    buffer.close()
}

/*
fun main() {
    val map = mapOf(')' to '(')
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()

    repeat(times) {
        val stack: java.util.Deque<Char> = java.util.ArrayDeque()
        val input = buffer.readLine().toCharArray()
        var isCorrect = true

        for (i in input.indices) {
            if (!map.containsKey(input[i])) {
                stack.push(input[i])
            } else if (stack.isEmpty() || map[input[i]] !== stack.pop()) {
                isCorrect = false
                break
            }
        }

        if (isCorrect) {
            isCorrect = stack.size == 0
        }

        if (isCorrect) {
            println("YES")
        } else {
            println("NO")
        }
    }

    buffer.close()
}
* */