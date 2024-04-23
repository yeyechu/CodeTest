package backjoon.apr18

// 파도반 수열 : 수학, 다이나믹 프로그래밍

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = buffer.readLine().toInt()
    val list = LongArray(101) { 0 }

    list[1] = 1; list[2] = 1; list[3] = 1; // list[4] = 2; list[5] = 2; list[6] = 3; list[7] = 4; list[8] = 5; list[9] = 7;

    for (i in 4..100) {
        list[i] = list[i - 2] + list[i - 3]
    }

    repeat(size) {
        println(list[buffer.readLine().toInt()])
    }
    buffer.close()
}