package backjoon._review.stack.parenthesis

// 3월 31일 재풀이
// 균형잡힌 세상 : 자료구조, 문자열, 스택
// 괄호 짝 맞추기

// 각 케이스 개별 처리 -> 328ms
// 케이스를 map 처리 -> 292ms
// map 처리 + StringBuilder -> 196ms

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    while (true) {
        val string = br.readLine().toCharArray()

        if (string[0] == '.')
            break

        sb.append(find(string)).appendLine()
    }

    br.close()
    println(sb)
}
val map = mapOf('(' to ')', '{' to '}', '[' to ']')

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

/*
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

fun find(chars: CharArray): String {
    val stack: java.util.Deque<Char> = java.util.ArrayDeque()

    chars.forEach {
        when(it) {
            '(' -> { stack.push(')') }
            '[' -> { stack.push(']') }
            '{' -> { stack.push('}') }

            ')' -> {
                if (stack.isNotEmpty() && stack.first == it) {
                    stack.pop()
                } else {
                    return "no"
                }
            }
            ']' -> {
                if (stack.isNotEmpty() && stack.first == it) {
                    stack.pop()
                } else {
                    return "no"
                }
            }
            '}' -> {
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
* */
