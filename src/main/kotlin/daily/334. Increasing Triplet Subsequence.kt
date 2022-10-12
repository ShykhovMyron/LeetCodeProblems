package daily

fun increasingTriplet(nums: IntArray): Boolean {

    val ints = IntArray(2) { Int.MAX_VALUE }
    for (num in nums) {
        if (num <= ints[0]) ints[0] = num
        else if (num <= ints[1]) ints[1] = num
        else return true
    }
    return false
}