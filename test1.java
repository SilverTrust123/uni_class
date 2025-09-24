public static void main(String[] args){
public class test1 {
    private String cardNumber;
    private int balance;

    public test1(String cardNumber, int initialBalance) {
        this.cardNumber = cardNumber;
        this.balance = initialBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int add(int value) {
        if (value >= 0) {
            balance += value;
        }
        return balance;
    }
}
 }