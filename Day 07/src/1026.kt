fun main(args: Array<String>) {
    var (x, y) = readLine()!!.split(" ").map{ it.toUInt()}
    println(x xor y)


}

