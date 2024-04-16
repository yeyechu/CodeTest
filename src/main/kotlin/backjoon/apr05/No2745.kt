package backjoon.apr05

// 진법 변환 : 구현, 수학, 문자열

fun main() {
    val (s, n) = readln().split(" ")

    val string = s.toCharArray()
    val number = n.toInt()
    var answer = 0
    var temp = 1

    for (i in string.size - 1 downTo  0) {
        var trans = string[i] - 'A' + 10

        if (string[i].isDigit()) {
            trans = string[i] - '0'
        }

        answer += trans * temp
        temp *= number
    }
    println(answer)
}