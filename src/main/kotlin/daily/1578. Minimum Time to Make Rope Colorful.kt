package daily

import java.util.*

fun main(args: Array<String>) {
    println(minCost("abaac", intArrayOf(1, 2, 3, 4, 5)))
}

fun minCost(colors: String, neededTime: IntArray): Int {
    var count = 0

    val indexes = ArrayDeque<Int>()
    for (i in colors.indices) {
        if (!indexes.isEmpty() && colors[indexes.peekFirst()] == colors[i]) {
            if (neededTime[indexes.peekFirst()] < neededTime[i]) {
                count += neededTime[indexes.peekFirst()]
                indexes.removeFirst()
            } else {
                count += neededTime[i]
                continue
            }
        }
        indexes.addFirst(i)
    }

    return count
}