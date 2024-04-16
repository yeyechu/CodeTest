package leetcode

fun main() {
    println(canFinish(3, arrayOf(intArrayOf(1, 0), intArrayOf(2, 1))))
    println(canFinish(2, arrayOf(intArrayOf(2, 1), intArrayOf(1, 2))))
}


fun canFinish(numCourses: Int, pres: Array<IntArray>): Boolean {

    val map = mutableMapOf<Int, MutableList<Int>>()

    for (pre in pres) {
        map.putIfAbsent(pre[0], mutableListOf())
        map[pre[0]]!!.add(pre[1])
    }

    val takes = mutableListOf<Int>()
    val taken = mutableListOf<Int>()

    fun dfs(finish: Int, takes: MutableList<Int>, taken: MutableList<Int>): Boolean {
        if (takes.contains(finish)) return false
        if (taken.contains(finish)) return true

        if (map.containsKey(finish)) {
            takes.add(finish)
            for (take in map[finish]!!) {
                if (!dfs(take, takes, taken)) return false
            }

            takes.remove(finish)
            taken.add(finish)
        }
        return true
    }

    for (finish in map.keys) {
        if (!dfs(finish, takes, taken)) return false
    }

    return true
}

// 0을 완료하기 위해서 1을 끝내야 한다 -> [0, 1]
// 코스 n개 0 -> 1 -> 2
// 모든 코스가 완료 가능한지 판별
// 순환 구조면 반복적으로 순환하게 되어 코스를 처리할 수 없음 -> 순환구조인지 판별하여 반환