package B11221009;
import java.util.Scanner;
public class mymathTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);      
		System.out.print("Enter a double number: ");
		        double inputNumber = scanner.nextDouble();
		        int ceiledValue = mymath.ceil(inputNumber);
		        System.out.println("Ceil value: " + ceiledValue);

		      
		        System.out.print("Enter start value: ");
		        int startValue = scanner.nextInt();
		        System.out.print("Enter end value: ");
		        int endValue = scanner.nextInt();

		        int perfectNumberCount = mymath.countPerfectNumber(startValue, endValue);
		        System.out.println("Number of perfect numbers between " + startValue + " and " + endValue + ": " + perfectNumberCount);

		        scanner.close();
		    }

	}


