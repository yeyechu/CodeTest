package backjoon.mar09

// 숫자의 개수 : 구현, 수학, 사칙연산
// 3개 수를 받아서 모두 곱한 후 0 ~ 9까지 숫자가 각각 몇 번 쓰였는지 출력
// 입력되는 수는 100 ~ 999 사이 세자리 자연수


fun main() {
    val s = java.util.Scanner(System.`in`)
    val number = (s.nextInt() * s.nextInt() * s.nextInt()).toString().toCharArray()
    val list = MutableList(10) { 0 }

    for (i in number.indices) {
        list[number[i] - '0']++
    }

    for (i in list) {
        println(i)
    }
}