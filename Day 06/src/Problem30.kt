fun main(args: Array<String>) {
	val (a, b) = readLine()!!.split(" ").map{it.toInt()}
    val sum = add(a, b)
    println(sum)
}

fun add(a: Int, b: Int):Int 
{
    return a + b
}
