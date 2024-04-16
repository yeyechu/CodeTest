package backjoon.mar08

fun main() {
    val string = readln().split(" ")
    val list = mutableListOf<String>()

    for (i in string) {
        if (i != "") {
            list.add(i)
        }
    }

    println(list.size)
}