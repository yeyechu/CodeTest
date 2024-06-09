package interview.arrays

import kotlin.system.measureTimeMillis

fun main() {
    println(measureTimeMillis { twoSum(intArrayOf(3, 2, 4), 6).toList() })
    println(measureTimeMillis { twoSum1(intArrayOf(3, 2, 4), 6).toList() })
    println(measureTimeMillis { twoSum2(intArrayOf(3, 2, 4), 6).toList() })
    println(measureTimeMillis { twoSum3(intArrayOf(3, 2, 4), 6).toList() })
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target)
                return intArrayOf(i, j)
        }
    }
    return intArrayOf(0, 0)
}

fun twoSum1(nums: IntArray, target: Int): IntArray {
    val numsMap = java.util.HashMap<Int, Int>()

    for ( i in nums.indices) {
        numsMap[nums[i]] = i
    }

    for (i in nums.indices) {
        if (numsMap.containsKey(target - nums[i])) {
            val temp = numsMap[target - nums[i]]!!
            if (i != temp)
                return intArrayOf(i, temp)
        }
    }
    return intArrayOf(0, 0)
}

fun twoSum2(nums: IntArray, target: Int): IntArray {
    val numsMap = java.util.HashMap<Int, Int>()

    for ((i, num) in nums.withIndex()) {
        if (numsMap.containsKey(target - num)) {
            return intArrayOf(numsMap[target - num] ?: 0, i)
        }
        numsMap[num] = i
    }
    return intArrayOf(0, 0)
}

fun twoSum3(nums: IntArray, target: Int): IntArray {
    var left = 0
    var right = nums.size - 1

    while (left != right) {
        if (nums[left] + nums[right] < target) {
            left++
        } else if (nums[left] + nums[right] > target) {
            right--
        } else {
            return intArrayOf(left, right)
        }
    }
    return intArrayOf(0, 0)
}