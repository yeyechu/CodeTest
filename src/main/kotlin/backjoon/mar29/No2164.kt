package backjoon.mar29

// 카드 : 자료구조, 큐
// 수행 속도 : 180ms

fun main() {
    val num = readln().toInt()
    println(cardNumber(num))
}

fun cardNumber(n: Int) : Int {
    // 주어진 카드 범위를 큐에 삽입
    // 첫 번째 카드를 버리고 두 번째 카드는 밑에 깔기 반복
    val queue: java.util.Queue<Int> = java.util.ArrayDeque()

    (1..n).forEach {
        queue.add(it)
    }

    // 주어진 카드 수가 1일 때 예외 처리
    var temp = 0

    if (queue.size == 1) {
        temp = queue.poll()
    }

    while (queue.size >= 2) {
        queue.poll()
        temp = queue.poll()
        queue.add(temp)
    }

    return temp
}