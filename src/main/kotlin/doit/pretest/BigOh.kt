package doit.pretest

import kotlin.random.Random
import kotlin.system.measureTimeMillis

fun main() {
    println("${measureTimeMillis {
        getNumber()
    }}ms")

}

fun getNumber() {
    val findNumber = Random.nextInt(100)

    for (i in 0..99) {
        if(i == findNumber) {
            println(findNumber)
            break
        }
    }
}

