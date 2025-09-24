public class MatrixTest {
     public static void main(String[] args) {
        int[][] matrix = Matrix.getRandomMatrix();
        System.out.println("Original Matrix:");
        Matrix.displayMatrix(matrix);
        int[][] transposedMatrix = Matrix.transpose(matrix);
        System.out.println("\nTransposed Matrix:");
        Matrix.displayMatrix(transposedMatrix);
        if (isSquareMatrix(matrix)) {
            int trace = calculateTrace(matrix);
            System.out.println("\nTrace of the matrix: " + trace);
        } else {
            System.out.println("\nMatrix is not a square matrix. Cannot calculate trace.");
        }
    }
    public static boolean isSquareMatrix(int[][] matrix) {
        return matrix.length == matrix[0].length;
    }
    public static int calculateTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }
}
