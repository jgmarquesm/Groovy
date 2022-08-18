package operatoroverload


class Account {

    BigDecimal balance = 0
    String type = "Lorem Ipsum"

    BigDecimal deposit(BigDecimal qtd){
        balance += qtd
    }

    BigDecimal withdraw(BigDecimal qtd) {
        if (balance  >= qtd) {
            balance -= qtd
        } else {
            balance
        }
    }

    BigDecimal plus(Account other){
        this.getBalance() + other.getBalance()
    }

    @Override
    String toString() {
        "Account[balance: $balance, Type: $type]"
    }
}

Account acc1 = new Account(balance: 500, type: "Checking")
Account acc2 = new Account(balance: 750, type: "Savings")

println acc1
acc1.withdraw(2)
println(acc1)
println acc2
acc2.deposit(300)
println acc2
def total = acc1 + acc2
println(total)
