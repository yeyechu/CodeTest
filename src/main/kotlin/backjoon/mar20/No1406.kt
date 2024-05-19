package backjoon.mar20

// 에디터 : 자료구조, 스택, 연결리스트
// 명령어에 따라 수정된 문자열 출력
// cursor 이용 -> 시간초과로 실패
// iterator 사용하여 시간 단축

fun main() {
    val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val string = br.readLine()
    val times = br.readLine().toInt()
    val input = java.util.LinkedList<Char>()

    string.forEach {
        input.add(it)
    }

    val iterator = input.listIterator()

    while (iterator.hasNext()) {
        iterator.next()
    }

    repeat(times) {
        val ins = br.readLine().split(" ")
        when(ins[0]) {
            "L" -> {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                }
            }
            "D" -> {
                if (iterator.hasNext()) {
                    iterator.next()
                }
            }
            "B" -> {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                    iterator.remove()
                }
            }
            "P" -> {
                val word = ins[1].toCharArray()
                iterator.add(word[0])
            }
        }
    }

    input.forEach {
        sb.append(it)
    }
    println(sb)
}

/* cursor 이용
val br = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val string = br.readLine()
    val times = br.readLine().toInt()
    val input = java.util.LinkedList<Char>()

    string.forEach {
        input.add(it)
    }

    var cursor = input.size

    repeat(times) {
        val ins = br.readLine().split(" ")
        when(ins[0]) {
            "L" -> {
                if (cursor > 0) {
                    cursor--
                }
            }
            "D" -> {
                if (cursor < input.size) {
                    cursor++
                }
            }
            "B" -> {
                if (cursor > 0) {
                    input.removeAt(cursor - 1)
                    cursor--
                }
            }
            "P" -> {
                val word = ins[1].toCharArray()
                input.add(cursor, word[0])
                cursor++
            }
        }
    }

    input.forEach {
        sb.append(it)
    }
    println(sb)
* */