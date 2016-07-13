import data.Location
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

    println("plus1: " + plus1(list))

    // ----------------------------

    val tempList = ArrayList<Int>()
    tempList.add(75)
    tempList.add(75)
    tempList.add(75)
    tempList.add(75)
    tempList.add(75)

    val loc = Location("Funky Town", 1000000,tempList)
    println("locationToCoordinates: " + locationToCoordinates(loc))

    // -----------------------------

    print("infix .p(): ")
    println(2 p 2)

    // -----------------------------

    val sum = delayedSum(2, 4)

    println("delayedSum() call: " + sum)

    println("sum() call: " + sum())

    // -----------------------------
}