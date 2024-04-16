package backjoon.mar31

// 부녀회장이 될테야 : 구현, 수학, 다이나믹 프로그래밍
// 방 번호 구하기

fun main() {
    val times = readln().toInt()

    repeat(times) {
        val k = readln().toInt()
        val n = readln().toInt()

        println(find(k, n))
    }
}

val mapping: MutableMap<Int, IntArray> = mutableMapOf(
    0 to IntArray(14) { it + 1 }
)

fun find(floor: Int, number: Int): Int {

    val list = mutableListOf<Int>()

    for (i in 1..floor) {
        if (!mapping.containsKey(i)) {
            list.add(i)
        }
        mapping.putIfAbsent(i, IntArray(14) { 1 })
    }

    return if (number == 1) {
        1
    } else if (mapping[floor]!![number - 1] != 1) {
        mapping[floor]!![number - 1]
    } else {
        list.forEach {
            var sum = 0

            mapping[it]!!.forEachIndexed { i, _ ->
                sum += mapping[it - 1]!![i]
                mapping[it]!![i] = sum
            }
        }
        mapping[floor]!![number - 1]
    }
}