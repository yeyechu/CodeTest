package backjoon.apr03

// 통계학 : 수학, 구현, 정렬
// float 정밀도 부족으로 틀렸습니다 뜸

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    var sum = 0.0
    var freq = 0
    val subList: MutableList<Int> = java.util.LinkedList()
    val map = mutableMapOf<Int, Int>()

    val size = br.readLine().toInt()
    val list = IntArray(size) { 0 }

    repeat(size) {
        val temp = br.readLine().toInt()

        list[it] = temp
        sum += temp

        map.putIfAbsent(temp, 0)

        if (map.containsKey(temp)) {
            map[temp] = map[temp]!! + 1
            freq = maxOf(freq, map[temp]!!)
        }
    }

    br.close()

    list.sort()

    map.forEach {
        if (it.value == freq) {
            subList.add(it.key)
        }
    }

    subList.sort()

    val index = if (subList.size == 1) {
        subList[0]
    } else {
        subList[1]
    }

    println(kotlin.math.round(sum / size).toInt()) // 산술평균
    println(list[size / 2]) // 중앙값
    println(index) // 최빈값
    println(list[size - 1] - list[0]) // 범위
}