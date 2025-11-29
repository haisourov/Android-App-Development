fun main(args: Array<String>) {
    for (x in 1..20){
        when {
            x % 2 == 0 -> println(x)
            else -> continue
        }
    }
}