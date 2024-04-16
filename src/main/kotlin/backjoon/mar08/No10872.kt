package backjoon.mar08

// 팩토리얼 : 구현, 수학

fun main() {
    val number = readln().toInt()
    println(factorial(number))
}

fun factorial(n: Int): Int {
    return when (n) {
        0 -> 1
        1 -> 1
        else -> n * factorial(n - 1)
    }
}