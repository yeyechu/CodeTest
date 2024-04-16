package backjoon.mar20

// 나이순 정렬 : 정렬

fun main() {
    val size = readln().toInt()
    val members: java.util.Queue<Triple<Int, Int, String>> = java.util.LinkedList()

    repeat(size) {
        val (age, name) = readln().split(" ")
        members.add(Triple((age.toInt()), it, name))
    }

    val m = members.sortedWith { a: Triple<Int, Int, String>, b: Triple<Int, Int, String> ->
        when (a.first) {
            b.first -> a.second.compareTo(b.second)
            else -> a.first.compareTo(b.first)
        }
    }

    m.forEach {
        println("${it.first} ${it.third}")
    }
}

