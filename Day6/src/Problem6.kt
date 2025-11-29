fun main(args: Array<String>) {
    val x: Int = readLine()!!.toInt()
    when {
        x % 2 == 0 -> println("Even")
        else -> println("Odd")
    }
}