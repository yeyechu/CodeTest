package programmers

fun main() {
//    val s1 = readln().toCharArray()
//
//    s1.forEach {
//        if (it.isLowerCase()) {
//            print(it.uppercaseChar())
//        } else {
//            print(it.lowercaseChar())
//        }
//    }

    val string1 = "He11abcd1d".toCharArray()
    val string2 = "lloWorl".toCharArray()
    val s = 2

    for (i in s .. string2.size + 1) {
        string1[i] = string2[i - s]
        println(string1)
    }

    var ans = string1.joinToString("")
    println(ans)

    readln().forEach(::println)

}