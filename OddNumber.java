package B11221009;

import java.util.Scanner;

public class OddNumber {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter intergren: ");
        int number = scanner.nextInt();
        int answer = number%2;
        
        if (answer==1) {
            System.out.println("基數");
        } else {
            System.out.println("偶數");
        }
        scanner.close();
       
	}

}
