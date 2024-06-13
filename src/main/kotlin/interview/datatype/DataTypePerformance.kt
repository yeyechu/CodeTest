package interview.datatype

import kotlin.system.measureTimeMillis

fun main() {
    val times = 100_000_000

    val intElements = IntArray(times)
    // 삽입
    println("${measureTimeMillis {
        for (i in 0 until times - 1)
            intElements[i] = 1
        intElements[times - 1] = 2
    }} ms")

    var index = 0
    // 찾기
    println("${measureTimeMillis {
        while (2 != intElements[index])
            index++
    }} ms")

    // ───────────────────────────────────────────
    val integerElements = arrayOfNulls<Int>(times)
    // 삽입
    println("${measureTimeMillis {
        for (i in 0 until times - 1)
            integerElements[i] = 1
        integerElements[times - 1] = 2
    }} ms")

    index = 0
    // 찾기
    println("${measureTimeMillis {
        while (2 != integerElements[index])
            index++
    }} ms")
}

