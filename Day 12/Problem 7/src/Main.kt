abstract class Animal {
    abstract fun eat()
}

class Lion(): Animal() {
    override fun eat() {
        println("Lion is eating")
    }
}

class Elephant(): Animal(){
    override fun eat() {
        println("Elephant is eating")
    }
}

fun main(args: Array<String>) {
    val a = Lion()
    val c = Elephant()
    a.eat()
    c.eat()
}