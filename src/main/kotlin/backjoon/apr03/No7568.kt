package backjoon.apr03

// 덩치 : 구현, 브루트포스 알고리즘

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val size = br.readLine().toInt()
    val list = mutableListOf<Pair<Int, Int>>()

    // 입력
    repeat(size) { i ->
        val (weight, height) = br.readLine().split(" ").map { it.toInt() }
        list.add(weight to height)
    }

    br.close()

    // 출력
    list.forEach { a ->
        var rank = 1
        list.forEach { b ->
            if (a.first < b.first && a.second < b.second) {
                rank++
            }
        }
        sb.append(rank).append(' ')
    }

    println(sb)
}
