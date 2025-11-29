fun main()
{
    //for Type checking 'is' is used
    val a = "1234"
    println(a is Int)

    // in when condition multiple values can be combined and when has two forms
    // 1st form
    var result = when {
        a is Int -> println("It is an integer")
        a is String -> println("It is a string")
        else -> println("Nothing")
    }

    //2nd form
    result = when (a){
        "1234", "1" -> println(a)
        else -> println("Nothing")
    }


    // 3 types of loops in kotlin, while, do while, for
    // while, do while loop is same as C/C++
    // for is similar to Python
    var collection = listOf(1, 2, 3) // can be any type of collection (String, Array, Map, List, range)
    for (item in collection) {
        println(item)
    }

    for (i in 1..5) {
        println(i)   // prints 1,2,3,4,5
    }

    for (i in 1..<5) {
        println(i)   // prints 1,2,3,4
    }
    for (i in 1 until 5) {
        println(i)   // prints 1,2,3,4
    }


    for (i in 1..10 step 2) {
        println(i)   // prints 1,3,5,7,9
    }


    for (i in 5 downTo 1) {
        println(i)   // prints 5,4,3,2,1
    }


    var fruits = listOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println(fruit)
    }

    for (index in fruits.indices) {
        println("Index $index: ${fruits[index]}")
    }
    for ((index, value) in fruits.withIndex()) {
        println("Index $index: $value")
    }

    for (ch in "Hello") {
        println(ch)   // prints H, e, l, l, o
    }


    val map = mapOf("a" to 1, "b" to 2)
    for ((key, value) in map) {
        println("$key -> $value")
    }

    // continue and break works the same way as C/C++

}