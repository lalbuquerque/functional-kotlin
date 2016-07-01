import java.util.*

/**
 * Created by lalbuquerque on 6/30/16.
 */

fun main(args: Array<String>) {
    val list = ArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)

    println(plus1(list))
}

/**
 * Adds 1 to each element of a given List<Int>
 */
fun plus1(intList: List<Int>) : List<Int> {
    if (intList.size == 0) return emptyList()
    return intList.map { it + 1 }
}