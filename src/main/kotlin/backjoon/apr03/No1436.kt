package backjoon.apr03

// 영화감독 숌 : 브루트포스 알고리즘

fun main() {
    var n = readln().toInt()
    var num = 665

    while (n != 0) {
        num++
        var count = 0
        var temp = num

        while (temp > 0) {
            if (temp % 10 == 6) {
                count++
            } else {
                count = 0
            }

            temp /= 10

            if (count == 3) {
                n--
            }
        }
    }

    println(num)
}