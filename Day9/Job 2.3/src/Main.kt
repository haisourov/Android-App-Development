class Calculator {
    fun add(a: Number, b: Number): Double {
        val c = a.toDouble()
        val d = b.toDouble()
        return c + d
    }
    fun subtract(a: Number, b: Number): Double {
        val c = a.toDouble()
        val d = b.toDouble()
        return c - d
    }
    fun multiply(a: Number, b: Number): Double {
        val c = a.toDouble()
        val d = b.toDouble()
        return c * d
    }
    fun divide(a: Number, b: Number): Double? {
        val c = a.toDouble()
        val d = b.toDouble()
        if (d == 0.0) {
            println("Cannot divide by zero")
            return null
        }
        return c + d
    }
}


fun main(args: Array<String>) {
    val calc = Calculator()
    println(calc.add(1, 2))
    println(calc.subtract(2, 1))
    println(calc.multiply(3, -2))
    println(calc.divide(4, 0))
}