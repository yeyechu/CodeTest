package backjoon.mar08

// 크로아티아 알파벳 : 구현, 문자열
// 입력을 크로아티아 알파벳으로 변환한 후 총 알파벳 개수를 출력

fun main() {
    val string = readln().toCharArray()

    var start = string.size - 1
    var count = string.size

    while (start >= 0) {

        when {
            string[start] == '=' -> {
                if (start > 1 && string[start - 1] == 'z') {
                    if (string[start - 2] == 'd') {
                        count--
                        start--
                    }
                }
                count--
                start -= 2
            }
            string[start] == '-' -> {
                count--
                start -= 2
            }
            start > 0 && string[start] == 'j' -> {
                if (string[start - 1] == 'l' || string[start - 1] == 'n') {
                    count--
                    start--
                }
                start--
            }
            else -> {
                start--
            }
        }
    }
    println(count)
}