package doit.datatypes

fun main() {
    val count = readln().split(" ", limit = 2)
    val size = count[0].toInt()
    val operation = count[1].toInt()

    val numbers = readln().split(" ", limit = size)

    val sumList = mutableListOf<Int>()
    val remainingList = mutableListOf<Int>()
    val indexList = mutableListOf<Int>()

    sumList.add(numbers[0].toInt())
    remainingList.add(sumList[0] % operation)

    var temp = 0

    for (i in 1 until size) {
        sumList.add((sumList[i - 1] + numbers[i].toInt()))
        remainingList.add(sumList[i] % operation)
    }

    for (i in 0 until operation) {
        indexList.add(i)
    }

    for (i in 0 until size) {

        if (numbers[i].toInt() % operation == 0) {
            temp++
        }
        if (remainingList[i] == 0) {
            temp++
            indexList.add(i)
        }
    }

    for (i in 1 until size) {

    }

    println(temp)

}