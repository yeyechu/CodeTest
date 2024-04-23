package backjoon.apr18

// 패션왕 신해빈 : 수학, 자료구조, 조합론, 해시를 사용한 집합과 맵

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()

    repeat(times) {
        val size = buffer.readLine().toInt()
        val map = java.util.HashMap<String, Int>()
        var count = 1

        repeat(size) {
            val (_, sort) = buffer.readLine().split(" ")
            map.putIfAbsent(sort, 0)
            map[sort] = map[sort]!! + 1
        }

        map.forEach { (_, v) ->
            count *= v + 1
        }

        println(count - 1)
    }
}