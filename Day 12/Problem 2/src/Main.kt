abstract class Vehicle {
    abstract fun move()
}

class Car(): Vehicle() {
    override fun move() {
        println("Car moves")
    }
}

class Bike(): Vehicle(){
    override fun move() {
        println("Bike moves")
    }
}

class Bus(): Vehicle(){
    override fun move() {
        println("Bus moves")
    }
}

fun main(args: Array<String>) {
    val car = Car()
    val bike = Bike()
    val bus = Bus()
    car.move()
    bike.move()
    bus.move()
}