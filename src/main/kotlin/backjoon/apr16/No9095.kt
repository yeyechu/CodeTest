package backjoon.apr16

// 1, 2, 3 더하기 : 다이나믹 프로그래밍

// <number 조건> : 양수이고 11보다 작음
// A[n] = A[n - 1] + A[n - 2] + A[n - 3]

fun main() {
    val list = IntArray(11) { 0 }
    val size = readln().toInt()

    list[1] = 1
    list[2] = 2
    list[3] = 4

    for (i in 4..10) {
        list[i] = list[i - 1] + list[i - 2] + list[i - 3]
    }

    repeat(size) {
        println(list[readln().toInt()])
    }
}