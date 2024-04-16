package backjoon.apr03

// 분해합 : 브루트포스 알고리즘

fun main() {
    val input = readln()
    val number = input.toInt()
    val temp = input.length * 9

    for (i in number - temp..number) {

        if (sum(i.toString()) == number) {
            println(i)
            return
        }
    }
    println(0)

}

fun sum(n: String): Int {
    var sum = n.toInt()
    val elements = n.toCharArray().map { it - '0' }

    elements.forEach {
        sum += it
    }

    return sum
}