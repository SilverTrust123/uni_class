package B11221009;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter width: ");
		int w = input.nextInt();
		System.out.print("Please enter heigh: ");
		int h = input.nextInt();
		Rectangle rec = new Rectangle( w , h );
		System.out.printf("The width is %d and the heigh is %d%n",w,h);
		System.out.printf("The area of the rectangle is %d%n",rec.getArea());
		System.out.printf("The perimeter of the rectangle is %d%n",rec.getPerimeter());
		if(rec.isSqure()) {
			System.out.print("The rectangle is  a square");
		}else {
			System.out.print("The rectangle is not a square");
		}
		input.close();
	}

}
