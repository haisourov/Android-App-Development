fun main(args: Array<String>) {
    val integer: Int = 123
    val unsignedInt: UInt = 440000000U
    val long: Long = 440000000000L
    val unsignedLong: ULong = 440000000000UL
    val double: Double = 4.4444
    val float: Float = 4.5F
    val string: String = "Sourov"
    val boolean: Boolean = true
    val array = arrayOf(1, 2, 3, 'x', "d")
    val intarray: IntArray = intArrayOf(1, 2, 3)
    val stringarray = arrayOf("Sourov 123","Voruos 321")
    val list = listOf(1 , 3 , 4 , 'a', "fa")
    val map = mapOf('a' to 1234, 'b' to 4321)

    println(integer)
    println(long)
    println(unsignedInt)
    println(unsignedLong)
    println(double)
    println(float)
    println(string)
    println(boolean)
    println(array.joinToString())
    println(intarray.joinToString())
    println(stringarray.joinToString())
    println(list.joinToString())
    println(map)



}