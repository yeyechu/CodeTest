package backjoon.mar08

// 문자열 반복 : 구현, 문자열

fun main() {
    val count = readln().toInt()

    for (i in 1..count) {
        val input = readln().split(" ", limit = 2)

        val times = input[0].toInt()
        val string = input[1].toCharArray()

        for (j in string.indices) {
            repeat(times) {
                print(string[j])
            }
        }
        println()
    }
}