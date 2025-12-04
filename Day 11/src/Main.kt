open class Person(private val name: String){
    fun showName() = println("Name: $name")
}

class Student(private val name: String, val roll: Int): Person(name){
    fun showRoll() = println("Roll: $roll")
}

fun main(args: Array<String>) {
    val sourov = Student("Sourov", 234344)
    sourov.showRoll()
    sourov.showName()
}