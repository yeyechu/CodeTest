package backjoon.mar08

// X보다 작은 수 : 구현

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    val size = s.nextInt()
    val target = s.nextInt()

    val numbers = mutableListOf<Int>()
    for (i in 1..size) {
        numbers.add(s.nextInt())
    }

    for (i in numbers) {
        if (i < target) {
            print("$i ")
        }
    }
}