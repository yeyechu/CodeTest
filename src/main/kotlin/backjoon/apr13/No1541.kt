package backjoon.apr13

// 잃어버린 괄호 : 수학, 문자열, 파싱, 그리디 알고리즘

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val minus = buffer.readLine().split("-")
    var sum = Int.MAX_VALUE

    buffer.close()

    repeat(minus.size) { elements ->
        val plus = minus[elements].split("+").map { it.toInt() }
        var temp = 0

        repeat(plus.size) {
            temp += plus[it]
        }

        if (sum == Int.MAX_VALUE) {
            sum = temp
        } else {
            sum -= temp
        }
    }

    println(sum)
}