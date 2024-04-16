package doit.datatypes

fun main() {
    val number = readln().toInt()
    var count = 1
    var startIndex = 1
    var endIndex = 1
    var sum = 1

    while (endIndex != number) {
        when {
            sum == number -> {
                count++
                endIndex++
                sum += endIndex
            }
            sum > number -> {
                sum -= startIndex
                startIndex++
            }
            else -> {
                endIndex++
                sum += endIndex
            }
        }
    }

    println(count)
}

