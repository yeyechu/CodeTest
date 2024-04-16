package backjoon.mar09

// 대소문자 바꾸기 : 구현, 문자열
// 입력받은 문자열을 대소문자 반전 출력

fun main() {
    val input = readln().toCharArray()
    val string = mutableListOf<String>()

    for (i in input) {
        if (i.isLowerCase()) {
            string.add(i.uppercase())
        } else {
            string.add(i.lowercase())
        }
    }

    for (i in string) {
        print(i)
    }
}