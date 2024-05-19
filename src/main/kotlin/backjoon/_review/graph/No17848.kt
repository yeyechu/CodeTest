package backjoon._review.graph

// Flight Turbulence : 구현, 그래프 이론, 그래프 탐색
// 비행기 승객 좌석 변경
// n, m -> 1 ~ 200 / 시간 제한 -> 1초

// 첫 번째 풀이 -> 148ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (size, start) = buffer.readLine().split(" ").map { it.toInt() }
    val list = buffer.readLine().split(" ").map { it.toInt() }.toIntArray()

    buffer.close()

    println(findFlightSeats(size, start, list))
}

fun findFlightSeats(n: Int, s: Int, list: IntArray): Int {
    var start = s
    val seats = list.copyOf()
    val path: MutableList<Int> = java.util.LinkedList()

    if (seats[start] == start) {
        return 0
    } else {
        path.add(seats[start])
    }

    fun switch(a: Int, b: Int): Int {
        seats[b] = b.also { seats[a] = seats[b] }
        return a
    }

    while (true) {
        if (seats[start] == start) {
            break
        }

        start = switch(start, seats[start])
        path.add(seats[start])
    }

    return path.distinct().size
}