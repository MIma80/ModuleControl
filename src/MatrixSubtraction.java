import java.util.Random;
public class MatrixSubtraction {
    public static double[][] generateRandomMatrix(int n, int m) {
        double[][] matrix = new double[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (double) Math.round(random.nextDouble(100) * 100) /100;
            }
        }
        return matrix;
    }
    public static void subtractNumberFromMatrix(double[][] matrix, double number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] -= number;
                matrix[i][j] = (double) Math.round(matrix[i][j] * 100) /100;
            }
        }
    }
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
