package B11221009;

import java.util.Scanner;

public class ThreeNumberCalculate {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("frist: ");
        int num1 = scanner.nextInt();

        System.out.print("sec: ");
        int num2 = scanner.nextInt();

        System.out.print("thr: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        double average = sum / 3 ;
        int product = num1 * num2 * num3;

        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;

        int min = num1;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;

        System.out.println("sum: " + sum);
        System.out.println("average: " + average);
        System.out.println("times: " + product);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        
        scanner.close();

	}

}
