package B11221009;
public class mymath {
	    public static int ceil(double number) {
	        return (int) Math.ceil(number);
	    }

	    public static boolean isPerfectNumber(int number) {
	        if (number <= 0) {
	            return false;
	        }

	        int divisorsSum = 0;
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                divisorsSum += i;
	            }
	        }

	        return divisorsSum == number;
	    }

	    public static int countPerfectNumber(int start, int end) {
	        int count = 0;
	        for (int num = start; num <= end; num++) {
	            if (isPerfectNumber(num)) {
	                count++;
	            }
	        }

	        return count;
	    }

}
