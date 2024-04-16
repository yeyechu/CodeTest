package programmers

import java.util.*

fun main() {
    println(solution(intArrayOf(3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1)))
    println(solution(intArrayOf(2, 3, 4, 5)))
    println(solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9)))

    val num = 34
    val n = 3

    val answer = if (num % n == 0) {
        1
    } else {
        0
    }
    println(answer)
}
fun solution(num_list: IntArray): Int {
    var answer: Int = 0
    if (num_list.size - 1 > 9) {
        num_list.forEach {
            answer += it
        }
    } else {
        answer = 1
        num_list.forEach {
            answer *= it
        }
    }
    return answer
}

fun solution2(my_string: String, n: Int): String {

    var answer: IntArray = intArrayOf()


    return answer.toString()
}