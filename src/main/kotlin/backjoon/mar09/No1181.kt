package backjoon.mar09

// 단어 정렬 : 문자열, 정렬
// 길이가 짧은 것부터 출력하되, 길이가 같으면 사전 순 출력
// 중복 제거

fun main() {
    val s = java.util.Scanner(System.`in`)
    val times = readln().toInt()
    val list = mutableListOf<String>()

    for (i in 1..times) {
        val input = s.nextLine()
        list.add(input)
    }

    list.sort()
    list.sortBy { it.length }

    for (i in list.distinct()) {
        println(i)
    }
}