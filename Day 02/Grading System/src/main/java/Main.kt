fun main() {
	val marks: Int = 101
    var gp: Int = marks/10
    if (marks >=0 && marks <= 100){
    val result: String = when(gp){
        10 -> "A+"
        9 -> "A"
        8 -> "A-"
        7 -> "B"
        6 -> "C"
        else -> "Fail"
    }
    println(result)
    }
    else println("Invalid Input")
}
