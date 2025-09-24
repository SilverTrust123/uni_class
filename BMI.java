import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        // 創建一個Scanner對象，用於讀取用戶輸入
        Scanner scanner = new Scanner(System.in);
        
        // 提示用戶輸入身高（以cm為單位）
        System.out.print("請輸入您的身高（cm）: ");
        int height = scanner.nextInt();
        
        // 提示用戶輸入體重（以kg為單位）
        System.out.print("請輸入您的體重（kg）: ");
        int weight = scanner.nextInt();
        
        // 關閉Scanner對象S
        scanner.close();
        
        // 計算BMI
        int bmi = (weight * 10000) / (height * height);
        
        // 顯示BMI值
        System.out.println("您的BMI值為: " + bmi);
     }
 }
