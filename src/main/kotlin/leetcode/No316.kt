package leetcode

import java.util.*

fun main() {
    println(removeDuplicateLetters("dbacdcbc"))
}

fun removeDuplicateLetters(s: String): String {
    val counter: MutableMap<Char, Int> = HashMap()
    val seen: MutableMap<Char, Boolean> = HashMap()
    val stack: Deque<Char> = ArrayDeque()

    for (c in s) {
        counter[c] = counter.getOrDefault(c, 0) + 1
    }

    println(counter.toList()) // ★★★★★★★★★★★★★★★★★

    for (c in s) {
        counter[c] = counter[c]!! - 1

        println(" $c ───────────────────────────────────────────")
        println(counter.toList()) // ★★★★★★★★★★★★★★★★★

        if (seen[c] == true) {
            println("continue..")
            continue
        }

        while (stack.isNotEmpty() && stack.peek() > c && counter[stack.peek()]!! > 0) {
            println("looping.. ${stack.peek()}")
            seen[stack.pop()] = false
        }

        stack.push(c)
        seen[c] = true

        println(seen.toList()) // ★★★★★★★★★★★★★★★★★

    }

//    val sb = StringBuilder()
//
//    while (sb.isNotEmpty()) {
//        sb.append(stack.pollLast())
//    }
//
//    return sb.toString()
    return stack.joinToString("").reversed()
}