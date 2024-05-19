package backjoon.apr03

// Star in Parentheses : 자료구조, 문자열, 스택
// Kotlin 정답자 3명 중 제일 빠름 -> 88ms

fun main() {
    // 입력문자열을 char 배열로 변환, * 확인을 위한 switch 변수를 false 로 초기화
    // 한 바퀴 돌면서 (일 때 (를 넣음
    // *를 만나면 스위치를 true 로 변환
    // )일 때 스위치 상태에 따라 스택에서 하나씩 꺼내거나 스택 사이즈를 출력 후 종료함
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val string = br.readLine().toCharArray()

    val stack: java.util.Deque<Char> = java.util.ArrayDeque()
    var switch = false

    string.forEach {
        when {
            it == '*' -> { switch = true }
            it == '(' && !switch -> { stack.push('(') }
            it == ')' && !switch -> { stack.pop() }
            it == ')' && switch -> {
                println(stack.size)
                return
            }
        }
    }

    println(stack.size)
}