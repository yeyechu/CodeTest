package backjoon.apr18

// 나는야 포켓몬 마스터 이다솜 : 자료구조, 해시를 사용한 집합과 맵

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val (n, m) = buffer.readLine().split(" ").map { it.toInt() }
    val map = java.util.HashMap<Int, String>()
    val map2 = java.util.HashMap<String, Int>()

    repeat(n) {
        val name = buffer.readLine()
        map[it + 1] = name
        map2[name] = it + 1
    }

    repeat(m) {
        val input = buffer.readLine()
        if (input.toIntOrNull() == null) {
            sb.append(map2[input]).appendLine()
        } else {
            sb.append(map[input.toInt()]).appendLine()
        }
    }

    buffer.close()
    print(sb)
}