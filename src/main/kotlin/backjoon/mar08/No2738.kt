package backjoon.mar08

// 행렬 덧셈 : 구현, 수학, 사칙연산

fun main() {
    val s = java.util.Scanner(System.`in`)

    val row = s.nextInt()
    val column = s.nextInt()

    val dimension = row * column

    val matrix1 = mutableListOf<Int>()
    val matrix2 = mutableListOf<Int>()

    for (i in 1..dimension) {
        matrix1.add(s.nextInt())
    }

    for (i in 1..dimension) {
        matrix2.add(s.nextInt())
    }

    for (i in 1..dimension) {
        matrix1[i - 1] += matrix2[i - 1]
    }

    for (i in 1..row) {
        for (j in 1..column) {
            print("${matrix1[column * (i - 1) + (j - 1)]} ")
        }
        println()
    }
}