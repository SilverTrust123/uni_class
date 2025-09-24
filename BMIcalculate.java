package B11221009;

import java.util.Scanner;

public class BMIcalculate {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);//
        
        System.out.println("Welcome to the body mass index (BMI) calculator");
        
        System.out.print("Enter your weight（kg）: ");//體重
        
        int weight = scanner.nextInt();
        
        System.out.print("Enter your height（cm）: ");//身高
        
        int high = scanner.nextInt();
        
        scanner.close();
        
        int bmi = (weight * 10000) / (high * high);//BMI運算
        
        System.out.printf("%s%n%s%n","Your BMI is: " + bmi," ");//輸出
             
        System.out.println("BMI VALUES");//參考值
        
        System.out.printf("%s%n%s%n%s%n%s%n", "Underweight: less than 18.5","Normal:      between 18.5 and 24.9","Overweight:  between 25 and 29.9","Obese:       30 or greater");
        
     }

}


