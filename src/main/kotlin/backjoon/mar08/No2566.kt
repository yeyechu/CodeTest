package backjoon.mar08

// 최댓값 : 구현

fun main() {
    val s = java.util.Scanner(System.`in`)

    // 숫자를 저장할 list, 인덱스를 저장할 subList
    val list = mutableListOf<Int>()
    val subList = mutableListOf<Int>()

    var row = 1
    var column = 0

    for (i in 1..81) {
        list.add(s.nextInt())
        subList.add(list[i - 1])
    }

    subList.sort()

    for (i in list.indices) {
        if (list[i] == subList[subList.size - 1]) {
            column = i
        }
    }

    while (column >= 9) {
        column -= 9
        row++
    }

    println(subList[subList.size - 1])
    println("$row ${column + 1}")
}