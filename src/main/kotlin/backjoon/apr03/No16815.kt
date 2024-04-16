package backjoon.apr03

// Star in Parentheses : 자료구조, 문자열, 스택

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val string = br.readLine().toCharArray()

    val stack: java.util.Deque<Char> = java.util.ArrayDeque()
    var switch = false

    string.forEach {
        when {
            it == '*' -> { switch = true }
            it == '(' && !switch -> { stack.push('(') }
            it == ')' && !switch -> { stack.pop() }
            it == ')' && switch -> {
                println(stack.size)
                return
            }
        }
    }

    println(stack.size)
}