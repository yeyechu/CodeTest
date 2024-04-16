package backjoon.mar08

// 킹, 퀸, 룩, 비숍, 나이트, 폰 : 구현, 수학, 사칙연산
// 정상 세트 -> 킹 1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8개
// 주어진 입력에서 얼마나 더하고 빼야 정상 세트와 개수가 맞는지 계산하여 출력

fun main() {
    val s = java.util.Scanner(System.`in`)
    val list = mutableListOf(1, 1, 2, 2, 2, 8)

    for (i in list.indices) {
        list[i] -= s.nextInt()
    }
    for (i in list) {
        print("$i ")
    }
}