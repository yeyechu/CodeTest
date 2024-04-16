package doit.datatypes

fun main() {
    val size = readln().toInt()
    val destination = readln().toInt()
    val materialList = readln().split(" ", limit = size).sortedBy { it.toInt() }
    val sorted = mutableListOf<Int>()

    for (i in materialList) {
        sorted.add(i.toInt())
    }

    var start = 0
    var end = size - 1
    var count = 0
    val sum = {
        sorted[start] + sorted[end]
    }

    while (start < end) {
        when {
            sum() == destination -> {
                count++
                end--
                start++
            }
            sum() > destination -> {
                end--
            }
            else -> {
                start++
            }
        }
    }
    println(count)
}