package backjoon.mar08

// 알파벳 찾기 : 구현, 문자열
// 알파벳 a ~ z가 처음 등장하는 위치 출력, 없으면 -1 출력

fun main() {
    val string = readln().toCharArray()
    val list = MutableList(26) { -1 }

    for (i in string.indices) {
        if (list[string[i] - 'a'] == -1) {
            list[string[i] - 'a'] = i
        }
    }

    for (i in list) {
        print("$i ")
    }
}