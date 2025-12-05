abstract class Shape {
    abstract fun draw()
}

class Square(val len: Int): Shape() {
    override fun draw() {
        println("Square is drawn")
    }
}

class Circle(val len: Int): Shape(){
    override fun draw() {
        println("Circle is drawn")
    }
}


fun main(args: Array<String>) {
    val circle = Circle(5)
    val square = Square(3)

    circle.draw()
    square.draw()
}