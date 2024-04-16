package backjoon.mar29

// 소수 찾기 : 수학, 정수론, 소수 판정

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val size = br.readLine().toInt()

    val array = br.readLine().split(" ", limit = size).map { it.toInt() }.toIntArray()

    println(find(array))

    br.close()
}

fun find(array: IntArray): Int {

    var count = 0

    fun primeSort(num: Int, oper: Int) {
        if (num < oper || num == 1) {
            return
        }

        if (num % oper != 0) {
            primeSort(num, oper + 1)
        } else if (num / oper == 1) {
            count++
            return
        }
    }

    array.forEach {
        primeSort(it, 2)
    }
    return count
}