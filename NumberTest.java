package B11221009;
import java.util.Scanner;
public class NumberTest {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("請輸入代表結束的整數結束訊號:");
	        int stopSignal = scanner.nextInt();

	        Numbers num = new Numbers(stopSignal);

	        int inputCount = num.inputNumbers();
	        num.displayNumbers();
	        
	        scanner.close();
	    }
	


}
