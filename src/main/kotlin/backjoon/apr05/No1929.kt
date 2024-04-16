package backjoon.apr05

import kotlin.system.measureTimeMillis

// 소수 구하기 : 수학, 정수론, 소수 판정, 에라토스테네스의 체
// 1과 2일 때 예외처리
// 종료 조건 -> 나누는 수 n은 i * i 를 넘지 않음

fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    val sb = StringBuilder()

    findPrime(m, n).forEach {
        sb.append(it).appendLine()
    }
    print(sb)
    println("${measureTimeMillis { println("${findPrime(1, 1_000_000).size}개") }}ms")
}

fun findPrime(s: Int, e: Int): IntArray {
    val queue: java.util.Queue<Int> = java.util.LinkedList()
    val numList: java.util.Deque<Int> = java.util.ArrayDeque()
    var num = 2
    var start = s
    val stop = kotlin.math.round(kotlin.math.sqrt(e.toFloat()))

    if (start == 1) {
        start = 2
    }

    (start..e).forEach {
        if (it % num != 0 || it == num) {
            queue.add(it)
        }
    }

    numList.add(num)
    num++

    while (true) {
        if (num > stop) {
            break
        }

        for (i in 0 until queue.size) {
            if (queue.isEmpty()) {
                break
            }

            val temp = queue.poll()

            if (temp % num != 0 || temp == num) {
                queue.add(temp)
            }
        }

        numList.add(num)

        var t = num + 1
        for (i in numList) {
            if (t % i == 0) {
                t++
            }
        }
        num = t
    }

    return queue.toIntArray()
}

/* 230ms 짜리 답
import java.util.StringTokenizer

fun main() {
    val reader = System.`in`.bufferedReader()
    val stringTokenizer = StringTokenizer(reader.readLine())
    val m = stringTokenizer.nextToken().toInt()
    val n = stringTokenizer.nextToken().toInt()

    val array = BooleanArray(n + 1) { true }
    array[0] = false
    array[1] = false

    var i = 2
    while(i*i <= n) {
        if (array[i]) {
            for (j in i*i .. n step i) {
                array[j] = false
            }
        }
        i++
    }

    val stringBuilder = StringBuilder()
    for(k in m .. n) {
        if (array[k]) {
            stringBuilder.append("$k\n")
        }
    }
    println(stringBuilder)
}
* */