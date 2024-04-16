package backjoon.mar15

// 스택 수열 : 자료구조, 스택

fun main() {
    val size = readln().toInt()
    val list = mutableListOf<Int>()
    val list2 = MutableList(size) { size - it }
    val list3 = mutableListOf<Char>()

    var isAvailable = true
    val stack: java.util.Deque<Int> = java.util.ArrayDeque()

    repeat(size) {
        list.add(readln().toInt())
    }

    for (i in list) {
        while (list2.size > 0 && list2[list2.size - 1] <= i) {
            stack.push(list2[list2.size - 1])
            list2.removeLast()
            list3.add('+')
        }

        if (stack.isNotEmpty() && i == stack.first) {
            stack.pop()
            list3.add('-')
        }
    }

    if (stack.size != 0) {
        isAvailable = false
    }

    if (isAvailable) {
        list3.forEach(::println)
    } else {
        println("NO")
    }
}