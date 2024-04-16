package backjoon.mar29

// 숫자 카드2 : 자료구조, 정렬, 이분 탐색, 해시를 사용한 집합과 맵

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    val size1 = br.readLine().toInt()
    val hasList = br.readLine().split(" ", limit = size1).map { it.toInt() }.toIntArray()

    val size2 = br.readLine().toInt()
    val exampleList = br.readLine().split(" ", limit = size2).map { it.toInt() }.toIntArray()

    val sb = StringBuilder()
    val resultArray = find(hasList, exampleList)
    //val resultArray = find(intArrayOf(6, 3, 2, 10, 10, 10, -10, -10, 7, 3), intArrayOf(10, 9, -5, 2, 3, 4, 5, -10))

    resultArray.forEach {
        sb.append(it).append(' ')
    }

    println(sb)
}

fun find(has: IntArray, ex: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val result = IntArray(ex.size) { 0 }

    has.forEach {
        map.putIfAbsent(it, 0)
        map[it] = map[it]!! + 1
    }

    ex.forEachIndexed { i, n ->
        if (map.containsKey(n)) {
            result[i] = map[n]!!
        }
    }

    return result
}