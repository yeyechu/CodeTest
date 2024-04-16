package interview.strings

import kotlin.system.measureTimeMillis

fun main() {
    val array: CharArray = charArrayOf('a', 'b', 'c', 'd')

    println("${measureTimeMillis {
        reverseString(array)
    }}ms")

    println(array.toList())
}

fun reverseString(s: CharArray) {
    var start = 0
    var end = s.size - 1

    while (start < end) {
        s[start] = s[end].also { s[end] = s[start] }

        start++
        end--
    }
}


