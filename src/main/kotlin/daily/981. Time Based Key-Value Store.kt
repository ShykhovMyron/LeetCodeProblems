package daily

import java.util.*

fun main() {
    val timeMap = TimeMap()
    println(timeMap.set("foo", "bar", 1))
    println(timeMap.get("foo", 1))
    println(timeMap.get("foo", 3))
    println(timeMap.set("foo", "bar2", 4))
}

class TimeMap {

    private val values = HashMap<String, TreeMap<Int, String>>()

    fun set(key: String, value: String, timestamp: Int) {
        with(values) {
            if (!contains(key)) {
                put(key, TreeMap<Int, String>().also {
                    it[Int.MAX_VALUE] = ""
                    it[Int.MIN_VALUE] = ""
                })
            }
            getValue(key).put(timestamp, value)
        }
    }

    fun get(key: String, timestamp: Int): String =
        if (values.containsKey(key)) values.getValue(key).floorEntry(timestamp).value
        else ""

}

/**
 * Your TimeMap object will be instantiated and called as such:
 * var obj = TimeMap()
 * obj.set(key,value,timestamp)
 * var param_2 = obj.get(key,timestamp)
 */