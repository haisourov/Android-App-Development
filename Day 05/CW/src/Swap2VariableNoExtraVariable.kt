fun main()
{
    var x = 20
    var y = 15
    println("x is $x and y is $y")
    x += y
    y = x - y
    x = x - y
    println("After swapping x is $x and y is $y")
}