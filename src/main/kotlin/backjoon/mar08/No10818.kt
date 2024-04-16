package backjoon.mar08

// 최소, 최대 : 구현, 수학
// 입력받은 문자의 최소와 최대를 출력

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    val size = s.nextInt()
    val list = mutableListOf<Int>()

    for (i in 1..size) {
        list.add(s.nextInt())
    }

    list.sort()

    print("${list[0]} ")
    print(list[size - 1])
}