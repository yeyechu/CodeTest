fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    val a = readln().split(" ") // value
    var ans = 0 // variable

    println(a.toList())

    a.forEach {
        ans += it.toInt()
    }

    println(ans)
}