package backjoon.apr13

// 동전 0 : 그리디 알고리즘
// size -> 1 ~ 10, value -> 1 ~ 100,000,000
// 시간 초과

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (size, value) = buffer.readLine().split(" ").map { it.toInt() }

    val list = IntArray(size) { 0 }

    repeat(size) {
        list[size - it - 1] = buffer.readLine().toInt()
    }

    buffer.close()

    println(find(value, list))
}

fun find(target: Int, nums: IntArray): Int {
    val list = mutableListOf<List<Int>>()
    var ans = Int.MAX_VALUE

    fun dfs(target: Int, index: Int, path: java.util.Deque<Int>) {

        if (target < 0 || path.size > ans) return
        if (target == 0) {
            list.add(ArrayList(path))
            ans = minOf(ans, path.size)
            return
        }

        for (i in index until nums.size) {
            path.add(nums[i])
            dfs(target - nums[i], i, path)
            path.removeLast()
        }
    }

    dfs(target, 0, java.util.ArrayDeque())

    return ans
}