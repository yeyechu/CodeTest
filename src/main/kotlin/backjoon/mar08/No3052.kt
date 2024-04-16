package backjoon.mar08

// 나머지 : 수학, 사칙연산
// 42로 나누었을 때 서로 다른 나머지가 몇 개 있는지 출력

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    val list = mutableListOf<Int>()
    val remainder = MutableList(42) { 0 }
    var count = 0

    for (i in 1..10) {
        list.add(s.nextInt())
        remainder[list[i - 1] % 42]++
    }

    for (i in remainder) {
        if (i != 0) {
            count++
        }
    }

    println(count)
}