import java.util.Scanner;

public class NgHomework15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci matrisin boyutlarını girin:");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();

        System.out.println("İkinci matrisin boyutlarını girin:");
        int m2 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (m1 != m2 || n1 != n2) {
            System.out.println("Matrislerin boyutları eşit değil, toplam işlemi yapılamaz.");
            return;
        }
        System.out.println("Birinci matrisi girin:");
        int[][] matrix1 = readMatrix(scanner, m1, n1);

        System.out.println("İkinci matrisi girin:");
        int[][] matrix2 = readMatrix(scanner, m2, n2);


        int[][] sum = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrislerin toplamı:");
        printMatrix(sum);
    }


    public static int[][] readMatrix(Scanner scanner, int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
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



