package backjoon.mar15

// 스택 : 구현, 자료구조, 스택

fun main() {
    val stack : java.util.Deque<Int> = java.util.ArrayDeque()
    val times = readln().toInt()

    repeat(times) {
        val ins = readln().split(" ")
        when(ins[0]) {
            "top" -> {
                if (stack.size > 0) {
                    println(stack.first)
                } else {
                    println(-1)
                }
            }
            "pop" -> {
                if (stack.size > 0) {
                    println(stack.first)
                    stack.pop()
                } else {
                    println(-1)
                }
            }
            "size" -> {
                println(stack.size)
            }
            "empty" -> {
                if (stack.isEmpty()) {
                    println(1)
                } else {
                    println(0)
                }
            }
            "push" -> {
                stack.push(ins[1].toInt())
            }
        }
    }
}