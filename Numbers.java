package B11221009;
import java.util.Scanner;



	public class Numbers {
	    private int stopNumber;
	    private int count;
	    private int even;
	    private int odd;
	    private int total;

	    public Numbers(int s) {
	        stopNumber = s;
	    }

	    public int inputNumbers() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("請輸入整數 或 " + stopNumber + " 代表結束:");
	            int input = scanner.nextInt();

	            if (input == stopNumber) {
	                break;
	            }

	            count++;
	            total += input;

	            if (input % 2 == 0) {
	                even++;
	            } else {
	                odd++;
	            }
	        }

	        scanner.close();
	        return count;
	    }

	    public void displayNumbers() {
	        if (count == 0) {
	            System.out.println("沒有任何整數輸入!");
	        } else {
	            double average = (double) total / count;
	            System.out.println("共輸入" + count + "筆整數");
	            System.out.println("偶數有" + even + "筆");
	            System.out.println("奇數有" + odd + "筆");
	            System.out.printf("平均值為: %.2f\n", average);
	        }
	    }
	}



