fun main(args: Array<String>) {
    val (A, B, C) = readLine()!!.split(" ")
    val D = A.toDouble()
    val E = B.toDouble()

    when {
        C == "+" -> println("Sum is ${D + E}")
        C == "-" -> println("Difference is ${D - E}")
        C == "*" -> println("Product is ${D * E}")
        C == "/" && E != 0.0 -> println("Sum is ${D / E}")
        else -> println("Invalid input")
    }
}