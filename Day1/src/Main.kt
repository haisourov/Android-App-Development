
fun main()
{
    /*
    println() ==>> prints and adds a new line
    print() ==>> prints, no new line
    val ==>> const
    var ==>> variable
    main function declared with fun main(){ }
    */
    val name = "Hasibul Islam Sourov"
    var age = 19
    print(age)
    println(name)
    
    
    
    /*
    2 categories of Data Type
    1. Primitive => Byte, Short, Int, Long, Char, Float, Double, Boolean
    2. Reference => String, Array, List, Set, Map

    Byte = 8 bit = -128 to 127 = -2⁷ to (2⁷ - 1) 
    Short = 16 bit = -32768 to 32767 = -2¹⁵ to (2¹⁵-1)
    Int = 32 bit = -2147483648 to 2147483647 = -2³¹ to (2³¹-1)
    Long = 64 bit = -2⁶³ to (2⁶³ - 1)

    Unsigned version just add U as in UByte, UShort, UInt, ULong
    and when writing the number add u in the last
    Bit number of the Unsigned version is the same
    if it is n bit the range is 0 to (2ⁿ-1)

    Float and Double do not have unsigned version
    Float = 32 bit
    Double = 64 bit
    if it is n bit the range is 0 to (2ⁿ-1)

    String, Char, Boolean
    String ==>> "Text"
    Char ==>> 'c'
    Boolean ==>> true or false

    */

    var institute: String = "Dewan ICT Institute"
    var character: Char = 'c'
    val AllahIsAlmighty: Boolean = true



    /*
    4 collection Data Types in Kotlin => List, Array, Set, Map
    List => Ordered => Duplicates Allowed => Immutable/mutable => by index
    Set => Unordered => not Allowed => Immutable/mutable => by element
    Array => Ordered => Allowed => immutable => by index
    Map => Unordered (keys) => Allowed (not for keys) => Immutable/mutable => by key

    Map ==> Dictionary
    */

    val numbers = listOf(10, 20, 30)
    println(numbers[1])       // 20
    println(numbers.get(1))   // 20
    println(numbers.elementAt(1))   // 20
    println(numbers.first())  // 10
    println(numbers.last())   // 30


    val namds = listOf("Alice", "Bob", "Alice")
    println(namds.contains("Bob"))     // true
    println(namds.indexOf("Alice"))    // 0
    println(namds.lastIndexOf("Alice"))// 2

    val letters = listOf("a", "b", "c", "d")
    println(letters.subList(1, 3)) // [b, c]
    println(letters.slice(listOf(0, 2))) // [a, c]

    var nums = listOf(3, 1, 4, 2)
    println(nums.sorted())          // [1, 2, 3, 4]
    println(nums.sortedDescending())// [4, 3, 2, 1]
    println(nums.shuffled())          // randomly shuffles

    nums = mutableListOf(1, 2, 3, 4)
    println(nums.map { it * 2 })       // [2, 4, 6, 8]
    println(nums.filter { it % 2 == 0 }) // [2, 4]
    nums.forEach {num -> println(num * 2)}
    /*
    2
    4
    6
    8
    */
    nums.add(6)
    println(nums) // [1, 2, 3, 4, 6]
    nums.remove(2)
    println(nums) // [1, 3, 4, 6]





    nums = listOf(5, 10, 15)
    println(nums.sum())       // 30
    println(nums.count())     // 3
    println(nums.average())   // 10.0
    println(nums.maxOrNull()) // 15
    println(nums.minOrNull()) // 5

    val numcs = mutableListOf(1, 2, 3)
    numcs.add(4)              // [1, 2, 3, 4]
    numcs.add(1, 10)          // [1, 10, 2, 3, 4]
    numcs.addAll(listOf(20, 30)) // [1, 10, 2, 3, 4, 20, 30]


    val colors = mutableListOf("Red", "Green", "Blue")
    colors.remove("Green")   // [Red, Blue]
    colors.removeAt(0)       // [Blue]
    colors.clear()           // []

    val names = listOf("Alice", "Bob", "Charlie")

    names.forEachIndexed { index, name ->
        println("Index $index: $name")
    }
    /*
    Index 0: Alice
    Index 1: Bob
    Index 2: Charlie
     */



    var arr = arrayOf("A", "B", "C")
    println(arr.get(0))   // A
    arr.set(1, "Z")
    println(arr.size)     // 3
    println(arr.first())  // A
    println(arr.last())   // C

    var integers: Array<Int> = arrayOf(1, 2, 3, 2)
    println(integers.indexOf(2))     // 1
    println(integers.lastIndexOf(2)) // 3
    println(integers.contains(5))    // false

    var farr: Array<Int> = arrayOf(5, 2, 8)
    println(farr.map { it * 2 })       // [10, 4, 16]
    println(farr.filter { it > 4 })    // [5, 8]
    println(farr.sorted())             // [2, 5, 8]

    var carr = arrayOf(4, 7, 1)
    println(carr.sum())        // 12
    println(carr.average())    // 4.0
    println(carr.maxOrNull())  // 7
    println(carr.minOrNull())  // 1

    val numds = arrayOf(10, 20, 30)
    println(numds[1]) // 20
    numds[2] = 40
    println(numds.joinToString()) // 10, 20, 40






    val fruits = mutableSetOf("Apple", "Banana")
    fruits.add("Mango")
    fruits.remove("Banana")
    println(fruits.contains("Apple")) // true
    println(fruits.size)                    // 3
    println(fruits.isEmpty())              // false

    val setA = setOf(1, 2, 3)
    val setB = setOf(3, 4, 5)

    println(setA.union(setB))      // [1, 2, 3, 4, 5]
    println(setA.intersect(setB))  // [3]
    println(setA.subtract(setB))   // [1, 2]


    val numbs = setOf(5, 3, 1)
    println(numbs.toList())       // [5, 3, 1]
    println(numbs.toSortedSet())  // [1, 3, 5]
    println(nums.toList())  // [1, 3, 5]




    val capitals = mapOf("Bangladesh" to "Dhaka", "India" to "New Delhi")
    println(capitals["India"])   // New Delhi
    println(capitals.keys)       // [Bangladesh, India]
    println(capitals.values)     // [Dhaka, New Delhi]

    val mutableCapitals = mutableMapOf("USA" to "Washington")
    mutableCapitals.put("UK", "London")
    mutableCapitals["France"] = "Paris"   // shorthand
    mutableCapitals.remove("USA")
    println(mutableCapitals) // {UK=London, France=Paris}

    val map1 = mutableMapOf("a" to 1, "b" to 2)
    val map2 = mapOf("c" to 3, "d" to 4)

    map1.putAll(map2)   // Adds all entries from map2 into map1
    println(map1)       // {a=1, b=2, c=3, d=4}

    // isEmpty and isNotEmpty works in similar way

    val scores = mapOf("Alice" to 85, "Bob" to 90)
    scores.forEach { (name, score) ->
        println("$name scored $score")
    }

    val numzs = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(numzs.mapKeys { it.key * 10 })   // {10=One, 20=Two, 30=Three}
    println(numzs.mapValues { it.value.uppercase() }) // {1=ONE, 2=TWO, 3=THREE}
    println(numzs.filter { it.key % 2 == 1 }) // {1=One, 3=Three}

    val map3 = mapOf("a" to 1, "b" to 2)
    val map4 = mapOf("c" to 3)

    val combined = map3 + map4   // returns a new map
    println(combined)            // {a=1, b=2, c=3}




// basic Conditional Statements are same as C/C++, there's one additional which is "when"

    val day: Int = 4
    val result: String = when (day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid Input"
    }
    println(result)

    

}