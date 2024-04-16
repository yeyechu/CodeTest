package backjoon.apr03

// 랜선 자르기 : 이진 탐색, 매개변수 탐색
// 반례 1 1 21억....

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    val (k, n) = br.readLine().split(" ").map { it.toInt() }
    val array = IntArray(k) { 0 }
    var max = 1

    repeat(k) {
        array[it] = br.readLine().toInt()
        max = maxOf(max, array[it])
    }

    br.close()

    println(cut(n, max, array))
}

fun cut(n: Int, m: Int, array: IntArray): Long {
    var min = 0L
    var max = m.toLong() + 1

    while (min < max) {

        val mid = (min + max) / 2L
        var count = 0L

        array.forEach {
            count += it / mid
        }

        println("min $min max $max mid $mid count $count")

        if (count < n) {
            max = mid
        } else {
            min = mid + 1
        }
    }
    return min - 1
}