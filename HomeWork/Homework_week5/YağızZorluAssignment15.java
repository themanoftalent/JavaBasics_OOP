package Assignments;

public class YağızZorluAssignment15 {
    public static void main(String[] args) {
        int[][] matris1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matris2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        System.out.println("Toplam matris:");
        int[][] matrisToplami = matrisTopla(matris1, matris2);
        matrisYazdirma(matrisToplami);
    }
    public static int[][] matrisTopla(int[][] matris1, int[][] matris2) {
        int satirlar = matris1.length;
        int sütunlar = matris1[0].length;
        int[][] matrisToplami = new int[satirlar][sütunlar];

        for (int i = 0; i < satirlar; i++) {
            for (int j = 0; j < sütunlar; j++) {
                matrisToplami[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        return matrisToplami;
    }
    public static void matrisYazdirma(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}



