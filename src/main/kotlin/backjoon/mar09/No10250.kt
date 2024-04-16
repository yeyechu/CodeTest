package backjoon.mar09

// ACM 호텔 : 구현, 수학, 사칙연산
// N번째 배정되는 방번호 계산

fun main() {
    val s = java.util.Scanner(System.`in`)
    val times = s.nextInt()

    for (i in 1..times) {
        val story = s.nextInt()
        val rooms = s.nextInt()
        var guests = s.nextInt()
        var number = 1

        while (guests > story) {
            guests -= story
            number++
        }

        guests *= 100

        println("${number + guests}")
    }
}