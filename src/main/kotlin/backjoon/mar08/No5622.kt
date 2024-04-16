package backjoon.mar08

// 다이얼 : 구현
// 다이얼 전화기에서 주어진 알파벳을 입력하기 위해 걸리는 최소 시간을 계산하여 출력

fun main() {
    val input = readln().toCharArray()
    var sum = 0
    val list = arrayOf(2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9)

    for (i in input) {
        sum += list[i - 'A'] + 1
    }
    println(sum)
}