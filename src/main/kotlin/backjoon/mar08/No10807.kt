package backjoon.mar08

// 개수 세기 : 구현
// N개 정수에서 정수 v가 몇개인지 출력

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    val size = s.nextInt()
    val numbers = mutableListOf<Int>()

    for (i in 1..size) {
        numbers.add(s.nextInt())
    }

    val target = s.nextInt()
    var count = 0

    for (n in numbers) {
        if (n == target) {
            count++
        }
    }

    println(count)
}