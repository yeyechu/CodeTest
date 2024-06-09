package backjoon.apr18

// 듣보잡 : 자료구조, 문자열, 정렬, 해시를 사용한 집합과 맵
// n + m: 1,000,000 이하 / 시간 제한 : 2초

// LinkedList, Array + sort() -> 시간초과
// map.keys.sort() -> 416ms

fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (n, m) = buffer.readLine().split(" ").map { it.toInt() }

    // 순서는 유지하지 않아도 되므로 HashMap 이용 -> n개의 key(이름)를 입력 받고
    // m개의 key(이름)가 존재하는 지 체크
    val map = java.util.HashMap<String, Int>()
    val sb = StringBuilder()

    repeat(n) {
        val name = buffer.readLine()
        map[name] = 0
    }

    repeat(m) {
        val name = buffer.readLine()
        if (map.containsKey(name)) {
            map[name] = 1
        }
    }
    buffer.close()

    // n과 m 모두에 포함된 키만 StringBuilder에 담고 갯수를 셈
    val map2 = map.keys.sorted()
    var count = 0

    map2.forEach {
        if (map[it] == 1) {
            sb.append(it).appendLine()
            count++
        }
    }
    println(count)
    print(sb)
}

/* 시간 초과 코드
fun main() {
    val buffer = java.io.BufferedReader(java.io.InputStreamReader(System.`in`))
    val (n, m) = buffer.readLine().split(" ").map { it.toInt() }
    val max = maxOf(n, m)
    var count = 0

    val map = java.util.HashMap<Char, java.util.LinkedList<String>>()
    val list = Array(max) { "" }
    val sb = StringBuilder()

    repeat(n) {
        val name = buffer.readLine()
        map.putIfAbsent(name[0], java.util.LinkedList())
        map[name[0]]!!.add(name)
    }

    repeat(m) {
        val name = buffer.readLine()
        if (map.containsKey(name[0])) {
            if (map[name[0]]!!.contains(name)) {
                list[count++] = name
            }
        }
    }
    buffer.close()

    list.sort()
    list.forEach {
        if (it != "") {
            sb.append(it).appendLine()
        }
    }
    println(count)
    print(sb)
}
* */