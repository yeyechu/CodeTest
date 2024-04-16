package backjoon.mar31

// 균형잡힌 세상 : 자료구조, 문자열, 스택
// 괄호 짝 맞추기

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    while (true) {
        val string = br.readLine().toCharArray()

        if (string[0] == '.')
            break

        println(find(string))
    }

    br.close()
}
val map = mapOf('(' to ')', '[' to ']', '{' to '}')

fun find(chars: CharArray): String {
    val stack: java.util.Deque<Char> = java.util.ArrayDeque()

    chars.forEach {
        when (it) {
            '(', '[', '{' -> {
                stack.push(map[it])
            }

            ')', ']', '}' -> {
                if (stack.isNotEmpty() && stack.first == it) {
                    stack.pop()
                } else {
                    return "no"
                }
            }
        }
    }

    return if (stack.isEmpty()) {
        "yes"
    } else {
        "no"
    }
}