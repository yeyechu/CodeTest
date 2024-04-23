package backjoon.apr16

// ATM : 정렬, 그리디 알고리즘
// 오름차순 정렬되어 있을 때

fun main() {
    val s = java.util.Scanner(System.`in`)

    val size = s.nextLine().toInt()

    val temp = IntArray(1001) { 0 }
    val numbers: java.util.Deque<Int> = java.util.ArrayDeque()
    var sum = 0

    repeat(size) {
        temp[s.nextInt()]++
    }

    temp.forEachIndexed { i, n ->
        if (n != 0) {
            repeat(n) {
                numbers.add(i)
            }
        }
    }

    repeat(size) {
        sum += numbers.poll() * (size - it)
    }

    println(sum)
}