fun main(args: Array<String>) {
    val x: Double = readLine()!!.toDouble()
    when {
        x > 0.0 -> println("Positive")
        x < 0.0 -> println("Negative")
        else -> println("Zero")
    }
}