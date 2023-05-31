import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        var rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        var columns = scanner.nextInt();

        var matrix = MatrixSubtraction.generateRandomMatrix(rows, columns);
        System.out.println("Random generated matrix:");
        MatrixSubtraction.printMatrix(matrix);

        var random = new Random();
        var randomNumber = (double) Math.round(random.nextDouble(100) * 100)/100;
        System.out.println("Matrix after subtraction of " + randomNumber);
        MatrixSubtraction.subtractNumberFromMatrix(matrix, randomNumber);
        MatrixSubtraction.printMatrix(matrix);
    }
}