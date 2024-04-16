package backjoon.mar09

// 학점 계산 : 구현, 문자열
// 입력받은 문자열을 판별하여 해당하는 학점 출력

fun main() {
    val grade = readln().toCharArray()
    var score = 0f

    when(grade[0]) {
        'A' -> score += 4.0f
        'B' -> score += 3.0f
        'C' -> score += 2.0f
        'D' -> score += 1.0f
    }

    if (grade[0] != 'F') {
        when(grade[1]) {
            '+' -> score += 0.3f
            '-' -> score -= 0.3f
        }
    }

    println(score)
}