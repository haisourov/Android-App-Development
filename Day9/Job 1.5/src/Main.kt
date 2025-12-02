class Person(var name: String, var age: Int, var email: String){
    fun Name() {
        println("The name of this person is $name")
    }
    fun Age() {
        println("This person is $age years old")
    }
    fun Email() {
        println("This person's email address: $email")
    }
}


fun main(args: Array<String>) {
    val sourov = Person("Hasibul Islam Sourov", 18, "hasibulislamsourov1234@gmail.com")
    sourov.Name()
    sourov.Age()
    sourov.Email()
}