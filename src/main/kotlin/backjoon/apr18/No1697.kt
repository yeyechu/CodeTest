package backjoon.apr18

// 숨바꼭질 : 그래프이론, 그래프탐색, 너비우선탐색
// n, k -> 0 ~ 100,000

// 참고 : n > k일 때 n - 1씩만 이동할 수 있음
// 반례 -> 1 100000 -> 21 / 5 35 -> 5 / 35 5 -> 30 / 0 0 -> 0 / 0 1 -> 1
// 알고리즘 참고 : https://smartpro.tistory.com/18
// 반례 참고 : https://forward-gradually.tistory.com/53

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    println(hideAndSeek(n, k))
}

fun hideAndSeek(s: Int, e:Int): Int {
    var current: Int

    val visited = IntArray(100_001) { 0 }
    val queue: java.util.Queue<Int> = java.util.ArrayDeque()

    queue.add(s)
    visited[s] = 1

    while (queue.isNotEmpty()) {
        current = queue.poll()

        if (current == e) return visited[current] - 1

        if (current > 0 && visited[current - 1] == 0) {
            visited[current - 1] = visited[current] + 1
            queue.add(current - 1)
        }

        if (current + 1 <= 100_000 && visited[current + 1] == 0) {
            visited[current + 1] = visited[current] + 1
            queue.add(current + 1)
        }

        if (current * 2 <= 100_000 && visited[current * 2] == 0) {
            visited[current * 2] = visited[current] + 1
            queue.add(current * 2)
        }
    }

    return 0
}

//fun hideAndSeek(s: Int, e: Int): Int {
//    var count = 0
//    var current = s
//
//    if (current == 0 && e != 0) {
//        current = 1
//        count++
//    }
//
//    while (current != e) {
//        current = if (teleport(current) <= e || (teleport(current) == e + 1 && current + 1 != e)) {
//            teleport(current)
//        } else {
//            val tempT = kotlin.math.abs(teleport(current - 1) - e)
//            val tempW = kotlin.math.abs(walk(current, e) - e)
//
//            if (tempT <= tempW) {
//                count++
//                teleport(current - 1)
//            } else {
//                walk(current, e)
//            }
//        }
//
//        count++
//    }
//
//    println("hideAndSeek: $count")
//    return count
//}
//
//fun hideAndSeekReversed(s: Int, e: Int): Int {
//    var count = 0
//    var current = e
//
//    while (current != s) {
//        if (current < s) {
//            current += 1
//            count++
//        }
//        if (current % 2 != 0 && current != s) {
//            if (teleportDiv(current - 1) % 2 != 0 || teleportDiv(current + 1) == s) {
//                current += 1
//            } else {
//                current -= 1
//            }
//            count++
//        }
//
//        if (current > s) {
//            current = teleportDiv(current)
//            count++
//        }
//    }
//
//    println("hideAndSeekReversed: $count")
//    return count
//}
//
//fun walk(n: Int, e: Int): Int {
//    return if (n > e) {
//        n - 1
//    } else {
//        n + 1
//    }
//}
//
//fun teleport(n: Int): Int {
//    return n * 2
//}
//
//fun teleportDiv(n: Int): Int {
//    return n / 2
//}