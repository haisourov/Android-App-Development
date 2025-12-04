open class Vehicle(){
    open fun move(){
        println("Vehicle moves")
    }
}


open class Car(): Vehicle(){
    override fun move() {
        super.move()
        println("Car has 4 wheels and moves faster")
    }
}
class SportsCar(): Car(){
    override fun move() {
        super.move()
        println("Sports Car goes turbo!")
    }
}

fun main(args: Array<String>) {
    val car = SportsCar()
    car.move()
}