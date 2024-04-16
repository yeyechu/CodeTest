package backjoon._review._01_implement

// 3월 8일 재풀이
// 최소, 최대 : 구현, 수학
// 리스트 sort()로 구현 -> 2084ms
// 스캐너를 이용한 min, max 찾기로 구현 -> 1464ms
// 버퍼리더를 이용한 min, max 찾기로 구현 -> 648ms

//fun main() {
//    val s = java.util.Scanner(System.`in`)
//
//    var min = Int.MAX_VALUE
//    var max = Int.MIN_VALUE
//
//    repeat(s.nextLine().toInt()) {
//        val num = s.nextInt()
//        min = minOf(min, num)
//        max = maxOf(max, num)
//    }
//
//    println("$min $max")
//}

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    val size = br.readLine().toInt()
    val numbers = br.readLine().split(" ", limit = size).map { it.toInt() }

    br.close()

    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    numbers.forEach {
        min = minOf(min, it)
        max = maxOf(max, it)
    }

    println("$min $max")
}