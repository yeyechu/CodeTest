package backjoon.apr18

// 듣보잡 : 자료구조, 문자열, 정렬, 해시를 사용한 집합과 맵

// 시간 제한 : 2초
// LinkedList, Array + sort() -> 시간초과
// map.keys.sort() -> 416ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (n, m) = buffer.readLine().split(" ").map { it.toInt() }

    val map = java.util.HashMap<String, Int>()
    val sb = StringBuilder()

    repeat(n) {
        val name = buffer.readLine()
        map[name] = 0
    }

    repeat(m) {
        val name = buffer.readLine()
        if (map.containsKey(name)) {
            map[name] = 1
        }
    }
    buffer.close()

    val map2 = map.keys.sorted()
    var count = 0

    map2.forEach {
        if (map[it] == 1) {
            sb.append(it).appendLine()
            count++
        }
    }
    println(count)
    print(sb)
}