package backjoon.apr16

// 2xn 타일링 : 다이나믹 프로그래밍
// 주석 -> 11726, 11727

// n -> 1 ~ 1000
// 방법의 수를 10007로 나눈 나머지 출력
fun main() {
    val c = 10007

    val n = readln().toInt()
//    val list = LongArray(1001) { 0L }

//    list[1] = 1L
//    list[2] = 2L
//
//    for (i in 3..n) {
//        list[i] = (list[i - 1] + list[i - 2]) % c
//    }

    val list = LongArray(1001) { 1L }

    for (i in 2..n) {
        list[i] = (list[i - 1] + list[i - 2] * 2) % c
    }

    println(list[n])
}