package backjoon.apr13

// 1로 만들기 : 다이나믹 프로그래밍
// number -> 1 ~ 10^6, 시간 제한 -> 0.15초

fun main() {
    var number = readln().toInt()
    var ans = Int.MAX_VALUE
    var count = 0

    while (true) {

        if (number == 1) {
            ans = minOf(ans, count)
            break
        }

        if (number % 3 == 0) {
            number /= 3
        } else {
            number--
        }
        count++

        if (number % 3 == 0 && number % 2 == 0) {
            number /= 3
            count++
        } else if (number % 2 == 0) {
            number /= 2
            count++
        }
    }

    println(ans)
}