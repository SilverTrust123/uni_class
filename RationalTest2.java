package B11221009;

public class RationalTest2 {
	

	public static void main(String[] args) {

		Rational1 r1 = new Rational1( 1, 2);
		System.out.println(r1.getNumerator()+ "/" + r1.getDoneminator());
		Rational1 r2 = new Rational1( 1, 3);
		System.out.println(r2.getNumerator() + "/" + r2.getDoneminator());
		Rational1 r3 = new Rational1( 1 , 1);
		r3.add(1, 1, 2, 3);
		System.out.print(r3.getcomnum() + "/" + r3.detcomden());

	}

}
