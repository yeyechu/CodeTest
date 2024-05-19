package backjoon.apr03

// 기술 연계마스터 임스 : 구현, 자료구조, 스택
// 백준 kotlin 정답자 7명 중 제일 빠름 -> 156ms

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    br.readLine().toInt()
    val string = br.readLine().toCharArray()

    br.close()

    // 각각의 연계 기술에 대한 콤보를 쌓을 스택을 두개에 각각의 스킬 시작점에서 종료 스킬을 저장
    // 각 스택에는 K 혹은 R만 들어있으므로 스택이 비어있으면 그 이후에 사용되는 기술을 전부 무효 -> 유효 스킬 출력 후 return
    // 스택이 비어있지 않으면 하나 꺼낸 후 유효 스킬 횟수 ++
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