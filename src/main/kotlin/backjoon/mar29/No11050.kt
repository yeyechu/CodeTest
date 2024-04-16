package backjoon.mar29

// 이항계수1 : 구현, 수학, 조합론

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    println(find(n) / (find(k) * find(n - k)))
}

fun find(x: Int): Int {
    var result = 1

    for (i in x downTo 1) {
        result *= i
    }

    return result
}