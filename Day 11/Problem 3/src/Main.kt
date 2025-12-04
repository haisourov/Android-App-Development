open class Person(private val name: String){
    open fun show(){
        println("My name is $name")
    }
}

class Student(private val name: String, private val roll: Int): Person(name) {
    override fun show(){
        super.show()
        println("I am a Student. My roll is $roll")
    }
}

class Teacher(private val name: String, private val subject: String): Person(name){
    override fun show() {
        super.show()
        println("I am a Teacher. I teach the subject of $subject")
    }
}

fun main(args: Array<String>) {
    val sourov = Student("Sourov", 234344)
    val dilip = Teacher("Dilip", "Math")
    sourov.show()
    dilip.show()

}