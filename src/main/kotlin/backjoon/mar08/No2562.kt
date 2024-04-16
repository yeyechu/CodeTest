package backjoon.mar08

// 최댓값 : 구현

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    val subList = mutableListOf<Int>()

    for (i in 0..8) {
        list.add(s.nextInt())
        subList.add(list[i])
    }

    subList.sort()

    println(subList[8])
    for (i in 0..8) {
        if (subList[8] == list[i]) {
            println(i + 1)
        }
    }
}