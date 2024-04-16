package backjoon.mar21

// 최대공약수와 최소공배수 : 수학, 정수론, 유클리드 호제법

fun main() {
    val (num1, num2) = readln().split(" ").map { it.toInt() }
    val result = cal(num1, num2)

    result.forEach {
        println(it)
    }
}

fun cal(n1: Int, n2: Int): IntArray {
    val ans = intArrayOf(1 , 1)
    val list = mutableListOf<List<Int>>()

    var num1 = n1
    var num2 = n2
    var oper = 2

    while (num1 >= oper) {
        if (num1 % oper == 0 && num2 % oper == 0) {
            ans[0] *= oper
            num1 /= oper
            num2 /= oper
        } else {
            oper++
        }
    }

    ans[1] = ans[0]

    fun dfs(number: Int, oper: Int, path: java.util.Deque<Int>) {

        if (number < oper) {
            if (number != 1) {
                path.add(number)
            }
            list.add(ArrayList(path))
            return
        }

        var num = number

        while (num % oper == 0) {
            path.add(oper)
            num /= oper
        }

        dfs(num, oper + 1, path)
    }

    dfs(num1, 2, java.util.ArrayDeque())
    dfs(num2, 2, java.util.ArrayDeque())

    list[0].forEach {
        ans[1] *= it
    }
    list[1].forEach {
        ans[1] *= it
    }

    return ans
}