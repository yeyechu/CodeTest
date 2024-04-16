package backjoon.mar09

// 검증수 : 구현, 수학, 사칙연산

fun main() {
    val s = java.util.Scanner(System.`in`)
    var validNumber = 0

    for (i in 1..5) {
        val input = s.nextInt()
        validNumber += input * input
    }

    println("${validNumber % 10}")
}