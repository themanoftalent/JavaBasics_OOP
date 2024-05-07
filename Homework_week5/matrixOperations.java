/*burcinkutlusan*/
public class matrixOperations {
    public static void main(String[] args) {
        int[][] A = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matris A:");
        yazdir(A);
        System.out.println("\nMatris B:");
        yazdir(B);
        System.out.println("\nToplamı:");
        int[][] toplam = toplam(A, B);
        yazdir(toplam);
        System.out.println("\nÇarpımı:");
        int[][] carpim = carpim(A, B);
        yazdir(carpim);
    }
    public static int[][] toplam(int[][] A, int[][] B) {
        int a = A.length;
        int b = A[0].length;
        int[][] toplam = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                toplam[i][j] = A[i][j] + B[i][j];
            }
        }

        return toplam;
    }
    public static int[][] carpim(int[][] A, int[][] B) {
        int c = A.length;
        int d = A[0].length;
        int e = B[0].length;
        int[][] carpim = new int[c][d];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < e; j++) {
                for (int k = 0; k < d; k++) {
                    carpim[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return carpim;
    }
    public static void yazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

}
