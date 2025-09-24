import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double amount;
        System.out.print("請輸入開戶金額：");
        amount = keyboard.nextDouble();
        Account account1 = new Account("customer", amount);
        account1.deposit(100);
        System.out.printf("戶名%s，帳戶餘額%.2f元\n", account1.getName(), account1.getBalance());
        account1.withdraw(500);
        System.out.printf("戶名%s，帳戶餘額%.2f元\n", account1.getName(), account1.getBalance());

        keyboard.close();
    }
}