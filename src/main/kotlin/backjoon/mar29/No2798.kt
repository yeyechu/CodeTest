package backjoon.mar29

// 블랙잭 : 브루트포스 알고리즘

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    val (size, target) = br.readLine().split(" ").map { it.toInt() }
    val array = br.readLine().split(" ", limit = size).map { it.toInt() }.sortedDescending().toIntArray()

    println(blackJack(array, target))
    println(blackJack(intArrayOf(9, 8, 7, 6, 5), 21))
    println(blackJack(intArrayOf(315, 295, 245, 216, 214, 185, 181, 138, 93, 36), 500))

    println(kotlin.system.measureTimeMillis {
        val intArray = IntArray(100) { it * 2 }.sortedDescending().toIntArray()
        println(blackJack(intArray, 200))
    })
}

fun blackJack(array: IntArray, t: Int): Int {

    val size = array.size - 1
    var max = array[size] + array[size - 1] + array[size - 2]

    fun find(target: Int, index: Int, path: java.util.Deque<Int>) {

        if (target < 0 || path.size > 3) return
        if (path.size == 3) {
            max = maxOf(t - target, max)
            return
        }

        for (i in index until array.size) {
            path.add(array[i])
            find(target - array[i], i + 1, path)
            path.removeLast()
        }
    }

    find(t, 0, java.util.ArrayDeque())

    return max
}