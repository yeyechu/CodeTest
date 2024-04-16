package programmers

fun main() {
    println(itineraryP(arrayOf(
        arrayOf("ICN", "JFK"),
        arrayOf("HND", "IAD"),
        arrayOf("JFK", "HND"))).toList())
}

fun itineraryP(tickets: Array<Array<String>>): Array<String> {
    val answer = java.util.LinkedList<String>()
    val map = mutableMapOf<String, java.util.PriorityQueue<String>>()

    for (ticket in tickets) {
        map.putIfAbsent(ticket[0], java.util.PriorityQueue())
        map[ticket[0]]!!.add(ticket[1])
    }

    fun dfs(sub: List<String>, itinerary: Map<String, java.util.PriorityQueue<String>>, depart: String) {
        while (itinerary.containsKey(depart) && itinerary[depart]!!.isNotEmpty()) {
            dfs(sub, itinerary, itinerary[depart]!!.poll())
        }
        answer.add(0, depart)
    }

    dfs(answer, map, "ICN")

//    val stack: java.util.Deque<String> = java.util.ArrayDeque()
//    stack.push("ICN")
//
//    while (stack.isNotEmpty()) {
//        while (map.containsKey(stack.first) && map[stack.first]!!.isNotEmpty()) {
//            stack.push(map[stack.first]!!.poll())
//        }
//        answer.add(0, stack.pop())
//    }

    return answer.toTypedArray()
}