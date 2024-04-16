package interview.strings

import kotlin.system.measureTimeMillis

fun main() {
    val strs = arrayOf("eat", "tea", "tan", "ate", "ant", "cat", "act")
    println("${
        measureTimeMillis { println(anagrams(strs)) }
    }ms")
}

fun anagrams(str: Array<String>): List<List<String>> {
    val results: MutableMap<String, MutableList<String>> = mutableMapOf()

    for (s in str) {
        val key = s.toCharArray().sorted().joinToString("")

        results.getOrPut(key) { mutableListOf() }
        results[key]!!.add(s)
    }
    return ArrayList<List<String>>(results.values)
}