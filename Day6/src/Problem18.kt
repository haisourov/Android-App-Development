fun main(args: Array<String>) {
    val x = readLine()!!
    for (i in x) {
        if (i - 32 >= 'A' ) print(i-32)
        else print(i)
    }
    println("")

}