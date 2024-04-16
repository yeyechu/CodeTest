package backjoon.mar20

// 나머지 합 : 수학, 누적합 -> 실패

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (size, num) = br.readLine().split(" ").map { it.toInt() }
    val list = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    val array = IntArray(size) { 0 }
    array[0] = list[0]

    for (i in 1 until array.size) {
        array[i] += array[i - 1]
    }

    var count = 0

    fun dfs(sum: Int, start: Int, path: java.util.Deque<Int>) {

        if (sum % num == 0) {
            count++
            return
        }
        for (i in start until size) {
            path.add(array[i])
            dfs(sum - array[i], i + 1, path)
            path.removeLast()
        }
    }
    dfs(array[0], 0, java.util.ArrayDeque())

    println(count)
}