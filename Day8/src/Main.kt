fun main(args: Array<String>) {
    val a = readln()
    val b = readln()
    println(addnum(a, b))
    val A = readLine()!!.split(" ").map{it.toDouble()}
    addlist(A)

}

fun addnum(a: Any = "", b: Any = ""): Any{
    if (a == "" || b == "") return "Input not provided"
    var d = a.toString().toDouble()
    var c = b.toString().toDouble()
    return c + d
}

fun addlist(A: List<Double>){
    var sum: Double = 0.0
    for (i in A){
        sum += i
    }
    println(sum)
}