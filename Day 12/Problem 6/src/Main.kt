abstract class Shape {
    abstract fun area()
}

class Square(val len: Int): Shape() {
    override fun area() {
        println(len*len)
    }
}

class Circle(val len: Int): Shape(){
    override fun area() {
        println(3.1416 * len * len)
    }
}


fun main(args: Array<String>) {
    val circle = Circle(5)
    val square = Square(3)

    circle.area()
    square.area()
}