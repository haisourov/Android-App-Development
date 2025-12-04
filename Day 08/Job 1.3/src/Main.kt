fun main(args: Array<String>) {
    var number: Double = readLine()!!.toDouble()
    println("${if (number > 0.0 ) "Positive" else if (number < 0.0) "Negative" else "Zero"}")
}