package leetcode

fun main() {
    println(subsets(intArrayOf(1, 2, 3)))
    println(subsets(intArrayOf(0)))
    println(subsets(intArrayOf()))
}

fun subsets(nums: IntArray): List<List<Int>> {
    val results = mutableListOf<List<Int>>()

    fun dfs(index: Int, path: java.util.Deque<Int>) {




        results.add(ArrayList(path))

        for (i in index until nums.size) {
            path.add(nums[i])
            dfs(i + 1, path)
            path.removeLast()
        }
    }


    dfs(0, java.util.ArrayDeque())

    return results
}