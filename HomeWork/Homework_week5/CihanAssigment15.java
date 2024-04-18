//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;

public class CihanAssigment15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows in the first matrix:");
        int rows1 = scanner.nextInt();
        System.out.println("Number of columns in the first matrix:");
        int cols1 = scanner.nextInt();
        System.out.println("Elements of the first matrix:");
        int[][] matrix1 = readMatrix(rows1, cols1, scanner);
        System.out.println("Number of rows in the second matrix:");
        int rows2 = scanner.nextInt();
        System.out.println("Number of columns in the second matrix:");
        int cols2 = scanner.nextInt();
        System.out.println("Elements of the second matrix:");
        int[][] matrix2 = readMatrix(rows2, cols2, scanner);
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] sumMatrix = addMatrices(matrix1, matrix2);
            System.out.println("Sum of the matrices:");
            printMatrix(sumMatrix);
        } else {
            System.out.println("Matrices cannot be added. They must have the same dimensions.");
        }
        if (cols1 == rows2) {
            int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
            System.out.println("Product of the matrices:");
            printMatrix(productMatrix);
        } else {
            System.out.println("Matrices cannot be multiplied. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        }
    }
    public static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
