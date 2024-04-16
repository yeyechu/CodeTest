package backjoon.mar09

// 큰 수 A + B : 구현, 수학, 사칙연산, 임의 정밀도/큰 수 연산
// 0 ~ 10^10000 숫자의 덧셈 계산

fun main() {
    val input = readln().split(" ")
    val num1 = input[0].toCharArray()
    val num2 = input[1].toCharArray()
    val list = mutableListOf<Int>()

    val num1Length = num1.size - 1
    val num2Length = num2.size - 1

    if (num1Length > num2Length) {
        for (i in num1Length downTo 0) {
            list.add(num1[i] - '0')
        }

        for (i in num2Length downTo 0) {
            list[num2Length - i] += num2[i] - '0'
        }
    } else {
        for (i in num2Length downTo 0) {
            list.add(num2[i] - '0')
        }

        for (i in num1Length downTo 0) {
            list[num1Length - i] += num1[i] - '0'
        }
    }

    list.add(0)

    for (i in list.indices) {
        if (list[i] > 9) {
            list[i] %= 10
            list[i + 1]++
        }
    }

    if (list[list.lastIndex] == 0) {
        list.removeAt(list.lastIndex)
    }

    for (i in list.size - 1 downTo 0) {
        print("${list[i]}")
    }
}