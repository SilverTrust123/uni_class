package B11221009;
import java.util.Scanner;

public class RationalTeat1  {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("輸入分子: ");
        int q = input.nextInt();
        System.out.println("輸入分母:");
        int p = input.nextInt();

        Rational r1 = new Rational(q, p);
        System.out.println("有理數是:"+r1);
        r1.reduce();
        System.out.print("化簡後是"+r1);
        
        input.close();


    }


}