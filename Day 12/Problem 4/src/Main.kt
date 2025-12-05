abstract class Payment {
    abstract fun pay()
}

class CardPayment(): Payment() {
    override fun pay() {
        println("Paid by Card")
    }
}

class CashPayment(): Payment(){
    override fun pay() {
        println("Paid by Cash")
    }
}

class OnlinePayment(): Payment(){
    override fun pay() {
        println("Paid Online")
    }
}

fun main(args: Array<String>) {
    val a = CardPayment()
    val b = CashPayment()
    val c = OnlinePayment()
    a.pay()
    b.pay()
    c.pay()
}