import java.util.Scanner;

public class EasyCard {
    private int balance;

    // 建構子，初始化悠遊卡餘額
    public EasyCard() {
        balance = 0;
    }

    // 設定餘額的方法
    public void setBalance(int amount) {
        balance = amount;
    }

    // 取得餘額的方法
    public int getBalance() {
        return balance;
    }

    // 加值方法，將傳入的金額加到餘額中
    public int add(int amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    // 扣款方法，從餘額中扣除金額
    public int deduct(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
        return balance;
    }

    // 檢查卡內是否有足夠的餘額支付指定金額
    public boolean canPay(int amount) {
        return balance >= amount;
    }

public class EasyCardTest {
    public static void main(String[] args) {
        // (1) 宣告一鍵盤變數input，產生一個鍵盤物件，並將位址存入input。
        Scanner input = new Scanner(System.in);

        // (2) 宣告一悠遊卡變數myCard，產生一個悠遊卡物件，並設定開卡餘額為0。
        EasyCard myCard = new EasyCard();
        myCard.setBalance(0);

        // (3) 要求使用者從鍵盤輸入一整數(500)並存入整數變數num。
        System.out.print("請輸入一整數: ");
        int num = input.nextInt();

        // (4) 呼叫myCard加值，將num傳入add方法，並將新餘額存入整數變數newValue。
        int newValue = myCard.add(num);

        // (5) 呼叫myCard取得餘額，並將結果顯示在螢幕，並換行。
        System.out.println("儲值餘額：" + newValue + "元");

        // 關閉鍵盤輸入
        input.close();
    }
}
