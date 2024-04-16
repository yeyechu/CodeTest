package backjoon.apr03

// 막대기 : 구현, 자료구조, 스택

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = br.readLine().toInt()
    val stack: java.util.Deque<Int> = java.util.ArrayDeque()

    var max = 0
    var count = 0

    repeat(size) {
        stack.push(br.readLine().toInt())
    }

    repeat(size) {
        val temp = stack.pop()
        if (max < temp) {
            count++
            max = temp
        }
    }

    println(count)
}