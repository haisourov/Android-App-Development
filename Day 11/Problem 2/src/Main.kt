open class Vehicle(){
    open fun start(){
        println("Vehicle has started")
    }
}
open class Car(): Vehicle(){
    open fun drive(){
        super.start()
        println("Car is driving")
    }
}
class Tesla(): Car(){
    override fun start() {
        super.start()
        println("Tesla has started")
    }
}
fun main(args: Array<String>) {
    val car = Tesla()
    car.drive()
}
