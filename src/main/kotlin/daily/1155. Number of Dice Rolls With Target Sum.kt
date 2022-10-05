package daily

fun main(args: Array<String>) {
    println(numRollsToTarget(30, 30, 500))
}

fun numRollsToTarget(n: Int, k: Int, target: Int): Int {
    if (n == 1 && target <= k) return 1
    if (k == 1) return 0
    var count = 0
    for (i in 1..k) {
        if (target - i > 0) count += numRollsToTarget(n - 1, k, target - i)
    }
    return count
}