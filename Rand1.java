import java.security.SecureRandom;
public class Rand1{
    int[] intArray;

    public Rand(){
        SecureRandom rand = new SecureRandom();
        intArray = new int[100];
        for (int counter = 0;counter < intArray.length;counter++){
            int x = rand.nextInt(6);
            if (x < 5){
                intArray[counter] = 1+rand.nextInt(500)*2;
            }else{
                intArray[counter] = 2+rand.nextInt(500)*2;
            }
        }
    }
    public int[] getMax(){
        int max = intArray[0];

        for(int counter = 1; counter < intArray.length;counter++){
            if (intArray[counter]> max) {
                max = intArray[counter];
            }
            return max;
        }
    }
    public void printArray(){
        for(int counter = 1;counter<intArray.length;counter++){
            System.out.print("%5d",intArray[counter]);
            if ((counter + 1)%10 == 0) {
                System.out.println( );
            }
        }
    }
    public void selectionSort() {
        for (int i = 0; i < intArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = intArray[minIndex];
            intArray[minIndex] = intArray[i];
            intArray[i] = temp;
        }
    }
}