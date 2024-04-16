package backjoon.mar09

// 팰린드롬수 : 구현, 문자열

fun main() {
    val s = java.util.Scanner(System.`in`)

    while (true) {
        val input = s.nextLine().toCharArray()
        var isPalindrome = true

        if (input[0] == '0') {
            break
        }

        var start = 0
        var end = input.size - 1

        while (start < end) {
            if (input[start] == input[end]) {
                start++
                end--
            } else {
                isPalindrome = false
                break
            }
        }
        if (isPalindrome) {
            println("yes")
        } else {
            println("no")
        }
    }
}