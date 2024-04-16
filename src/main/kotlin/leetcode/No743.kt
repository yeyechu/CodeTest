package leetcode

fun main() {
    println(networkDelayTime(arrayOf(
        intArrayOf(3, 1, 5),
        intArrayOf(3, 2, 2),
        intArrayOf(2, 1, 2),
        intArrayOf(3, 4, 1),
        intArrayOf(4, 5, 1),
        intArrayOf(5, 6, 1),
        intArrayOf(6, 7, 1),
        intArrayOf(7, 8, 1),
        intArrayOf(8, 1, 1)
    ), 8, 3))
}

fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {

    // 네트워크의 각 노드를 (출발지 -> 도착지) 형태의 graph로 구성
    // 값이 존재하지 않으면 빈 해시맵을 생성하고 출발지에 (도착지, 소요 시간) 추가
    val graph = mutableMapOf<Int, MutableMap<Int, Int>>()

    for (time in times) {
        graph.putIfAbsent(time[0], mutableMapOf())
        graph[time[0]]!![time[1]] = time[2]
    }

    // 우선순위 큐 생성 -> 값이 (도착지, 소요 시간)으로 구성되므로 소요 시간 기준으로 정렬
    // 처음에는 (출발지 k, 소요시간 0)으로 시작
//    val pq: java.util.Queue<Map.Entry<Int, Int>> = java.util.PriorityQueue(
//        compareBy { (_, time) -> time
//    })
//    pq.add(java.util.AbstractMap.SimpleEntry(k, 0))

    val pq: java.util.Queue<Pair<Int, Int>> = java.util.PriorityQueue(
        compareBy { (_, time) -> time }
    )
    pq.add(Pair(k, 0))

    // (도착지, 소요 시간) 최종 결과 저장 변수 선언
    // 큐에 값이 없어질 때까지 반복 -> 소요 시간이 가장 빠른 값 추출
    // u 지점까지 소요 시간이 계산되지 않았으면  소요 시간을 변수에 삽입
    // u 지점을 출발지로 하는 경로가 있으면 모든 경로 순회하여 우선순위 큐에 (도착지, 소요시간) 삽입
    val dist = mutableMapOf<Int, Int>()
    while (pq.isNotEmpty()) {
        val (u, distU) = pq.poll()

        if (!dist.containsKey(u)) {
            dist[u] = distU
            if (graph.containsKey(u)) {
                for ((v, lengthUV) in graph[u]!!) {
                    val alt = distU + lengthUV
                    //pq.add(java.util.AbstractMap.SimpleEntry(v, alt))
                    pq.add(Pair(v, alt))
                }
            }
        }
    }

    return if (dist.size == n) {
        dist.values.max()
    } else {
        -1
    }
}

// 2가지 판별 필요
// 1. 모든 노드가 신호를 받는 데 걸리는 시간 = 가장 오래 걸리는 노드의 최단시간
// 2. 모든 노드에 도달할 수 있는지 여부 = 모든 노드에 다익스트라 계산값 유무

// 그래프를 인접리스트로 표현하는 맵을 만든 후
// 우선순위 큐를 구현 -> Map.Entry 이용
//  -> Map 조회 시 for 반복문 순회
//  -> Map.Entry : 1개의 아이템을 의미하므로 순회없이 getKey(), getValue()로 즉시 값 추출
//     -> 삽입 시에도 AbstractMap.SimpleEntry<>() 사용
//     -> Comparator 인터페이스 지원
//          -> Map.Entry.comparingByValue()로 우선순위 큐 정렬 기준 선언
//          -> 역순은 Map.Entry.comparingByValue(Comparator.reverseOrder())
//     ->