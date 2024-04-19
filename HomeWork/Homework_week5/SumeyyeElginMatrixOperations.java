package hafta5;

public class SumeyyeElginMatrixOperations {
    //Perform addition and multiplication of two matrices.
    public static void matrixMultiplication(int[][] matrix, int[][] matrix2) {
        int a = matrix[0].length; //ilk matrisin sütun sayısı
        int b = matrix.length; //ilk matrisin satır sayısı
        int c = matrix2[0].length; //ikinci matrisin sütun sayısı
        int d = matrix2.length; //ikinci matrisin satır sayısı

        if (a == d) {
            int[][] resultMatrix = new int[b][c];
            for (int i = 0; i < b; i++) { // İlk matrisin satırlarını dolaş
                for (int j = 0; j < c; j++) { // İkinci matrisin sütunlarını dolaş
                    for (int k = 0; k < a; k++) { // İlk matrisin sütunlarını ve ikinci matrisin satırlarını dolaş
                        // Her bir eleman için çarpım ve toplama işlemi
                        resultMatrix[i][j] += matrix[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("matrislerin çarpımının sonucu:");
            printMatrix(resultMatrix);

        } else {
            System.out.println("girdiğiniz matrislerin boyutları uygun olmadığından çarpım işlemi yapılamaz");
        }
    }


    public static void sumOfMatrix(int[][] matrix, int[][] matrix2) {
        int a = matrix[0].length; //ilk matrisin sütun sayısı
        int b = matrix.length; //ilk matrisin satır sayısı
        int c = matrix2[0].length; //ikinci matrisin sütun sayısı
        int d = matrix2.length; //ikinci matrisin satır sayısı

        if (a == c && b == d){
            int[][] resultMatrix = new int[b][c];
            for (int i = 0; i < b; i++) { // Matrisin satırlarını dolaş
                for (int j = 0; j < c; j++) { // Matrisin sütunlarını dolaş
                    // İki matrisin ilgili elemanlarını topla
                    resultMatrix[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

            System.out.println("matrislerin toplamının sonucu:");
            printMatrix(resultMatrix);

        } else {
            System.out.println("girdiğiniz matrislerin boyutları uygun olmadığından toplama işlemi yapılamaz");
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};

        sumOfMatrix(matrix, matrix2);

        System.out.println();

        int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix4 = {{7, 8}, {9, 10}, {11, 12}};

        matrixMultiplication(matrix3, matrix4);
    }
}
