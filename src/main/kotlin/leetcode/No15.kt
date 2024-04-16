package leetcode

fun main() {

    println(kotlin.system.measureTimeMillis {  })
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    println(threeSum(intArrayOf(0, 1, 1)))
    println(threeSum(intArrayOf(0, 0, 0)))
}

fun threeSum(nums: IntArray): List<List<Int>> {

    val list: MutableList<List<Int>> = mutableListOf()

    nums.sort()
    // java.util.Arrays.sort(nums)

    for (i in 0 until nums.size - 2) {

        if (i > 0 && nums[i] == nums[i - 1])
            continue

        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            var sum = nums[i] + nums[left] + nums[right]

            when {
                sum < 0 -> left++
                sum > 0 -> right--
                else -> {
                    list.add(listOf(nums[i], nums[left], nums[right]))

                    while (left < right && nums[left] == nums[left + 1])
                        left++
                    while (left < right && nums[right] == nums[right - 1])
                        right--

                    left++
                    right--
                }
            }
        }
    }
    return list
}