package B11221009;

public class Calculatenumber {

	public static void main(String[] args) {

		int x = 10;
		int y = 20; 
		int z = 30; 
		int a =y/x*24%z; 
		int b = 58%z-y*5%z; 
		int c=z+10-y/5;
		a=a+ 2;
		b=b*b- 15*a;
		z=x=c;
		
		System.out.printf("a = %d\n", a);
		System.out.printf("b = %d\n", b); 
		System.out.printf("c = %d\n", c); 
		System.out.printf("Condition1 is %s!\n", a!=c );
		System.out.printf("Condition2 is %s!\n", b>=z);

	}

}
