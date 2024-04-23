package backjoon.apr18

// 숨바꼭질 : 그래프이론, 그래프탐색, 너비우선탐색

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    val aDist = kotlin.math.abs(n - k)
    val dist = IntArray(aDist) { 0 }

    var current = n
    var distance = {
        k - current
    }

    while (distance() != 0) {
        if (n * 2 < distance()) {
            current = teleport(current)
        }
    }

    println(dist[aDist - 1])
}

fun walk(n: Int): Int {
    return n + 1
}

fun teleport(n: Int): Int {
    return 2 * n
}