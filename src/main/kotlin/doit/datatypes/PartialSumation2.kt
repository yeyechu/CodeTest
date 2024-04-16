package doit.datatypes

fun main() {
    val input = readln().split(" ", limit = 2)

    val scale = input[0].toInt()
    val times = input[1].toInt()

    val list = mutableListOf<Int>()
    val sumList = mutableListOf<Int>()

    for (i in 0 until scale) {
        val numbers = readln().split(" ", limit = scale)
        for (j in 0 until scale) {
            list.add(numbers[j].toInt())
        }
    }

    // 1행 : 0 ~ scale - 1
    // 2행 : scale ~ scale * 2 - 1
    // 3행 : scale * 2 ~ scale * 3 - 1

    sumList.add(list[0])

    if (scale > 1) {
        for (j in 1 until scale) {
            sumList.add(list[j] + sumList[j - 1])
        }

        repeat(scale - 1) {
            sumList.add(sumList[scale * it] + list[scale * (it + 1)])
            for (j in 1 until scale) {
                sumList.add(list[scale * (it + 1) + j] + sumList[scale * (it + 1) + (j - 1)] + sumList[scale * it + j] - sumList[scale * it + (j - 1)])
            }
        }
    }

    repeat(times) {
        val inputs = readln().split(" ", limit = 4)
        val indexes = arrayOf(inputs[0].toInt(), inputs[1].toInt(), inputs[2].toInt(), inputs[3].toInt())
        val transIndex = { num1: Int, num2: Int ->
            scale * (num1 - 1) + (num2 - 1)
        }
        var result = 0

        result += sumList[transIndex(indexes[2], indexes[3])]

        if (indexes[0] != 1) {
            result -= sumList[transIndex(indexes[0]- 1, indexes[3])]
        }
        if (indexes[1] != 1) {
            result -= sumList[transIndex(indexes[2], indexes[1] - 1)]
        }

        if (indexes[0] != 1 && indexes[1] != 1) {
            result += sumList[transIndex(indexes[0] - 1, indexes[1] - 1)]
        }

        println(result)
    }
}