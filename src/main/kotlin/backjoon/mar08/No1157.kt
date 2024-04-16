package backjoon.mar08

import java.util.*

fun main() {
    val input = readln().uppercase(Locale.getDefault()).toCharArray()
    val alphabets = MutableList(26) { 0 }
    var maxIndex = 0
    var maxChar = ' '
    var count = 0

    for (i in input) {
        alphabets[i - 'A']++
        if (maxIndex < alphabets[i - 'A']) {
            maxIndex = alphabets[i - 'A']
            maxChar = i
        }
    }

    for (i in alphabets.indices) {
        if (alphabets[i] == maxIndex) {
            count++
        }
    }

    if (count > 1) {
        println("?")
    } else {
        println(maxChar)
    }
}