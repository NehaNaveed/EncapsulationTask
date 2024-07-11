//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class BankAccount (private var balance:Double){
    fun deposit(money:Double){
        balance += money
        println("$money deposited.")
    }
    fun withdraw(money:Double){
        if (money>balance){
            println("Insufficient Balance")
        }
        else {
            balance -= money
            println("$money withdrawed.")
        }
    }

    fun getBalance():Double{
        return this.balance
    }
}

fun  main()
{
    val acc:BankAccount = BankAccount(5000.0)
    println("Current balance: ${acc.getBalance()}")
    acc.deposit(1500.0)
    println("Updated balance: ${acc.getBalance()}")
    acc.withdraw(500.0)
    println("Updated balance: ${acc.getBalance()}")
}