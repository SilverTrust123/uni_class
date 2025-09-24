import java.util.Scanner;
public class RationalTest  {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        System.out.println("輸入分子: ");
        int q = input.nextInt();
        System.out.println("輸入分母:");
        int p = input.nextInt();
        

        Rational r1 = new Rational(q, p);
        System.out.println("有理數是:"+r1);
    }


}