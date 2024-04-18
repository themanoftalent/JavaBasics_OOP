import java.util.Arrays;

public class GurhanK_week5_MatrixOperations {

    public static void main(String[] args) {
        // İlk matris
        int[][] matris1 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        // İkinci matris
        int[][] matris2 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        System.out.println("Matris 1: ");
        matrisiYazdir(matris1);
        System.out.println("Matris 2: ");
        matrisiYazdir(matris2);

        // Matris toplama işlemi
        int[][] toplamMatris = matrisTopla(matris1, matris2);
        System.out.println("Matris Toplamı:");
        matrisiYazdir(toplamMatris);

        // Matris çarpma işlemi
        int[][] carpimMatris = matrisCarp(matris1, matris2);
        System.out.println("Matris Çarpımı:");
        matrisiYazdir(carpimMatris);

    }

    // İki matrisi toplayan metot
    public static int[][] matrisTopla(int[][] matris1, int[][] matris2) {
        int satirSayisi = matris1.length;
        int sutunSayisi = matris1[0].length;
        int[][] toplamMatris = new int[satirSayisi][sutunSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                toplamMatris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        return toplamMatris;
    }

    // İki matrisi çarpan metot
    public static int[][] matrisCarp(int[][] matris1, int[][] matris2) {
        int satirSayisi1 = matris1.length;
        int sutunSayisi1 = matris1[0].length;
        int sutunSayisi2 = matris2[0].length;
        int[][] carpimMatris = new int[satirSayisi1][sutunSayisi2];

        for (int i = 0; i < satirSayisi1; i++) {
            for (int j = 0; j < sutunSayisi2; j++) {
                for (int k = 0; k < sutunSayisi1; k++) {
                    carpimMatris[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }

        return carpimMatris;
    }

    // Matrisi ekrana yazdıran metot
    public static void matrisiYazdir(int[][] matris) {
        for (int[] row : matris) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(); // Satır araları için boş satır yazdırma
    }
}
