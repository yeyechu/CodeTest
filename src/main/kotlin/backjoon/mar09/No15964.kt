package backjoon.mar09

// 이상한 기호 : 구현, 수학, 사칙연산
// A@B = (A + B) x (A - B) 계산하여 출력
// A, B -> 1 ~ 100_000
// 곱셈 연산 시 Int 범위 초과함 주의

fun main() {
    val s = java.util.Scanner(System.`in`)
    val a = s.nextLong()
    val b = s.nextLong()

    println("${(a + b) * (a - b)}")
}