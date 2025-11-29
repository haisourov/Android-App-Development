fun main(args: Array<String>) {
    val x = readLine()!!
    var vowel_num = 0
    for (i in x){
        when (i) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'O', 'I', 'U' -> vowel_num++
        }
    }
    println("Vowel number is $vowel_num")
}