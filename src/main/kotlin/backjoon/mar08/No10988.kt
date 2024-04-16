package backjoon.mar08

// 팰린드롬인지 확인하기 : 구현, 문자열
// 투포인터를 이용해 문자 확인

fun main() {
    val input = readln().toCharArray()

    var start = 0
    var end = input.size - 1
    var bool = 1

    while (start < end) {
        if (input[start] == input[end]) {
            start++
            end--
        } else {
            bool = 0
            break
        }
    }
    println(bool)
}