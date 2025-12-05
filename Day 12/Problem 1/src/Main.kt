abstract class Animal {
    abstract fun sound()
}

class Dog(): Animal() {
    override fun sound() {
        println("Dog barks...")
    }
}

class Cat(): Animal(){
    override fun sound() {
        println("Cat meows...")
    }
}

class Cow(): Animal(){
    override fun sound() {
        println("Cow moos...")
    }
}

fun main(args: Array<String>) {
    val cat = Cat()
    val cow = Cow()
    val dog = Dog()
    cat.sound()
    cow.sound()
    dog.sound()
}