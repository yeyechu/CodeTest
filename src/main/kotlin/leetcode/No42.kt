package leetcode

fun main() {
    println(trap(intArrayOf(0, 1, 0, 2, 1 ,0, 1, 3, 2, 1, 2, 1)))
    println(trap(intArrayOf(4, 2, 0, 3, 2, 5)))
}
fun trap(height: IntArray): Int {
    var left = 0
    var right = height.size - 1

    var leftMax = 0
    var rightMax = 0

    var ans = 0

    while (left < right) {
        leftMax = maxOf(height[left], leftMax)
        rightMax = maxOf(height[right], rightMax)

        if (leftMax < rightMax) {
            ans += leftMax - height[left]
            left++
        } else {
            ans += rightMax - height[right]
            right--
        }
    }
    return ans
}