package backjoon.mar08

// 과제 안 내신 분..? : 구현
// (1..30) 총 28개 입력 중 빠진 2개를 오름차순으로 출력

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    val list = MutableList(30) { it + 1 }

    for (i in 1..28) {
        list.remove(s.nextInt())
    }

    for (i in list) {
        println(i)
    }
}