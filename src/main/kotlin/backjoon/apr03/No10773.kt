package backjoon.apr03

// 제로 : 스택, 자료구조, 구현
// MutableList<Int> = LinkedList()로 구현했을 때 -> 시간 초과
// Deque<Int> = ArrayDeque() ||
// Deque<Int> = LinkedList() 구현 시 실행 시간 200ms

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = br.readLine().toInt()

    val numbers: java.util.Deque<Int> = java.util.LinkedList()
    var sum = 0

    repeat(times) {
        val num = br.readLine().toInt()

        if (num == 0) {
            numbers.pop()
        } else {
            numbers.push(num)
        }
    }

    for (i in 0 until numbers.size) {
        sum += numbers.pop()
    }

    println(sum)
}