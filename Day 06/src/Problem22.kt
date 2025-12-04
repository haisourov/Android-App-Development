fun main(args: Array<String>) {
    var x = IntArray(5)
    for (i in 0..4){
        x[i] = readLine()!!.toInt()
    }
    println(x.joinToString())
}