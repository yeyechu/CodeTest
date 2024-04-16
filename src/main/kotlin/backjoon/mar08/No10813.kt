package backjoon.mar08

// 공 바꾸기 : 구현, 시뮬레이션
// 공 교환 방법에 따라 교환하여 공 번호 출력

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    val size = s.nextInt()
    val times = s.nextInt()

    val list = MutableList(size) { it + 1 }

    for (i in 1..times) {
        val num1 = s.nextInt() - 1
        val num2 = s.nextInt() - 1

        list[num1] = list[num2].also { list[num2] = list[num1] }
    }

    for (i in list) {
        print("$i ")
    }
}