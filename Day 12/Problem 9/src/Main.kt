abstract class Employee {
    abstract fun salary()
}

class FullTimeEmployee(): Employee() {
    override fun salary() {
        println("30000 taka")
    }
}

class PartTimeEmployee(): Employee(){
    override fun salary() {
        println("10000 taka")
    }
}

fun main(args: Array<String>) {
    val a = FullTimeEmployee()
    val c = PartTimeEmployee()
    a.salary()
    c.salary()
}