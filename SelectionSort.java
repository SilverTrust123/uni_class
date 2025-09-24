public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {61, 87, 80, 58, 40, 50, 20, 13, 71, 45};

        System.out.println("排序前:");
        printArray(data);

        selectionSort(data);

        System.out.println("\n排序後:");
        printArray(data);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int pass = 0; pass < n - 1; pass++) {
            int minIndex = pass;

            for (int i = pass + 1; i < n; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[pass];
            array[pass] = temp;

            System.out.print("\npass " + (pass + 1) + ": ");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + "  ");
        }
    }
}
