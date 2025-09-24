package B11221009;

import java.util.Scanner;

public class FiveUnitsDigitalNumberCalculate {

	public static void main(String[] args) {
		//Input 五位數
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a five units digital number: ");
        int answer = scanner.nextInt();
        scanner.close();
        //運算
        int plus    = (answer) + 5;
        int minus   = (answer) - 5;
        int times   = (answer) * 5;
        int divided = (answer) / 5;
        int single  = (answer) % 5;
        //位數
        int unit        = (answer) % 10; 
        int ten         = (answer / 10) % 10; 
        int hundred     = (answer / 100) % 10; 
        int thousand    = (answer / 1000) % 10; 
        int tenThousand = (answer / 10000)%10; 
        //運算.輸出
        System.out.println("plus five's answer: " + plus);
        System.out.println("minus five's answer: " + minus);
        System.out.println("times five's answer: " + times);
        System.out.println("divided five's answer: " + divided);
        System.out.println("divided five's remainder: " + single);
        //位數.輸出
        System.out.println("units digital is : " + unit);
        System.out.println("ten digital is: " + ten);
        System.out.println("hundred digital is : " + hundred);
        System.out.println("thousand digital is: " + thousand);
        System.out.println("ten thousand digital is: " + tenThousand);

	}

}
