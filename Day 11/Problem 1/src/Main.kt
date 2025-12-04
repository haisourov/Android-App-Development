open class Animal(){
    open fun eat(){
        println("Animal is eating")
    }
}

class Dog: Animal(){
    override fun eat() {
        super.eat()
        println("Dog is full now")
    }
}

fun main(args: Array<String>) {
    val dog = Dog()
    dog.eat()
}