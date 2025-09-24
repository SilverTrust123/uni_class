public class Account {
    private String name;     
    private double balance; 
    public Account(String name, double balance) {
        if (balance < 0) {
            System.out.println("開戶金額不得為負值");
        }
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println("存款金額不得為負值");
        }
        balance += amount;
        return balance;
    }
    public double withdraw(double amount) {
        if (amount < 0) {
            System.out.println("提款金額不得為負值");
        }
        if (amount > balance) {
            System.out.println("提款金額超過帳戶餘額，無法提款");
        }
        balance -= amount;
        return balance;
    }
}
