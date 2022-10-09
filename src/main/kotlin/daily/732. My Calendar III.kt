package daily

import java.util.*

fun main() {
    val myCalendarThree = MyCalendarThree()
    myCalendarThree.book(10, 20)
    myCalendarThree.book(50, 60)
    myCalendarThree.book(10, 40)
    myCalendarThree.book(5, 15)
    myCalendarThree.book(5, 11)
    myCalendarThree.book(25, 55)
    myCalendarThree.book(0, 5)
}

class MyCalendarThree {

    private val booking = TreeMap<Int, Int>()

    fun book(start: Int, end: Int): Int {
        booking.inc(start)
        booking.inc(end, -1)

        var events = 0
        var answer = 0

        booking.forEach { entry ->
            events += entry.value
            answer = answer.coerceAtLeast(events)
        }

        return answer
    }

    fun <T> MutableMap<T, Int>.inc(key: T, more: Int = 1) = merge(key, more, Int::plus)
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * var obj = MyCalendarThree()
 * var param_1 = obj.book(start,end)
 */