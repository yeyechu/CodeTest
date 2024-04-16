package backjoon.mar20

// 달팽이는 올라가고 싶다 : 수학

fun main() {
    val input = readln().split(" ")

    val go = input[0].toInt()
    val back = input[1].toInt()
    val height = input[2].toInt()

    val total = {
        if (go == height) {
            1
        } else if (go + back >= height) {
            2
        } else {
            if ((height - back) % (go - back) > 0) {
                ((height - back) / (go - back) ) + 1
            } else {
                (height - back) / (go - back)
            }
        }
    }

    println(total())

    var count = 0
    var sum = back
    while (sum < height) {
        sum -= back
        sum += go
        count++
    }

    println(count)
}