fun main(args: Array<String>)
{
    val (A, B, C) = readLine()!!.split(" ").map{ it.toDouble() }
    val pi = 3.14159
    val TRIANGULO =  String.format("%.3f", 0.5 * A * C)
    println("TRIANGULO: $TRIANGULO")

    val CIRCULO = String.format("%.3f", pi * C * C)
    println("CIRCULO: $CIRCULO")

    val TRAPEZIO = String.format("%.3f", 0.5 * (A + B) * C)
    println("TRAPEZIO: $TRAPEZIO")

    val QUADRADO = String.format("%.3f", B * B)
    println("QUADRADO: $QUADRADO")

    val RECTANGULO = String.format("%.3f", A * B)
    println("RETANGULO: $RECTANGULO")




}