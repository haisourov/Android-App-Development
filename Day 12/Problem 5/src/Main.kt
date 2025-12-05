abstract class StudentActivity {
    abstract fun perform()
}

class Study(): StudentActivity() {
    override fun perform() {
        println("Studying")
    }
}

class Sports(): StudentActivity(){
    override fun perform() {
        println("Playing sports")
    }
}

class Music(): StudentActivity(){
    override fun perform() {
        println("Performing music")
    }
}

fun main(args: Array<String>) {
    val a = Study()
    val b = Sports()
    val c = Music()
    a.perform()
    b.perform()
    c.perform()
}