package backjoon.mar08

// 공 넣기 : 구현, 시뮬레이션
// 바구니 size 개에 times 번 공을 넣은 후 들어있는 공의 번호를 출력
// size 개 바구니를 미리 만듦 -> list 초기화
// 바뀔 때마다 바구니 번호 재 초기화

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    val size = s.nextInt()
    val times = s.nextInt()
    val list = MutableList(size) { 0 }

    for (i in 1..times) {
        val num1 = s.nextInt() - 1
        val num2 = s.nextInt() - 1
        val ballNum = s.nextInt()

        for (i in num1..num2) {
            list[i] = ballNum
        }
    }

    for (i in list) {
        print("$i ")
    }
}