open class Parent(private val name: String){
    open fun info(){
        println("I am $name")
    }
}
open class Child(private val name: String, private val job: String):Parent(name){
    override fun info() {
        super.info()
        println("I am a ${job}")
    }
}

class Grandchild(private val name: String, private val job: String, private val id: Int): Child(name, job){
    override fun info(){
        super.info()
        println("My id is ${id}")
    }
}

fun main(args: Array<String>) {
    val person = Grandchild("Sourov", "Computer Scientist", 175209 )
    person.info()
}