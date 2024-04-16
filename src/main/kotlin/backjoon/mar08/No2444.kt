package backjoon.mar08

// 별찍기 : 구현

fun main() {
    val number = readln().toInt()

    var start = 1
    var end = number - 1

    while (start < number * 2) {
        for (j in 1..end) {
            print(" ")
        }

        for (j in 1..start) {
            print("*")
        }

        start += 2
        end--
        println()
    }

    start -= 4
    end += 2

    while (start >= 1) {
        for (j in 1..end) {
            print(" ")
        }

        for (j in 1..start) {
            print("*")
        }

        start -= 2
        end++
        println()
    }
}