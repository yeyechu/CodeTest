package interview.bigoh

import java.util.ArrayDeque
import java.util.Deque
import java.util.LinkedList
import kotlin.system.measureTimeMillis

fun main() {
    println(measureTimeMillis {
        val array= arrayListOf<Int>()
        println(array.javaClass.toString())
//        for (i in 0..100_000_000) {
//            array.add(1)
//        }
//
//        println("ArrayList 삭제 속도: ${measureTimeMillis {
//            for (i in 0..100) {
//                array.remove(1_000_000)
//            }
//        }}ms")
    })

    println(measureTimeMillis {
        val list = LinkedList<Int>()
        println(list.javaClass.toString())
//        for (i in 0..100_000_000) {
//            list.add(1)
//        }
//        println("LinkedList 삭제 속도: ${measureTimeMillis {
//            for (i in 0..100) {
//                list.remove(1_000_000)
//            }
//        }}ms")
    })

    println(measureTimeMillis {
        val list = mutableListOf<Int>()
        println(list.javaClass.toString())
//        for (i in 0..100_000_000) {
//            list.add(1)
//        }
//        println("MutableList 삭제 속도: ${measureTimeMillis {
//            for (i in 0..100) {
//                list.remove(1_000_000)
//            }
//        }}ms")
    })

    val list = listOf(1, 2, 3)
    println(list.javaClass.toString())

    val map = mapOf(1 to 1, 2 to 2)
    println(map.javaClass)

    val muMap = mutableMapOf(1 to 1, 2 to 2)
    println(map.javaClass)

    println(measureTimeMillis {
        val deque = ArrayDeque<Int>()
        for (i in 1..100_000_000) {
            deque.offer(1)
        }
        println("ArrayDeque 10만 개 추출${measureTimeMillis { 
            for (i in 1..100_000) {
                deque.poll()
            }
        }}ms")
    })

    println(measureTimeMillis {
        val deque : Deque<Int> = LinkedList()
        for (i in 1..100_000_000) {
            deque.offer(1)
        }
        println("LinkedList 10만 개 추출${measureTimeMillis {
            for (i in 1..100_000) {
                deque.poll()
            }
        }}ms")
    })
}

