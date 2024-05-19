package backjoon._review.graph

// 농협 2024 상반기 코딩테스트 3번

// 입력
// gift : IntArray, wants : IntArray 일 때
// 서로 교환해서 원하는 것을 받게 되는 사람의 수 출력

fun main() {
    println(findGiftWants(intArrayOf(4, 2, 3, 5, 1), intArrayOf(2, 4, 4, 2, 1)))
    println(findGiftWants(intArrayOf(5, 4, 5, 4, 5), intArrayOf(2, 3, 4, 1, 4)))
}

fun findGiftWants(g: IntArray, w: IntArray): Int {
    var count = 0
    val location = IntArray(g.size) { 0 }

    g.forEachIndexed { i, n ->
        location[n - 1] = i + 1
    }

    fun switch(i: Int, current : Int, origin: Int) {
        g[i] = origin
        g[location[origin - 1] - 1] = current
        location[current - 1] = location[origin - 1].also { location[origin - 1] = 0 }
    }

    for (i in w.indices) {
        if (g[i] != w[i] && location[w[i] - 1] != 0) {
            switch(i, g[i], w[i])
            count++
            println("$i -> ${g.toList()} / ${w.toList()}")
        } else if (g[i] == w[i]) {
            location[w[i] - 1] = 0
            count++
        }
    }

    return count
}