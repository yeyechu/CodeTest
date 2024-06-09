package backjoon.mar09

// 단어 정렬 : 문자열, 정렬
// 입력 n -> 1 ~ 20,000 / 시간 제한 -> 2초

// 길이가 짧은 것부터 출력하되, 길이가 같으면 사전 순 출력 + 중복 제거
// Buffer, StringBuilder, Set 이용 -> 420ms
// Buffer, StringBuilder, Array.distinct() 이용 -> 472ms
// Scanner, println, ArrayList 이용 -> 1084ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val set = java.util.HashSet<String>()
    val times = buffer.readLine().toInt()

    for (i in 1..times) {
        set.add(buffer.readLine())
    }

    set.sorted().sortedBy { it.length }.forEach {
        sb.append(it).appendLine()
    }

    print(sb)
}

// array 이용
//fun main() {
//    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
//    val sb = StringBuilder()
//
//    val times = buffer.readLine().toInt()
//    val array = Array(times) { "" }
//
//    repeat(times) {
//        array[it] = buffer.readLine()
//    }
//
//    array.distinct().sorted().sortedBy { it.length }.forEach {
//        sb.append(it).appendLine()
//    }
//
//    print(sb)
//}

// scanner, ArrayList 이용
//fun main() {
//    val s = java.util.Scanner(System.`in`)
//    val times = readln().toInt()
//    val list = mutableListOf<String>()
//
//    for (i in 1..times) {
//        val input = s.nextLine()
//        list.add(input)
//    }
//
//    list.sort()
//    list.sortBy { it.length }
//
//    for (i in list.distinct()) {
//        println(i)
//    }
//}