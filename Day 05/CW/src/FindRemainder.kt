fun main(){
    val x: Int = 15
    val y: Int = 20
    when {
        y != 0 -> println("The remainder of $x when divided by $y is ${x%y}")
        else -> println("Cannot divide by Zero")
    }
}