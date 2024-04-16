package backjoon.mar10

// 에디터 : 자료구조, 스택, 연결리스트
// 명령어에 따라 수정된 문자열 출력
// 시간초과 실패 코드

fun main() {
    val string = readln().toMutableList()
    val times = readln().toInt()

    var cursor = string.size

    for (i in 1..times) {
        val cmd = readln().split(" ")

        when(cmd[0]) {
            "L" -> {
                if (cursor > 0) {
                    cursor--
                }
            }
            "D" -> {
                if (cursor < string.size) {
                    cursor++
                }
            }
            "B" -> {
                if (cursor > 0) {
                    string.removeAt(cursor - 1)
                    cursor--
                }
            }
            else -> {
                val word = cmd[1].toCharArray()
                string.add(cursor, word[0])
                cursor++
            }
        }
    }
    for (i in string) {
        print(i)
    }
}