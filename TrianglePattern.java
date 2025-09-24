public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 4; // 三角形的行数

        // 外层循环控制行数
        for (int i = 0; i < rows; i++) {

            // 内层循环控制每一行中的空格
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // 内层循环控制每一行中的星号
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

 
        }
    }
}
