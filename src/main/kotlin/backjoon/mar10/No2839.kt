package backjoon.mar10

// 설탕 배달 : 수학, 다이나믹 프로그래밍, 그리디 알고리즘

fun main() {
    val input = readln().toInt()

    var bag5 = input / 5
    val setting = {
        if ((input % 5) / 3 > 0) {
            1
        } else {
            0
        }
    }
    var bag3 = setting()

    val packingNumber = {
        bag5 * 5 + bag3 * 3
    }

    while (true) {
        val sum = packingNumber()

        if (sum == input) {
            println(bag5 + bag3)
            break
        } else if(bag5 == 0 && sum > input) {
            println(-1)
            break
        } else {
            if (bag5 > 0) {
                bag5--
            }
            bag3++
            if (input - packingNumber() >= 3) {
                bag3++
            }
        }
    }
}