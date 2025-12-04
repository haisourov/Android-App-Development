import kotlin.math.sqrt
import kotlin.math.pow
fun main(args: Array<String>) {
    val (x1, y1) = readLine()!!.split(" ").map { it.toDouble() }
    val (x2, y2) = readLine()!!.split(" ").map { it.toDouble() }
    val distance = sqrt((x1-x2).pow(2)+(y1-y2).pow(2))
    println("%.4f".format(distance))

}