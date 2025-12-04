open class Person(private val name: String){
    open fun showName() = println("Name: $name")
}

class Student(private val name: String, val roll: Int): Person(name){
    fun showRoll() = println("Roll: $roll")
    override fun showName() {
        super.showName()
        println ("I am a student")
    }
}


open class Vehicle(){
    open fun sound() {
        println("Vroom Vroom")
    }
}
open class Car(): Vehicle(){
    open fun accelerate() {
        println("Abcd")
    }
}
class SportsCar(): Car(){
    override fun sound() {
        super.sound()
    }
}

fun Experiment() {
    fun newExperiment() {

    }
}


fun main(args: Array<String>) {
    val sourov = Student("Sourov", 234344)
    sourov.showRoll()
    sourov.showName()
}