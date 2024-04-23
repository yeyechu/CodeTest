package backjoon.apr18

// 계단 오르기 : 다이나믹 프로그래밍

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = buffer.readLine().toInt()

    val numbers = IntArray(size + 1) { 0 }
    val scores = IntArray(size + 1) { 0 }

    for (i in 1..size) {
        numbers[i] = buffer.readLine().toInt()
    }
    buffer.close()

    if (size == 1) {
        println(numbers[1])
        return
    } else if(size == 2) {
        println(numbers[1] + numbers[2])
        return
    }

    scores[1] = numbers[1]
    scores[2] = numbers[2] + scores[1]

    for (i in 3..size) {
        scores[i] = numbers[i] + maxOf(scores[i - 2], scores[i - 3] + numbers[i - 1])
    }

    println(scores[size])
}