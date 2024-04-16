package leetcode

import kotlin.system.measureTimeMillis

fun main() {
    println(findItinerary(listOf(
        arrayListOf("MUC", "LHR"),
        arrayListOf("JFK", "MUC"),
        arrayListOf("SFO", "SJC"),
        arrayListOf("LHR", "SFO"))))

    println(measureTimeMillis {
        findItinerary(listOf(
            arrayListOf("JFK", "SFO"),
            arrayListOf("JFK", "ATL"),
            arrayListOf("SFO", "ATL"),
            arrayListOf("ATL", "JFK"),
            arrayListOf("ATL", "SFO")))
    })

    println(findItineraryDFS(listOf(
        arrayListOf("MUC", "LHR"),
        arrayListOf("JFK", "MUC"),
        arrayListOf("SFO", "SJC"),
        arrayListOf("LHR", "SFO"))))

    println(measureTimeMillis {
        findItineraryDFS(listOf(
            arrayListOf("JFK", "SFO"),
            arrayListOf("JFK", "ATL"),
            arrayListOf("SFO", "ATL"),
            arrayListOf("ATL", "JFK"),
            arrayListOf("ATL", "SFO")))
    })
}

fun findItinerary(tickets: List<List<String>>): List<String> {
    val itinerary = mutableMapOf<String, java.util.PriorityQueue<String>>()

    for (ticket in tickets) {
        itinerary.putIfAbsent(ticket[0], java.util.PriorityQueue())
        itinerary[ticket[0]]!!.add(ticket[1])
    }

    val results: MutableList<String> = java.util.LinkedList()
    val stack: java.util.Deque<String> = java.util.ArrayDeque()
    stack.push("JFK")

    while (stack.isNotEmpty()) {
        while (itinerary.containsKey(stack.first) && itinerary[stack.first]!!.isNotEmpty()) {
            stack.push(itinerary[stack.first]!!.poll())
        }
        results.add(0, stack.pop())
    }

    return results
}

fun findItineraryDFS(tickets: List<List<String>>): List<String> {
    val results: MutableList<String> = java.util.LinkedList()
    val map = mutableMapOf<String, java.util.PriorityQueue<String>>()

    for (ticket in tickets) {
        map.putIfAbsent(ticket[0], java.util.PriorityQueue())
        map[ticket[0]]!!.add(ticket[1])
    }

    fun dfs(sub: List<String>, itinerary: Map<String, java.util.PriorityQueue<String>>, depart: String) {





        while (itinerary.containsKey(depart) && itinerary[depart]!!.isNotEmpty()) {
            dfs(sub, itinerary, itinerary[depart]!!.poll())
        }


        results.add(0, depart)

    }



    dfs(results, map, "JFK")

    return results
}