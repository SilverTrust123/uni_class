package B11221009;

import java.util.Scanner;


	public class EasyCardTest {
	    public static void main(String[] args) {
	
	        Scanner input = new Scanner(System.in);

	        EasyCard myCard = new EasyCard();
	        myCard.setbalance(0);

	        System.out.print("Please enter how much number you want to deposit : ");
	        int num = input.nextInt();
	        if(num>  0) {
	        int newValue = myCard.add(num);
	        System.out.println("Balance：" + newValue + " dollars");
	        }else {
	        	System.out.println("error");
	        }

	        input.close();
	    }
	}



