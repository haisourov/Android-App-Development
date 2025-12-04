fun main(){
    var num: Int = 123
    when {
        num % 2 == 0 -> println("$num is even")
        else -> println("$num is odd")
    }
    //Alternative
    /*
    var num: Int = 123
    if (num.isEven()) println("$num is Even") else println("$num is odd")
     */
}