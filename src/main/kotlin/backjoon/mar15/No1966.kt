package backjoon.mar15

// 프린터 큐 : 구현, 자료구조, 시뮬레이션, 큐
// 우선순위가 주어진 큐의 인쇄 순번 출력

fun main() {
    val s = java.util.Scanner(System.`in`)
    val times = s.nextLine().toInt()

    repeat(times) {
        // 첫번 째 입력 받는 부분
        val numbers = s.nextInt()
        val target = s.nextInt(); s.nextLine()

        // 두번 째 입력 받는 부분
        val priority: java.util.Deque<Int> = java.util.ArrayDeque()

        repeat(numbers) {
            priority.add(s.nextInt())
        }; s.nextLine()

        // 분류하는 부분
        var current = target
        var count = 0

        while (priority.isNotEmpty()) {
            val max = priority.max()
            val temp = priority.poll()

            if (temp == max) {
                count++
                if (current == 0) break
            } else {
                priority.add(temp)
            }

            if (current > 0) {
                current--
            } else {
                current = priority.size - 1
            }
        }
        println(count)
    }
}