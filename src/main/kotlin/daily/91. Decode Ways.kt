package daily

fun numDecodings(s: String): Int {
    var currentWays = 1
    var nexDigitWays = 1000
    var nexDigit = 1000
    for (ind in s.length - 1 downTo 0) {
        val digit = s[ind] - '0'
        val calc = when {
            digit == 0 -> 0
            digit * 10 + nexDigit < 27 -> currentWays + nexDigitWays
            else -> currentWays
        }
        nexDigit = digit
        nexDigitWays = currentWays
        currentWays = calc
    }
    return currentWays
}

