package backjoon.mar08

import java.util.*

//fun main() {
//    val input = readln().uppercase(Locale.getDefault()).toCharArray()
//    val alphabets = MutableList(26) { 0 }
//    var maxIndex = 0
//    var maxChar = ' '
//    var count = 0
//
//    for (i in input) {
//        alphabets[i - 'A']++
//        if (maxIndex < alphabets[i - 'A']) {
//            maxIndex = alphabets[i - 'A']
//            maxChar = i
//        }
//    }
//
//    for (i in alphabets.indices) {
//        if (alphabets[i] == maxIndex) {
//            count++
//        }
//    }
//
//    if (count > 1) {
//        println("?")
//    } else {
//        println(maxChar)
//    }
//}

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val string = buffer.readLine().uppercase().toCharArray()
    buffer.close()

    val alphabets = IntArray(26) { 0 }
    val mod = 'A'

    var maxIndex = 0
    var maxChar = ' '
    var count = 0

    for (i in string) {
        alphabets[i - mod]++
        if (maxIndex < alphabets[i - mod]) {
            maxIndex = alphabets[i - mod]
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