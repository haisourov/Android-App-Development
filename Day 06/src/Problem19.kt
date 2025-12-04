fun main(args: Array<String>) {
    val x = readLine()!!
    var length = 0
    for (i in x){
        length++
    }
    for (i in length - 1  downTo 0){
        print(x[i])
    }
    println()

}