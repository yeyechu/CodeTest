package backjoon.mar08

// 상수 : 구현, 수학
// 주어진 숫자를 거꾸로 읽어 둘 중 큰 숫자를 출력

fun main() {
    val numbers = readln().split(" ")
    val num1 = numbers[0].toCharArray()
    val num2 = numbers[1].toCharArray()

    num1[0] = num1[2].also { num1[2] = num1[0] }
    num2[0] = num2[2].also { num2[2] = num2[0] }

    var input1 = ""
    var input2 = ""

    for (i in num1) {
        input1 += i.toString()
    }

    for (i in num2) {
        input2 += i.toString()
    }

    if (input1.toInt() > input2.toInt()) {
        println(input1)
    } else {
        println(input2)
    }
}