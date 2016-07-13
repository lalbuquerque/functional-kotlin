import data.Location
import java.util.*

/**
* Created by lalbuquerque on 7/1/16.
*/


/**
 * Adds 1 to each element of a given List<Int>
 */
fun plus1(intList: List<Int>) : List<Int> {
    if (intList.size == 0) return emptyList()
    return intList.map { it + 1 }
}

/**
 * Transforms a location object into a coordinates (x, y) map
 *
 * TODO: Turn it more readable
 */
fun locationToCoordinates(location: Location) = toMap(location.temperatures.sum().div(location.temperatures.size), location.population)

/**
 * Returns a map with the informed key and value
 * */
fun <K, V> toMap(k: K, v: V) : Map<K, V> {
    val map = HashMap<K, V>()
    map.put(k, v)
    return map
}

/**
 * Sums all the items in the list
 */
fun List<Int>.sum() = this.reduce { a, i -> a + i }

/**
 * An infix that applies a sum given two Int
 */
infix fun Int.`p`(right: Int): Int = this + right

/**
 * A function that returns another function for future evaluation
 */
fun delayedSum(x: Int, y: Int): () -> Int {
    return fun() = x + y
}