package interview.strings

import java.util.*
import kotlin.system.measureTimeMillis

fun main() {
    println("${measureTimeMillis {
        isPalindrome("Do geese see God?")
    }}ms")

    println("${measureTimeMillis {
        isPalindrome2("Do geese see God?")
    }}ms")
}

fun isPalindrome(s: String) : Boolean {
    var start = 0
    var end = s.length - 1

    while (start < end) {
        when {
            !Character.isLetterOrDigit(s[start]) -> start++
            !Character.isLetterOrDigit(s[end]) -> end--
            else -> {
                if (Character.toLowerCase(s[start]) != Character.toLowerCase(s[end])) {
                    return false
                }
                start++
                end--
            }
        }
    }
    return true
}

fun isPalindrome2(s: String) : Boolean {
    val sFiltered = s.replace("[^A-Za-z0-9]".toRegex(), "").lowercase()
    val sReversed = StringBuilder(sFiltered).reverse().toString()

    return sFiltered == sReversed
}

