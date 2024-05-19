package backjoon.apr03

// 막대기 : 구현, 자료구조, 스택
// 236ms

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = br.readLine().toInt()
    val stack: java.util.Deque<Int> = java.util.ArrayDeque()

    // 스택에 숫자를 모두 삽입 후
    // 하나씩 꺼내면서 가장 큰 값을 만날 때마다 개수에 반영 후 최댓값 갱신
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