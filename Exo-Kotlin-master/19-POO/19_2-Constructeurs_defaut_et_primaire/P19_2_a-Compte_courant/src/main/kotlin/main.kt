class BankAccount(var deposited : Long, var withdrawn : Long) {
    var balance = deposited - withdrawn
}


fun main() {
    val account = BankAccount(150, 82)
    account.balance
    println(account.balance)
}