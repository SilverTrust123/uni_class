
import java.util.scammer;
public class Rational {

    public int numerator;//分子
    public int denominator;//分母

    public Rational(int num,int denom){
        int numerator = num;//分子
        int denominator = (denom!=0)? denom:1 ;//分母
    }
    public void setNumerator(int num){
        this.numerator = num;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int denom){
        if(denom!=0){  
        this.denominator = denom; 
        }else{
            this.denominator = 1;
        }
    }
    public int getDoneminator(){
        return denominator;
    }
    public void reduce(){
        int gcd = findGCD(numerator,denominator);
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int add(int num1, int num2, int den1, int den2) {
        int comnum = (getNumerator(num1)*getDoneminator(den2))+(getNumerator(num2)*getDoneminator(den1));
        int comden = (getDoneminator(den1)*getDoneminator(den2));
        reduce(comnum,comden);
        return(this.comnum );
        return(this.comden);

    }



}


