package backjoon.mar08

fun main() {
    val times = readln().toInt()
    var count = 0

    for (i in 1..times) {
        val string = readln().toCharArray()

        var index = 1
        val record = mutableListOf<Char>()

        while (index < string.size) {
            if (string[index - 1] == string[index]) {
            } else {
                record.add(string[index - 1])
            }
            index++
        }

        record.add(string[string.size - 1])

        if (record.size == record.distinct().size) {
            count++
        }
    }
    println(count)
}