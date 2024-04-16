package leetcode

fun main() {
    println(permute(intArrayOf(1)))
    println(permute(intArrayOf(0, 1)))
    println(permute(intArrayOf(1, 2, 3)))
}



fun permute(nums: IntArray): List<List<Int>> {
    val results: MutableList<List<Int>> = mutableListOf()

    fun dfs(prev: MutableList<Int>, elements: List<Int>) {
        if (elements.isEmpty()) {
            results.add(prev.toList())
            //results.add(prev.stream().collect(Collectors.toList()))
            return
        }

        for (e in elements) {
            val next: MutableList<Int> = ArrayList(elements)
            next.remove(e)
            prev.add(e)

            dfs(prev, next)
            prev.remove(e)
        }
    }

    //val list = java.util.Arrays.stream(nums).boxed().collect(Collectors.toList())
    dfs(mutableListOf(), nums.toList())

    return results
}