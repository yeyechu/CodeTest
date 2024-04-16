package backjoon.mar08

// 세로 읽기 : 구현, 문자열

// 최대 15자로 주어지는 문자열 세로로 읽어 출력
// 입력을 받은 후 빈자리는 *로 채워 모든 길이를 15로 만든 후
// *를 제외한 모든 문자열 세로 출력

fun main() {
    val s = java.util.Scanner(System.`in`)
    val list = mutableListOf<Char>()

    for (i in 1..5) {
        val input = s.nextLine().toCharArray()
        for (j in input) {
            list.add(j)
        }
        for (j in 1..(15 - input.size)) {
            list.add('*')
        }
    }
    for (i in 0..14) {
        for (j in 0..4) {
            if (list[j * 15 + i] != '*') {
                print("${list[j * 15 + i]}")
            }
        }
    }
}