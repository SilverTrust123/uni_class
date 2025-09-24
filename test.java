import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 2, 4, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
