package leetcode

fun main() {
    println(letterCombinations("23"))
    println(letterCombinations(""))
    println(letterCombinations("2"))
}

fun letterCombinations(digits: String): List<String> {
    // 전체를 탐색 -> 백트래킹으로 결과를 조합
    // 입력값의 각 키판 배열을 DFS 탐색
    // 자릿수 단위로 반복하여 재귀 탐색
    val result: MutableList<String> = mutableListOf()

    if (digits.isEmpty()) {
        return result
    }

    val dic: MutableMap<Char, List<Char>> = mutableMapOf(
        '0' to mutableListOf(),
        '1' to mutableListOf(),
        '2' to mutableListOf('a', 'b', 'c'),
        '3' to mutableListOf('d', 'e', 'f'),
        '4' to mutableListOf('g', 'h', 'i'),
        '5' to mutableListOf('j', 'k', 'l'),
        '6' to mutableListOf('m', 'n', 'o'),
        '7' to mutableListOf('p', 'q', 'r', 's'),
        '8' to mutableListOf('t', 'u', 'v'),
        '9' to mutableListOf('w', 'x', 'y', 'z')
    )

    fun dfs(index: Int, path: java.lang.StringBuilder) {
        if (path.length == digits.length) {
            result.add(path.toString())
            return
        }

        for (c in dic[digits[index]]!!) {
            dfs(index + 1, java.lang.StringBuilder(path).append(c))
        }
    }

    dfs(0, StringBuilder())
    return result
}