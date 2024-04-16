package doit.datatypes

fun main() {
    val count = readln().split(" ", limit = 2)
    val numbers = readln().split(" ", limit = count[0].toInt())

    val sumList = mutableListOf<Int>()
    sumList.add(0)
    sumList.add(numbers[0].toInt())

    for (i in 1 until count[0].toInt()) {
        sumList.add(sumList[i] + numbers[i].toInt())
    }

    repeat(count[1].toInt()) {
        val indexes = readln().split(" ", limit = 2)
        println(sumList[indexes[1].toInt()] - sumList[indexes[0].toInt() - 1])
    }
}

