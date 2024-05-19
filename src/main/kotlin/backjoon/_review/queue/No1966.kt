package backjoon._review.queue

// 3월 15일 재풀이
// 프린터 큐 : 구현, 자료구조, 시뮬레이션, 큐
// 우선순위가 주어진 큐의 인쇄 순번 출력
// 문서 개수 n -> 1 ~ 100
// 순서 m -> 0 ~ 99
// 중요도 1 ~ 9

// 스캐너 -> 240ms
// 버퍼리더 -> 184ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()
    val sb = StringBuilder()

    repeat(times) {
        val (size, num) = buffer.readLine().split(" ").map { it.toInt() }
        val queue = buffer.readLine().split(" ").map { it.toInt() }.toIntArray()

        sb.append(findPrintingPriority(size, num, queue)).appendLine()
    }
    print(sb)
}

fun findPrintingPriority(size: Int, n: Int, q: IntArray): Int {

    // 큐에 우선순위를 담음
    // current : 목표에 대한 인덱스를 저장
    // count : 프린트 완료한 개수 저장
    val priority: java.util.Queue<Int> = java.util.ArrayDeque()

    repeat(size) {
        priority.add(q[it])
    }

    var current = n
    var count = 0

    // 큐가 비어있지 않은 동안 반복 수행 -> 인덱스 오류 방지
    // 큐에서 가장 큰 값(max)와 큐에서 가장 앞자리(temp)를 비교하여
    //// 같으면 프린트 완료 개수에 포함 시킴, current 값이 0이면 목표값이므로 반복을 중단
    //// 같지 않으면 다시 큐에 삽입함

    // current 값을 큐 사이즈에 맞게 조정
    while (priority.isNotEmpty()) {
        val max = priority.max()
        val temp = priority.poll()

        if (temp == max) {
            count++
            if (current == 0) break
        } else {
            priority.add(temp)
        }

        if (current > 0) {
            current--
        } else {
            current = priority.size - 1
        }
    }

    return count
}