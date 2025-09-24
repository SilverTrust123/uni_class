public class count1 {
    public static void main(String[]args){
            int x = 8;
int y = x++;
int z = (y+x!=17)?11:10;
int w = (y==--z)?11:10;
System.out.printf("%d %d %d %d\n", x, y, z, w);	
System.out.println(x>=y  &&  w>=z);
System.out.println(!(x!=y)  ||  !(x>y));
System.out.println((w+z)>=y  &&  (w>=z || x>=7));
System.out.println(y+w==x+z  ^  y-x==w-z);
System.out.println(x>y ^ w>z);	
System.out.println(x<=z+1 || ++x-y++<=w--*--z%--y);
System.out.println(y>z  &&  x--+y--+z--+w-->0);
System.out.println(x++ == ++y  &  z-- == --w);
System.out.printf("%d %d %d %d\n", x, y, z, w);

    }


    }
