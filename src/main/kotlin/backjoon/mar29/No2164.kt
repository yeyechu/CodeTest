package backjoon.mar29

// 카드 : 자료구조, 큐

fun main() {
    val num = readln().toInt()

    println(cardNumber(num))
    println(cardNumber(15))
}

fun cardNumber(n: Int) : Int {
    val queue: java.util.Queue<Int> = java.util.ArrayDeque()

    (1..n).forEach {
        queue.add(it)
    }

    var temp = 0

    if (queue.size == 1) {
        temp = queue.poll()
    } else if (queue.size == 2) {
        queue.poll()
        temp = queue.poll()
    }

    while (queue.size > 2) {
        queue.poll()
        temp = queue.poll()
        queue.add(temp)
    }

    return temp
}