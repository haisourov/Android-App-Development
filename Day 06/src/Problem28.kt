fun main(args: Array<String>) {
	val x = readLine()!!
    var sum = 0
    for (i in x){
        sum += i.toString().toInt()
    }
    println(sum)
}
