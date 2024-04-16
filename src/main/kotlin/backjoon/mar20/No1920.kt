package backjoon.mar20

// 수 찾기 : 자료구조, 정렬, 이분탐색
// n = 1 ~ 100_000 범위 n 개의 수열 A ->
// -2^31 ~ 2^31 범위 m 개 수열 내 숫자가 A 안에 존재하면 1, 존재하지 않으면 0 출력
// 2512ms 소요

fun main() {
    val s = java.util.Scanner(System.`in`)
    val size = s.nextLine().toInt()
    val map = mutableMapOf<Int, java.util.LinkedList<Int>>()
    val list = mutableListOf<Int>()

    repeat(size) {
        val num = s.nextInt()
        val index = num / 10
        map.putIfAbsent(index, java.util.LinkedList())
        map[index]!!.add(num)
    }
    s.nextLine()

    val size2 = s.nextLine().toInt()

    repeat(size2) {
        val num = s.nextInt()
        if (map.containsKey(num / 10) && map[num / 10]!!.contains(num)) {
            list.add(1)
        } else {
            list.add(0)
        }
    }
    list.forEach(::println)
}