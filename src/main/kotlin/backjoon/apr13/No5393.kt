package backjoon.apr13

// 콜라츠 : 수학
// 테스트케이스 -> 0 ~ 10^9, 시간 제한 -> 1초

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = buffer.readLine().toInt()

    repeat(size) {
        val number = buffer.readLine().toInt()
        var ans = 0

        ans += if (number % 2 == 0) {
            number / 2
        } else {
            number / 2 + 1
        }

        ans += if (number % 6 == 0 || number % 6 == 4) {
            number / 3
        } else {
            number / 3 + 1
        }

        println(ans)
    }
    buffer.close()
}