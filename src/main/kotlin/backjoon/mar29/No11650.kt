package backjoon.mar29

// 좌표 정렬 : 정렬

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = br.readLine().toInt()
    val list: MutableList<Pair<Int, Int>> = java.util.LinkedList()

    repeat(times) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        list.add(Pair(x, y))
    }

    val sb = StringBuilder()

    list.sortWith( compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second })

    list.forEach {
        sb.append("${it.first} ${it.second}").append('\n')
    }

    println(sb)
}