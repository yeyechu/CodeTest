package backjoon.apr03

// 팩토리얼 0의 개수 : 수학

fun main() {
    val num = readln().toInt()
    println(find(num))
}

fun find(n: Int): Int {
    var count = 0
    var num = n

    while (num >= 5) {
        count += num / 5
        num /= 5
    }
    return count
}