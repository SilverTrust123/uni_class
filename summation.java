package B11221009;
import java.util.Scanner;
public class summation {
    public static int summation(int n){      
    if (n > 0) {
       Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < n) {
            System.out.print((count + 1)+": ");
            int xi = scanner.nextInt();
            sum += 2 * xi * xi - xi + 1;
            count++;
        }
        scanner.close();

        return sum;
    }else{
        return -999 ;
        }
    }
    public static void main(String[] args) {
        System.out.print("Please enter how many n：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = summation(n);
        if (result == -999) {
            System.out.println("-999");
        } else {
            System.out.println("Answer is ：" + result);
        }
        scanner.close();
    }
}