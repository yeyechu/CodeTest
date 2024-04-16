package backjoon.apr03

// 기술 연계마스터 임스 : 구현, 자료구조, 스택

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    val times = br.readLine().toInt()
    val string = br.readLine().toCharArray()

    br.close()

    val stackSK: java.util.Deque<Char> = java.util.ArrayDeque()
    val stackLR: java.util.Deque<Char> = java.util.ArrayDeque()
    var count = 0

    string.forEach {
        when (it) {
            'S' -> stackSK.push('K')
            'L' -> stackLR.push('R')
            'K' -> {
                if (stackSK.isEmpty()) {
                    println(count)
                    return
                } else {
                    stackSK.pop()
                    count++
                }
            }
            'R' -> {
                if (stackLR.isEmpty()) {
                    println(count)
                    return
                } else {
                    stackLR.pop()
                    count++
                }
            }
            else -> count++
        }
    }
    println(count)
}