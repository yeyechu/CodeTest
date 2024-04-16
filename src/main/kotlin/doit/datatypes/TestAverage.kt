package doit.datatypes

fun main() {
    val count = readln().toInt()
    val scores = readln().split(" ", limit = count)

    val max = scores.maxBy { it.toInt() }.toInt()
    var average = 0f

    for (s in scores) {
        average += s.toFloat() / max * 100
    }

    average /= count
    println(average)
}

