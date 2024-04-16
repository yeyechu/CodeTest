package backjoon.mar08

// 바구니 뒤집기 : 구현, 시뮬레이션
// 바구니 순서를 역순으로 바꿈

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    val size = s.nextInt()
    val times = s.nextInt()
    val basket = MutableList(size) { it + 1 }

    for (i in 1..times) {
        var num1 = s.nextInt() - 1
        var num2 = s.nextInt() - 1
        while (num1 < num2) {
            basket[num1] = basket[num2].also { basket[num2] = basket[num1] }
            num1++
            num2--
        }
    }

    for (i in basket) {
        print("$i ")
    }
}