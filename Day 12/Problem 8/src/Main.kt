abstract class Vehicle {
    abstract fun start()
    abstract fun stop()
}

class Car(): Vehicle() {
    override fun start() {
        println("Car is starting")
    }
    override fun stop() {
        println("Car is stopping")
    }
}

class Bike(): Vehicle(){
    override fun start() {
        println("Bike is starting")
    }
    override fun stop() {
        println("Bike is stopping")
    }
}

fun main(args: Array<String>) {
    val a = Car()
    val c = Bike()
    a.start()
    c.start()
    a.stop()
    c.stop()
}