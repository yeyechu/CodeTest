package backjoon.apr18

// 1로 만들기 : 다이나믹 프로그래밍
// 시간 제한 : 0.15초

fun main() {
    val number = readln().toInt()
    val list = IntArray(1000001) { -1 }

    list[1] = 0; list[2] = 1; list[3] = 1;

    if (list[number] < 0) {
        for (i in 4..number) {
            if (i % 3 == 0 && i % 2 == 0) {
                list[i] = minOf(list[i / 3], list[i / 2]) + 1
            } else if (i % 3 == 0) {
                list[i] = list[i / 3] + 1
            } else if (i % 2 == 0) {
                list[i] = list[i / 2] + 1
            }

            val min = list[i]

            list[i] = list[i - 1] + 1

            if (min > 0) {
                list[i] = minOf(min, list[i])
            }
        }
    }
    println(list[number])
}