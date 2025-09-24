import java.security.SecureRandom;

public class ran {
    public static void main(String[] args) {
        SecureRandom r = new SecureRandom();

        int randomIntInRangeA = r.nextInt(21) - 10;
        System.out.println("(a) Random Integer in the range -10 to 10: " + randomIntInRangeA);

        int lowerBoundB = 2;
        int upperBoundB = 50;  // (100-2)/2
        int randomEvenNumberB = 2 * r.nextInt(upperBoundB + 1) + lowerBoundB;
        System.out.println("(b) Random Even Number between 2 and 100: " + randomEvenNumberB);

        int randomOptionC = (r.nextInt(6) + 1) * 7;
        System.out.println("(c) Random Element from the options: " + randomOptionC);

        int randomOptionD;
        do {
            randomOptionD = r.nextInt(19) + 11;
        } while (!isPrime(randomOptionD));
        System.out.println("(d) Random Prime Number from the options: " + randomOptionD);
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
