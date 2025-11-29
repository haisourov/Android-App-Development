fun main(){
    val x: Int = 15
    val y: Int = 20
    when {
        y != 0 -> println("The quotient of $x and $y is ${x*y}")
        else -> println("Cannot divide by Zero")
    }
}