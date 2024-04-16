package backjoon.mar09

// OX 퀴즈 : 구현, 문자열
// 테스트 케이스에 대한 점수 출력

fun main() {
    var count = 0
    val times = readln().toInt()

    while (count < times) {
        val input = readln().toCharArray()
        val scoreList = MutableList(input.size) { it + 1 }
        var sum = 0

        for (i in input.indices) {
            if (input[i] == 'X') {
                scoreList[i] = 0
            }
        }

        for (i in 1 until input.size) {
            if (scoreList[i] != 0) {
                scoreList[i] = scoreList[i - 1] + 1
            }
        }

        for (i in scoreList) {
            sum += i
        }
        println(sum)
        count++
    }
}