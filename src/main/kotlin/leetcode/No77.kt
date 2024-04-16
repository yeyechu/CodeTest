package leetcode

fun main() {
    println(combine(5, 3))
}

fun combine(n: Int, k: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    fun dfs(elements: java.util.LinkedList<Int>, start: Int, k: Int) {
        if (k == 0) {
            result.add(elements.toList())
            return
        }

        for (i in start..n) {
            elements.add(i)
            dfs(elements, i + 1, k - 1)
            elements.removeLast()
        }
    }

    dfs(java.util.LinkedList(), 1, k)

    return result
}