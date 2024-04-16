package leetcode

import kotlin.system.measureTimeMillis

fun main() {
    println(measureTimeMillis {
        findCheapestPrice(3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 200), intArrayOf(0, 2, 500)), 0, 2, 0)
    }) // 500
    println(measureTimeMillis {
        findCheapestPriceFast(3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 200), intArrayOf(0, 2, 500)), 0, 2, 0)
    })
}

fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {

    // 여행 경로를 (출발지 -> 도착지) 형태의 그래프로 구성 후
    // 값이 존재하지 않을 경우 빈 해시맵을 생성하여 출발지에 (도착지, 비용) 추가
    val graph = mutableMapOf<Int, MutableMap<Int, Int>>()

    for (flight in flights) {
        graph.putIfAbsent(flight[0], java.util.HashMap())
        graph[flight[0]]!![flight[1]] = flight[2]
    }

    // 우선순위 큐 생성 -> 값이 (도착지, 비용, 남은 경로)로 구성되므로 비용 기준으로 정렬
    // 처음에는 (출발지 src, 비용 0, 진행 경로 0)으로 시작
    val pq: java.util.Queue<List<Int>> = java.util.PriorityQueue { a: List<Int>, b: List<Int> ->
        a[1] - b[1]
    }
    pq.add(listOf(src, 0, 0))

    // 타임아웃을 방지하기 위해 한 번 방문한 경로는 Map 저장 필요
    // 큐에 값이 없을 때까지 비용이 가장 저렴한 값 추출 반복
    // 우선순위 큐에서 인덱스 위치로 (도착지, 비용, 진행 경로) 각각 추출 후
    // 추출값이 도착지 dst라면 정답으로 반환
    val visited = mutableMapOf<Int, Int>()
    while (pq.isNotEmpty()) {
        val (u, priceU, kv) = pq.poll()
        var kVisited = kv

        if (u == dst) {
            return priceU
        }

        visited[u] = kVisited

        if (kVisited <= k) {
            kVisited += 1
            if (graph.containsKey(u)) {
                for ((key, value) in graph[u]!!) {
                    if (!visited.containsKey(key) || kVisited < visited[key]!!) {
                        val alt = priceU + value
                        pq.add(listOf(key, alt, kVisited))
                    }
                }
            }
        }
    }
    return -1
}

fun findCheapestPriceFast(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
    var distance = IntArray(n) { Int.MAX_VALUE }
    distance[src] = 0

    repeat(minOf(n - 1, k + 1)) {
        val temp = distance.copyOf()
        for (flight in flights) {
            if (distance[flight[0]] == Int.MAX_VALUE) continue
            temp[flight[1]] = minOf(temp[flight[1]], distance[flight[0]] + flight[2])
        }
        distance = temp
    }

    return if (distance[dst] == Int.MAX_VALUE) {
        -1
    } else {
        distance[dst]
    }
}