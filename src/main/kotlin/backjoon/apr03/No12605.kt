package backjoon.apr03

// 단어 순서 뒤집기 : 자료구조, 문자열, 파싱, 스택

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = br.readLine().toInt()

    repeat(times) {
        val string = br.readLine().split(" ")
        val stack: java.util.Deque<String> = java.util.ArrayDeque()
        val sb = StringBuilder()

        string.forEach {
            stack.push(it)
        }

        stack.forEach {
            sb.append(it).append(' ')
        }
        println("Case #${it + 1}: $sb")
    }
}