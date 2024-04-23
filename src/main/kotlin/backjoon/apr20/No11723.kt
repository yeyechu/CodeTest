package backjoon.apr20

// 집합 : 구현, 비트마스킹

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))

    val times = buffer.readLine().toInt()
    val sb = StringBuilder()

    val table = BooleanArray(21) { false }

    repeat(times) {
        val command = buffer.readLine().split(" ")
        when(command[0]) {
            "add" -> {
                table[command[1].toInt()] = true
            }
            "check" -> {
                if (!table[command[1].toInt()]) {
                    sb.append(0).appendLine()
                } else {
                    sb.append(1).appendLine()
                }
            }
            "remove" -> {
                table[command[1].toInt()] = false
            }
            "toggle" -> {
                table[command[1].toInt()] = !table[command[1].toInt()]
            }
            "all" -> {
                table.forEachIndexed { index, _ ->
                    if (!table[index]) {
                        table[index] = true
                    }
                }
            }
            "empty" -> {
                table.forEachIndexed { index, _ ->
                    if (table[index]) {
                        table[index] = false
                    }
                }
            }
        }
    }

    buffer.close()
    println(sb)
}