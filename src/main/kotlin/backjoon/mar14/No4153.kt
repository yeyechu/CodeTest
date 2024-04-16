package backjoon.mar14

// 직각삼각형 : 수학, 기하학, 피타고라스 정리
// 직각 삼각형이 성립하는지 출력
// 가장 길이가 긴 변을 밑변으로 둘 수 있도록 정렬 필요

fun main() {
    val s = java.util.Scanner(System.`in`)
    var answer = 1L

    while (answer > 0) {

        val list = mutableListOf<Int>()

        repeat(3) {
            list.add(s.nextInt())
        }

        list.sort()

        answer = list[0] * list[0] + list[1] * list[1].toLong()

        if (answer == 0L) {
            break
        }

        if (answer == list[2] * list[2].toLong()) {
            println("right")
        } else {
            println("wrong")
        }
    }
}