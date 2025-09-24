package B11221009;

import java.security.SecureRandom;

public class Rand {

	public static void main(String[] args) {
		numbers();
	}
	public static void numbers(){
        SecureRandom Random = new SecureRandom();
        int[]intarray = new int[100];
        for (int i = 0;i <100;i++){
            int probability = Random.nextInt(4)+1;
            int deta = 0;
            if(probability == 1){
                deta = Random.nextInt(11);
            }else{
                deta =-(Random.nextInt(10)+1);
            }
            intarray[i] = deta;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(intarray[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }  
}



