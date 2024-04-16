package backjoon.mar20

// 수 정렬하기 3 : 정렬

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val size = br.readLine().toInt()
    val array = IntArray(10001) { 0 }

    repeat(size) {
        val num = br.readLine().toInt()
        array[num]++
    }

    array.forEachIndexed { index, i ->
        if (i != 0) {
            repeat(i) {
                sb.append(index).append('\n')
            }
        }
    }

    println(sb)
}