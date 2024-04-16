package backjoon.mar08

// 너의 평점은 : 구현, 수학, 문자열

fun main() {
    val s = java.util.Scanner(System.`in`)
    var count = 20

    var allGrades = 0f
    var allcredits = 0f

    while (s.hasNextLine()) {
        val title = s.next()
        val credit = s.nextFloat()
        val score = s.nextLine()

        allcredits += credit

        when(score) {
            " A+" -> {
                allGrades += credit * 4.5f
            }
            " A0" -> {
                allGrades += credit * 4.0f
            }
            " B+" -> {
                allGrades += credit * 3.5f
            }
            " B0" -> {
                allGrades += credit * 3.0f
            }
            " C+" -> {
                allGrades += credit * 2.5f
            }
            " C0" -> {
                allGrades += credit * 2.0f
            }
            " D+" -> {
                allGrades += credit * 1.5f
            }
            " D0" -> {
                allGrades += credit * 1.0f
            }
            " F" -> {
                allGrades += credit * 0.0f
            }
            " P" -> {
                allcredits -= credit
            }
        }
        count--

        if (count == 0) {
            break
        }
    }
    println("${allGrades / allcredits}")
}