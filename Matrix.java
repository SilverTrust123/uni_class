import java.util.Random;
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = getRandomMatrix();
        System.out.println("Random Matrix:");
        displayMatrix(matrix);       
        int[][] transposedMatrix = transpose(matrix);
        System.out.println("\nTransposed Matrix:");
        displayMatrix(transposedMatrix);
    } 
    public static int[][] getRandomMatrix() {
        Random rand = new Random();
        int rows = rand.nextInt(6) + 5; 
        int cols = rand.nextInt(6) + 5; 
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(21) - 10; 
            }
        }
        return matrix;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%5d", num);
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        } 
        return transposedMatrix;
    }
}
