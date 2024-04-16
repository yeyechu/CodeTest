package backjoon.mar09

import java.text.SimpleDateFormat

fun main() {
    val s = java.util.Scanner(System.`in`)
//    val n = s.nextLong()
//    val m = s.nextLong()
//    val result = kotlin.math.abs(n - m)
//    println(result)
//
//    println(
//        SimpleDateFormat("YYYY-MM-dd")
//        .format(System.currentTimeMillis()).toString())

    val list = mutableListOf<Int>()

    for (i in 1..8) {
        list.add(s.nextInt())
    }

    when (list) {
        list.sorted() -> {
            println("ascending")
        }
        list.sortedDescending() -> {
            println("descending")
        }
        else -> {
            println("mixed")
        }
    }
}