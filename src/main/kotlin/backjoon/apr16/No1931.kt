package backjoon.apr16

// 회의실 배정 : 정렬, 그리디 알고리즘

// 1개 회의실 스케줄 조정
// 회의 수 -> 1 ~ 100,000
// (회의 시작시간, 종료시간) -> 0 ~ 2^31 - 1, 겹치지 않는 최대 개수, 시작시간과 종료시간이 같을 수 있음

// 시간제한 2초
// mutableList + for + for -> 시간초과
// array + while + for -> 1000ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = buffer.readLine().toInt()

    //val list: MutableList<Pair<Int, Int>> = java.util.LinkedList()
    val list = Array(size) { 0 to 0 }

    repeat(size) { i ->
        val (start, end) = buffer.readLine().split(" ").map { it.toInt() }
        // list.add(start to end)
        list[i] = start to end
    }

    buffer.close()

    if (size <= 1) {
        println(1)
        return
    }

    // ▼ list.size -> 2이상인 경우에만 실행됨
    list.sortWith( compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first } )

    var endPoint = 1
    var index = 0
    var ans = Int.MIN_VALUE

    for (i in 1 until list.size) {
        if (list[i].first >= list[0].second) {
            endPoint = i
            break
        }
    }

    while (index < endPoint) {
        var count = 1
        var temp = list[index++].second

        for (i in endPoint until list.size) {
            if (list[i].first >= temp) {
                temp = list[i].second
                count++
            }
        }

        if (ans > count) {
            break
        } else {
            ans = count
        }
    }

    println(ans)
}