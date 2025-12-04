fun main(args: Array<String>) {
	val (x, y, z) = readLine()!!.split(" ").map{it.toDouble()}
    println ("${(x+y+z)/3}")
    
}
