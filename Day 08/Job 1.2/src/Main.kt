fun main(args: Array<String>) {
    print("Hi! What is your name? \n => ")
    val name = readLine()!!
    print("Hello $name! How old are you? \n => ")
    val age = readLine()!!.toInt()
    println("Woah! $name, your age is $age. So you are ${if (age >= 18) "an adult" else "not an adult"}." )
}