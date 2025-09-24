import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            for (int k = 0; k < i + 1; k++) {
                row.add(1);
            }

            for (int j = 1; j < i; j++) {
                int sum = sum(result.get(i - 1).subList(0, j + 1));
                row.set(j, sum);

                if (j == i - 1) {
                    row.set(j + 1, row.get(j));
                }
            }

            result.add(row);
        }

        return result;
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> arr = generate(n);

        for (List<Integer> row : arr) {
            for (int element : row) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }
}
