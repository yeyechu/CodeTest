package leetcode

fun main() {
    println(combinationSum(intArrayOf(2, 3, 6, 7), 7))
    println(combinationSum(intArrayOf(2, 3, 5), 8))
    println(combinationSum(intArrayOf(2), 1))
}

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val results = mutableListOf<List<Int>>()

    fun dfs(target: Int, start: Int, path: java.util.Deque<Int>) {

        if (target < 0) return
        if (target == 0) {
            results.add(ArrayList(path))
            return
        }

        for (i in start until candidates.size) {
            path.add(candidates[i])
            dfs(target - candidates[i], i, path)
            path.removeLast()
        }
    }

    dfs(target, 0, java.util.ArrayDeque())

    return results
}