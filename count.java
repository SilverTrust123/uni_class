package B11221009;

public class count {

	public static void main(String[] args) {
		
		int x = 10;
		int y = ++x;
		int z = (y+x!=20)?10:15;
		int w = (y==z--)?10:15;
		System.out.printf("%d %d %d %d\n", x, y, z, w);	
		System.out.println(x>=y  &&  w>=z);
		System.out.println(!(x!=y)  ||  !(x>y));
		System.out.println(x>y  ^  w>z);	
		System.out.println(x++ == ++y  &  z-- == --w);
		System.out.printf("%d %d %d %d\n", x, y, z, w);


	}

}
