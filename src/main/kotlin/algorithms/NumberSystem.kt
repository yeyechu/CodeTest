package algorithms

import java.util.logging.Logger

fun main() {
    val logger = Logger.getLogger("main")

    // 10진수와 변환할 진법을 입력하면 해당 진법의 수로 변환해주는 프로그램
    // 예시 입력 : 10 8, 예시 출력 : 175
    print(": ")

    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (n, ns) = buffer.readLine().split(" ").map { it.toInt() }

    if (ns != 1) {
        println(translateNumber(n, ns))
    } else {
        logger.info("입력 오류")
    }
}

fun translateNumber(n: Int, ns: Int): String {
    // 1의 자리부터 계산하여 결과를 answer 변수에 누적하고 10을 넘어가는 수는 알파벳으로 대체한다
    // 대체할 알파벳은 alphabetMod 수를 이용하여 변환한다
    // 계산이 끝난 부분은 num 변수에서 제외해준다
    val logger = Logger.getLogger("translateNumber")
    val answer = StringBuilder()
    val alphabetMod = 'A'.code - 10

    var remainder: Int
    var num = n

    while (num > 0) {
        remainder = num % ns

        if (num % ns < 10) {
            answer.append(remainder)
        } else {
            answer.append((remainder + alphabetMod).toChar())
        }

        logger.info("num : $num, remainder : $remainder -> answer : $answer")

        num /= ns
    }

    // 일의자리부터 계산했으므로 반대로 출력해줌
    return answer.reversed().toString()
}

