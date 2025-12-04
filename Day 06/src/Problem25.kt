fun main(args: Array<String>) {
	val year = readLine()!!.toInt()
    when{
        year % 400 == 0 -> println("Not Leap Year")
        year % 100 == 0 -> println("Leap Year")
        year % 4 == 0 -> println("Leap Year")
        else -> println("Not Leap Year")
    }
}
