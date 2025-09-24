package B11221009;
import java.util.Scanner;

class Rational {
 private int numerator;
 private int denominator;

 public Rational(int num, int denom) {
     this.numerator = num;
     this.denominator = (denom != 0) ? denom : 1;
 }

 public void setNumerator(int num) {
     this.numerator = num;
 }

 public int getNumerator() {
     return numerator;
 }

 public void setDenominator(int denom) {
     this.denominator = (denom != 0) ? denom : 1;
 }

 public int getDenominator() {
     return denominator;
 }

 public void reduce() {
     int gcd = findGCD(numerator, denominator);
     numerator /= gcd;
     denominator /= gcd;
 }

 private int findGCD(int a, int b) {
     while (b != 0) {
         int temp = b;
         b = a % b;
         a = temp;
     }
     return a;
 }

 public String toString() {
     return "有理數是：" + numerator + "/" + denominator;
 }

 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("請輸入有理數的分子：");
     int q = input.nextInt();

     System.out.print("請輸入有理數的分母：");
     int p = input.nextInt();

     Rational r1 = new Rational(q, p);
     System.out.println(r1);

     r1.reduce();
     System.out.println("化簡後的" + r1);
     
     input.close();
 }
}


