package backjoon.apr03

// 단어 순서 뒤집기 : 자료구조, 문자열, 파싱, 스택
// string -> 1 ~ 25, 시간 제한 -> 5초

// BufferedReader, StringBuilder, ArrayDeque -> 124ms

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = br.readLine().toInt()

    // 입력받은 문자열을 String 배열로 변환하여 하나씩 꺼내
    // StringBuilder에 이어 붙임으로써 단어 단위로 문장을 거꾸로 뒤집음
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