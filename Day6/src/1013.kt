

fun main(args: Array<String>) {

    val A = readLine()!!.split(" ").map{it.toInt()}
    val B = (A[0] + A[1])
    println("$B eh o maior")

}

fun abs(a: Int):Int {
    when {
        a < 0 -> return -a
        else -> return a
    }
}