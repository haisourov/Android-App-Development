fun main(args: Array<String>) {
    val x = intArrayOf(1, 2, 3)
    var max = x[0]
    for (i in x){
        if (i > max) max = i
    }
    println(max)
}