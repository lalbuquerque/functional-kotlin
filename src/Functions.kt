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
 * Transforms an object with temperatures and population into a coordinates (x, y) map
 */
fun locationToCoordinates(location: Location) : Map<Int, Int> {
    // TODO: Split it in N minor functions (make it funKTionale)
    val averageTemperature = location.temperatures.reduce { a, i -> a + i } / location.temperatures.size
    var coordinates = HashMap<Int, Int>()
    coordinates.put(averageTemperature, location.population)
    return coordinates
}

