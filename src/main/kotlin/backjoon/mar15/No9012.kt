package backjoon.mar15

// 괄호 : 자료구조, 문자열, 스택

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