package backjoon.mar29

// 체스판 다시 칠하기 : 브루트포스 알고리즘

import kotlin.system.measureTimeMillis

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
//    val (column, row) = br.readLine().split(" ").map { it.toInt() }
//    val array = Array(column) { CharArray(row) { ' ' } }
//
//    repeat(column) {
//        val charArray = br.readLine().toCharArray()
//        charArray.forEachIndexed { i, c ->
//            array[it][i] = c
//        }
//    }
//
//    println(coloring(array))

    println(
        coloring(
            arrayOf(
                "WBWBWBWB".toCharArray(),
                "BWBWBWBW".toCharArray(),
                "WBWBWBWB".toCharArray(),
                "BWBBBWBW".toCharArray(),
                "WBWBWBWB".toCharArray(),
                "BWBWBWBW".toCharArray(),
                "WBWBWBWB".toCharArray(),
                "BWBWBWBW".toCharArray()
            )
        )
    )
    println(
        coloring(
            arrayOf(
                "BBBBBBBBWBWBW".toCharArray(),
                "BBBBBBBBBWBWB".toCharArray(),
                "BBBBBBBBWBWBW".toCharArray(),
                "BBBBBBBBBWBWB".toCharArray(),
                "BBBBBBBBWBWBW".toCharArray(),
                "BBBBBBBBBWBWB".toCharArray(),
                "BBBBBBBBWBWBW".toCharArray(),
                "BBBBBBBBBWBWB".toCharArray(),
                "WWWWWWWWWWBWB".toCharArray(),
                "WWWWWWWWWWBWB".toCharArray()
            )
        )
    )

    println(
        coloring(
            arrayOf(
                "BWBWBWBW".toCharArray(),
                "WBWBWBWB".toCharArray(),
                "BWBWBWBW".toCharArray(),
                "WBWBWBWB".toCharArray(),
                "BWBWBWBW".toCharArray(),
                "WBWBWBWB".toCharArray(),
                "BWBWBWBW".toCharArray(),
                "WBWBWBWB".toCharArray()
            )
        )
    )

    println(
        coloring(
            arrayOf(
                "BBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBW".toCharArray()
            )
        )
    )

    println(
        coloring(
            arrayOf(
                "BBBBBBBBBB".toCharArray(),
                "BBWBWBWBWB".toCharArray(),
                "BWBWBWBWBB".toCharArray(),
                "BBWBWBWBWB".toCharArray(),
                "BWBWBWBWBB".toCharArray(),
                "BBWBWBWBWB".toCharArray(),
                "BWBWBWBWBB".toCharArray(),
                "BBWBWBWBWB".toCharArray(),
                "BWBWBWBWBB".toCharArray(),
                "BBBBBBBBBB".toCharArray()
            )
        )
    )

    println(
        coloring(
            arrayOf(
                "WBWBWBWB".toCharArray(),
                "BWBWBWBW".toCharArray(),
                "WBWBWBWB".toCharArray(),
                "BWBBBWBW".toCharArray(),
                "WBWBWBWB".toCharArray(),
                "BWBWBWBW".toCharArray(),
                "WBWBWWWB".toCharArray(),
                "BWBWBWBW".toCharArray(),
            )
        )
    )

    println(
        coloring(
            arrayOf(
                "BWWBWWBWWBWW".toCharArray(),
                "BWWBWBBWWBWW".toCharArray(),
                "WBWWBWBBWWBW".toCharArray(),
                "BWWBWBBWWBWW".toCharArray(),
                "WBWWBWBBWWBW".toCharArray(),
                "BWWBWBBWWBWW".toCharArray(),
                "WBWWBWBBWWBW".toCharArray(),
                "BWWBWBWWWBWW".toCharArray(),
                "WBWWBWBBWWBW".toCharArray(),
                "BWWBWBBWWBWW".toCharArray(),
                "WBWWBWBBWWBW".toCharArray()
            )
        )
    )

    println(measureTimeMillis {
        coloring(
            arrayOf(
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray(),
                "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB".toCharArray()
            )
        )
    })

    br.close()
}

fun coloring(chars: Array<CharArray>): Int {

    val bwBuilder = StringBuilder()

    repeat(4) {
        bwBuilder.append('B').append('W')
    }

    val charArray = bwBuilder.toString().toCharArray()
    var min = 64

    fun findMin(column: Int, row: Int): Int {

        var count0 = 0
        var count1 = 0

        for (i in column..column + 7) {

            if (count0 > min && count1 > min) {
                return 64
            }
            var index = 0

            for (j in row..row + 7) {
                if (i % 2 == 0) {
                    if (chars[i][j] != charArray[index]) {
                        count0++
                    } else {
                        count1++
                    }
                } else {
                    if (chars[i][j] == charArray[index]) {
                        count0++
                    } else {
                        count1++
                    }
                }
                index++
            }
        }
        return minOf(count0, count1)
    }

    for (i in 0..chars.size - 8) {
        for (j in 0..chars[0].size - 8) {
            min = minOf(findMin(i, j), min)
        }
    }

    return min
}

fun coloring2(chars: Array<CharArray>): Int {

    val row = chars[0].size
    val column = chars.size

    val bwBuilder = StringBuilder()

    repeat(25) {
        bwBuilder.append('B').append('W')
    }

    val charArray = bwBuilder.toString().toCharArray()

    val recordArray1 = Array(column) { IntArray(row) { 0 } }
    val recordArray2 = recordArray1.copyOf()

    for (i in 0 until column) {
        if (i % 2 == 0) {
            if (chars[i][0] != charArray[0]) {
                recordArray1[i][0]++
            } else {
                recordArray2[i][0]++
            }
        } else {
            if (chars[i][0] != charArray[1]) {
                recordArray1[i][0]++
            } else {
                recordArray2[i][0]++
            }
        }
    }

    for (i in 1 until column) {

        var index = 0

        for (j in 1 until row) {
            if (i % 2 == 0) {
                if (chars[i][j] != charArray[index]) {
                    recordArray1[i][j] = recordArray1[i][j - 1] + 1
                } else {
                    recordArray2[i][j] = recordArray2[i][j - 1] + 1
                }
            } else {
                if (chars[i][j] == charArray[index]) {
                    recordArray1[i][j] = recordArray1[i][j - 1] + 1
                } else {
                    recordArray2[i][j] = recordArray2[i][j - 1] + 1
                }
            }
            index++
        }
    }

    var min1 = 0
    var min2 = 0

    for (i in 0..7) {
        min1 += recordArray1[i][7]
        min2 += recordArray2[i][7]
    }

    var min = minOf(min1, min2)

    fun minimum(column: Int, row: Int): Int {

        return minOf(
            recordArray1[column][row] - recordArray1[column - 8][row - 8],
            recordArray2[column][row] - recordArray2[column - 8][row - 8])
    }

    if (column > 8 || row > 8) {
        for (i in 8 until chars.size) {
            for (j in 8 until chars[0].size) {
                min = minOf(minimum(i, j), min)
            }
        }
    }

    return min
}