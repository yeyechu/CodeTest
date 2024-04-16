package backjoon.apr13

// 수학은 비대면 강의입니다 : 수학, 브루트포스 알고리즘
// 각 입력은 -999 ~ 999 사이의 수

fun main() {
    val s = java.util.Scanner(System.`in`)

    val a1 = s.nextInt()
    val b1 = s.nextInt()
    val c1 = s.nextInt()

    val a2 = s.nextInt()
    val b2 = s.nextInt()
    val c2 = s.nextInt()

    s.close()

    var y = 0
    var x = 0

    if (a1 == b1 && a2 == b2) {
        y = b1 / 2
        x = y
    } else {
        y = ((a2 * c1) - (a1 * c2)) / ((a2 * b1) - (a1 * b2))
        x = if (a1 != 0) {
            (c1 - b1 * y) / a1
        } else {
            (c2 - b2 * y) / a2
        }
    }

    println("$x $y")
}