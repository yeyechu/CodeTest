package goorm

import kotlin.math.roundToInt

fun main() {
//    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
//    val sb = StringBuilder()
//
//    val size = buffer.readLine().toInt()
//    val letters = buffer.readLine().toCharArray()
//
//    buffer.close()
//
//    repeat(size) {
//        when  {
//            letters[it].isUpperCase() -> sb.append(letters[it].lowercase())
//            letters[it].isLowerCase() -> sb.append(letters[it].uppercase())
//        }
//    }
//
//    print(sb)
    println(((1.123123 + 0.123123) * 1000000).roundToInt().toFloat() / 1000000)
    println(java.text.DecimalFormat("#.######").format(1.123123 + 0.123123))
}

