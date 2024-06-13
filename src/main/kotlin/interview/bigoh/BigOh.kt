package interview.bigoh

import java.util.*
import kotlin.system.measureTimeMillis

fun main() {
    val arrayDeque = ArrayDeque<Int>()
    for ( i in 0..100_000_000) {
        arrayDeque.offer(1)
    }
    println(measureTimeMillis {
        for (i in 0..100_000) {
            arrayDeque.poll()
        }
    })

    val linkedList = LinkedList<Int>()
    for ( i in 0..100_000_000) {
        linkedList.offer(1)
    }
    println(measureTimeMillis {
        for (i in 0..100_000) {
            linkedList.poll()
        }
    })
}

fun listPerformance() {
    val arrayList = ArrayList<Int>()
    for (i in 0..100_000_000) {
        arrayList.add(1)
    }

    println(measureTimeMillis {
        for (i in 0..100) {
            arrayList.removeAt(1_000_000)
        }
    })

    val linkedList = LinkedList<Int>()
    for (i in 0..100_000_000) {
        linkedList.add(1)
    }

    println(measureTimeMillis {
        for (i in 0..100) {
            linkedList.removeAt(1_000_000)
        }
    })
}

