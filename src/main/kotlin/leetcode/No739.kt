package leetcode

fun main() {
    println(dailyTemperatures(intArrayOf(23, 24, 25, 21, 19, 22, 26, 23)).toList())
}

fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size)
    val stack: java.util.Deque<Int> = java.util.ArrayDeque()

    temperatures.forEachIndexed { index, _ ->
        while (stack.isNotEmpty() && temperatures[index] > temperatures[stack.peek()]) {
            val last = stack.pop()
            result[last] = index - last
            println("peek() ${stack.peek()}")
            println("마지막 result ${result[last]}")
        }
        stack.push(index)
        println("${stack.toList()}")
        println("${result.toList()}")
    }

    return result
}