package backjoon.mar31

// 벌집 : 수학

fun main() {
    val number = readln().toInt()

    println(find(number))
}

fun find(t: Int): Int {
    var count = 0
    var target = t - 1

    if (t == 1) {
        return 1
    }

    while (target > 0) {
        target -= 6 * count
        count++
    }

    return count
}