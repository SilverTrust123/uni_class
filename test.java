package B11221009;import java.util.Scanner;




public class test {
    public static void main(String[] args) {
        

        for(int counter = 1;counter<8;counter++){
            if (counter % 3 == 2) {
                System.out.printf("%s", "1");
            } else if (counter % 3 == 1) {
                System.out.printf("%s", "x");
            } else if (counter % 3 == 0) {
                System.out.printf("%s", "o");
            }
          
        }
    }

}