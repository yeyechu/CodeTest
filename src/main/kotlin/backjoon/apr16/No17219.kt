package backjoon.apr16

// 비밀번호 찾기 : 자료구조, 해시를 이용한 집합과 맵

// 저장된 사이트 수 n -> 1 ~ 100,000
// 비밀번호를 찾으려는 사이트 주소의 수 m -> 1 ~ 100,000

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (all, target) = buffer.readLine().split(" ").map { it.toInt() }
    val map = java.util.HashMap<String, String>()
    val sb = StringBuilder()

    repeat(all) {
        val (address, password) = buffer.readLine().split(" ")
        map[address] = password
    }

    repeat(target) {
        sb.append(map[buffer.readLine()]).appendLine()
    }

    buffer.close()

    print(sb)
}