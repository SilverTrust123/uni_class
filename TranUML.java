package B11221009;

public class TranUML {
    public static void main(String[] args) {
        int counter = 1;

        while (counter < 8) {
            if (counter % 3 == 2) {
                System.out.printf("%s", "1");
            } else if (counter % 3 == 1) {
                System.out.printf("%s", "x");
            } else if (counter % 3 == 0) {
                System.out.printf("%s", "o");
            }
            counter++;
        }
    }
}
