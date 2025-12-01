var x = readLine()!!.toInt()

fun main(args: Array<String>) {
    println(x)
    result(100)
    result(50)
    result(20)
    result(10)
    result(5)
    result(2)
    result(1)
}
fun result(a: Int){
    println("${x/a} nota(s) de R\$ $a,00")
    x = x % a
}
