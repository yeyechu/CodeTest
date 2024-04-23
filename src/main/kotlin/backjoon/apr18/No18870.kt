package backjoon.apr18

// 좌표 압축 : 정렬, 값/좌표압축
// 시간 2932ms 걸림

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    buffer.readLine().toInt()
    val numbers = buffer.readLine().split(" ").map { it.toInt() }

    buffer.close()

    val list = numbers.distinct().sorted()
    val map = java.util.HashMap<Int, Int>()

    list.forEachIndexed { i, n ->
        map[n] = i
    }

    numbers.forEach { n ->
        sb.append(map[n]).append(' ')
    }
    println(sb)
}