package backjoon.apr08

// 피보나치 함수 : 다이나믹 프로그래밍

fun main() {
    val times = readln().toInt()
    val list0: MutableList<Int> = java.util.LinkedList()
    val list1: MutableList<Int> = java.util.LinkedList()

    list0.add(1); list0.add(0); list0.add(1);
    list1.add(0); list1.add(1); list1.add(1);

    fun find(n : Int) {
        val lastIndex = list0.size - 1
        if (lastIndex < n) {
            for (i in lastIndex until n) {
                list0.add(list0[i] + list0[i - 1])
                list1.add(list1[i] + list1[i - 1])
            }
        }
    }

    repeat(times) {
        val index = readln().toInt()

        find(index)

        println("${list0[index]} ${list1[index]}")
    }
}

fun fibonacci(n: Int): Int {
    return when (n) {
        0 -> {
            println(0)
            0
        }
        1 -> {
            println(1)
            1
        }
        else -> {
            fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
}