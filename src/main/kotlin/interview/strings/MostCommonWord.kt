package interview.strings

import kotlin.system.measureTimeMillis

fun main() {
    val para = "Ross hit a ball, the hit BALL flew far away after it was hit."
    val ban = arrayOf("hit")

    println("${measureTimeMillis {
        mostCommonWord(para, ban)
    }}ms")

    println(mostCommonWord(para, ban))
}

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    val counts: MutableMap<String, Int> = mutableMapOf()
    val words =
        paragraph
        .replace("\\W+".toRegex(), " ")
        .lowercase()
        .trim()
        .split(" ")

    for (w in words) {
        if(!banned.contains(w)) {
            counts[w] = counts.getOrDefault(w, 0) + 1
        }
    }

    return counts.maxBy { it.value }.key
}

