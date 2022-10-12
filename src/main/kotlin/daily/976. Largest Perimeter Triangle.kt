package daily

fun largestPerimeter(nums: IntArray): Int {
    nums.sortDescending()
    for (index in 0 until nums.size - 2) {
        if (nums[index] < (nums[index + 1] + nums[index + 2])) return nums.triangle(index)
    }
    return 0
}

fun IntArray.triangle(index: Int) = get(index) + get(index + 1) + get(index + 2)