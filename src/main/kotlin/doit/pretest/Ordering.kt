package doit.pretest

fun main() {
    val number: Int = readln().toInt()
    val list = mutableListOf<Int>()

    for (i in 1..number) {
        list.add(readln().toInt())
    }

    list.sort()

    for (i in list) {
        println(i)
    }
}

