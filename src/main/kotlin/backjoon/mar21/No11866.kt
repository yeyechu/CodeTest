package backjoon.mar21

fun main() {
    val (size, target) = readln().split(" ").map { it.toInt() }
    val sb = StringBuilder()

    sb.append('<')
    val resultArray = josephus(size, target)

    for (i in 0 until resultArray.size - 1) {
        sb.append(resultArray[i]).append(',').append(' ')
    }
    sb.append(resultArray[resultArray.size - 1]).append('>')

    println(sb)
}

fun josephus(s: Int, t: Int): IntArray {
    val list = MutableList(s) { it + 1 }
    val result = IntArray(s) { 0 }
    var index = t - 1
    var count = 0

    while (list.isNotEmpty()) {
        val times = {
            if (list.size > t) {
                list.size / t
            } else {
                1
            }
        }

        repeat(times()) {
            while (index >= list.size) {
                index -= list.size
            }

            result[count++] = list[index]
            list.removeAt(index)

            index += t - 1
        }
    }
    return result
}