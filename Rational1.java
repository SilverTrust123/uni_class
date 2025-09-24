package B11221009;
public class Rational1 {
	public int numerator;//分子
    public int denominator;//分母

    public Rational1(int num,int denom){
        this. numerator = num;//分子
        this. denominator = (denom!=0)? denom:1 ;//分母
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
    public int comnum;
    public int comden;
    
    public void add(int num1, int num2, int den1, int den2) {
        comnum = (num1 * den2) + (num2 * den1);
        comden = den1 * den2;
        reduce();
    }
    public int getcomnum() {
    	return comnum;
    }
    public int detcomden() {
    	return comden;
    }
    
}
