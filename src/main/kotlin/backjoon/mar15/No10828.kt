package backjoon.mar15

// 스택 : 구현, 자료구조, 스택
// dequeStack() -> 484ms
// newStack() -> 204ms
// myStack() -> 212ms

fun main() {
    dequeStack()
    newStack()
    myStack()
}

fun dequeStack() {
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

fun newStack() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()
    val stack : java.util.Deque<Int> = java.util.ArrayDeque()
    val sb = StringBuilder()

    repeat(times) {
        val ins = buffer.readLine().split(" ")
        when(ins[0]) {
            "top" -> {
                if (stack.size > 0) {
                    sb.append(stack.first).appendLine()
                } else {
                    sb.append(-1).appendLine()
                }
            }
            "pop" -> {
                if (stack.size > 0) {
                    sb.append(stack.pop()).appendLine()
                } else {
                    sb.append(-1).appendLine()
                }
            }
            "size" -> { sb.append(stack.size).appendLine() }
            "empty" -> {
                if (stack.isEmpty()) {
                    sb.append(1).appendLine()
                } else {
                    sb.append(0).appendLine()
                }
            }
            "push" -> { stack.push(ins[1].toInt()) }
        }
    }
    println(sb)
}

fun myStack() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val times = buffer.readLine().toInt()
    val stack = Stack()
    val sb = StringBuilder()

    repeat(times) {
        val ins = buffer.readLine().split(" ")
        when(ins[0]) {
            "top" -> { sb.append(stack.top()).appendLine() }
            "pop" -> { sb.append(stack.pop()).appendLine() }
            "size" -> { sb.append(stack.size()).appendLine() }
            "empty" -> {
                if (stack.empty()) {
                    sb.append(0).appendLine()
                } else {
                    sb.append(1).appendLine()
                }
            }
            "push" -> { stack.push(ins[1].toInt()) }
        }
    }
    println(sb)
}

data class StackNode(
    var item: Int,
    var next: StackNode? = null
)

data class Stack(
    var count: Int = 0,
    var last: StackNode? = null
) {
    fun push(item: Int) {
        last = StackNode(item, last)
        count++
    }

    fun pop(): Int {
        last?.let {
            val item = it.item
            last = it.next
            count--
            return item
        }
        return -1
    }

    fun size(): Int {
        return count
    }

    fun empty(): Boolean {
        return last != null
    }

    fun top(): Int {
        return if (empty()) {
            last!!.item
        } else {
            -1
        }
    }
}