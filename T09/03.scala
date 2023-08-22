class Account(n:Int, b:Double) {
    val acnumber:Int = n
    var balance:Double = b

    def withdraw(a:Double) = this.balance = this.balance - a
    def deposit(a:Double) = this.balance = this.balance + a
    def transfer(a:Account, b:Double) = {
        if (this.balance < b) println("Insufficient balance")
        else 
            {
                this.withdraw(b)
                a.deposit(b)
            }
    }

    override def toString = "["+acnumber+" : "+balance+"]"
}

object Q3 extends App{
    var a1 = new Account(1, 1000)
    var a2 = new Account(2, 2000)
  
    println(a1)
    println(a2)

    a1.deposit(100)
    a2.withdraw(100)

    println(a1)
    println(a2)

    a1.transfer(a2, 3500)
    println(a1)
    println(a2)
}
