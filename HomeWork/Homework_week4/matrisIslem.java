package ödev15;

import java.util.Scanner;

class matrisIslem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("İlk matrisin satır sayısını girin:");
        int m1Rows = scanner.nextInt();
        System.out.println("İlk matrisin sütun sayısını girin:");
        int m1Cols = scanner.nextInt();

        System.out.println("İkinci matrisin satır sayısını girin:");
        int m2Rows = scanner.nextInt();
        System.out.println("İkinci matrisin sütun sayısını girin:");
        int m2Cols = scanner.nextInt();

        int[][] matrix1 = new int[m1Rows][m1Cols];
        System.out.println("İlk matrisin elemanlarını girin:");
        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m1Cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int[][] matrix2 = new int[m2Rows][m2Cols];
        System.out.println("İkinci matrisin elemanlarını girin:");
        for (int i = 0; i < m2Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        if (m1Rows == m2Rows && m1Cols == m2Cols) {
            int[][] sumMatrix = addMatrices(matrix1, matrix2);
            System.out.println("Matrislerin toplamı:");
            printMatrix(sumMatrix);
        } else {
            System.out.println("Matrislerin boyutları uyumsuz. Toplama işlemi gerçekleştirilemez.");
        }

        if (m1Cols == m2Rows) {
            int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
            System.out.println("Matrislerin çarpımı:");
            printMatrix(productMatrix);
        } else {
            System.out.println("Matrislerin boyutları uyumsuz. Çarpma işlemi gerçekleştirilemez.");
        }

        scanner.close();
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int m1Rows = matrix1.length;
        int m1Cols = matrix1[0].length;
        int m2Cols = matrix2[0].length;
        int[][] productMatrix = new int[m1Rows][m2Cols];

        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                for (int k = 0; k < m1Cols; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return productMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
	}
   }
}
//Emiralp Yakalı