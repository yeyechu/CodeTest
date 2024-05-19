package backjoon.apr01

// Flight Turbulence : 구현, 그래프 이론, 그래프 탐색
// 비행기 승객 좌석 변경

// 148ms

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (size, start) = br.readLine().split(" ").map { it.toInt() }
    val seats = br.readLine().split(" ", limit = size).map { it.toInt() - 1 }.toIntArray()

    br.close()

    println(find(start - 1, seats))
}

fun find(n: Int, list: IntArray): Int {

    var start = n
    val seats = list.copyOf()
    val path: MutableList<Int> = java.util.LinkedList()

    if (seats[start] == start) {
        return 0
    } else {
        path.add(seats[start])
    }

    // 원하는 좌석과 맞교환한 후 옮긴 승객의 좌석을 반환
    fun switch(index: Int, target: Int): Int {
        seats[target] = target.also { seats[index] = seats[target] }

        return index
    }

    // 한 번 이동한 승객이 모두 제자리에 앉을 때까지 좌석 이동
    while (true) {
        if (seats[start] == start) {
            break
        }

        start = switch(start, seats[start])
        path.add(seats[start])
    }

    return path.distinct().size
}