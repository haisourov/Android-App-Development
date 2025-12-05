abstract class Machine {
    abstract fun turnOn()
    abstract fun turnOff()
}

class Fan(): Machine() {
    override fun turnOn() {
        println("Fan is turning on")
    }
    override fun turnOff() {
        println("Fan is turning off")
    }
}

class Computer(): Machine(){
    override fun turnOn() {
        println("Computer is turning on")
    }
    override fun turnOff() {
        println("Computer is turning off")
    }
}

fun main(args: Array<String>) {
    val a = Fan()
    val c = Computer()
    a.turnOn()
    c.turnOn()
    a.turnOff()
    c.turnOff()
}