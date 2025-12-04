fun main() {
	val a: Double = 2.5
    val b: Double = 3.0
    val op = '/'
    val result = when (op){
        '+' -> a + b
        '-' -> a - b
        '/' -> if (b!=0.0) a / b else println("Cannot divide by 0")
        '%' -> if (b!=0.0) a % b else println("Cannot divide by 0")
        '*' -> a * b
        else -> "Invalid"
    }
    println(result)
}
