package doit.datatypes

fun main() {

    val count = readln().toInt()
    val number = readln().toCharArray()

    var sum = 0

    repeat(count) {
        sum += number[it] - '0'
    }

    println(sum)
}

