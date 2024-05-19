package backjoon.may01

// Z :
// n -> 15 / 시간 제한 -> 0.5초
// n : dimension, r : row, c : column

fun main() {
    val (n, r, c) = readln().split(" ").map { it.toInt() }
    println(findZ(n, r, c))
}

fun findZ(n: Int, r: Int, c: Int): Int {
    var count = 0
    count++
    return count
}