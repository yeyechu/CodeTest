package interview.arrays

fun main() {
    println(trapWithTwoPointer(intArrayOf(4, 2, 0, 3, 2, 5)))
    println(trapWithStack(intArrayOf(4, 2, 0, 3, 2, 5)))

    println(trapWithTwoPointer(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
    println(trapWithStack(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
}

fun trapWithTwoPointer(height: IntArray): Int {
    var volume = 0

    var left = 0
    var right = height.size - 1

    var leftMax = height[left]
    var rightMax = height[right]

    while (left < right) {
        //leftMax = height[left].coerceAtLeast(leftMax)
        //rightMax = height[right].coerceAtLeast(rightMax)
        leftMax = kotlin.math.max(height[left], leftMax)
        rightMax = kotlin.math.max(height[right], rightMax)

        if (leftMax <= rightMax) {
            volume += leftMax - height[left]
            left++
        } else {
            volume += rightMax - height[right]
            right--
        }
    }
    return volume
}

fun trapWithStack(height: IntArray): Int {
    var volume = 0
    val stack: java.util.Deque<Int> = java.util.ArrayDeque()

    for (i in height.indices) {
        while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
            val top = stack.pop()

            if (stack.isEmpty()) {
                break
            }

            val distance = i - stack.peek() - 1
            val waters = kotlin.math.min(height[i], height[stack.peek()]) - height[top]
            volume += distance * waters
        }
        stack.push(i)
    }
    return volume
}