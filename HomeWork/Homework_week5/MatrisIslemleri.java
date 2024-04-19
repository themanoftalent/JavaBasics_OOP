import java.util.Scanner;

public class MatrisIslemleri {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

      
        System.out.print("İlk matrisin satır sayısını girin: ");
        int satir1 = oku.nextInt();
        System.out.print("İlk matrisin sütun sayısını girin: ");
        int sutun1 = oku.nextInt();

       
        System.out.print("İkinci matrisin satır sayısını girin: ");
        int satir2 = oku.nextInt();
        System.out.print("İkinci matrisin sütun sayısını girin: ");
        int sutun2 = oku.nextInt();

        
        int[][] matris1 = new int[satir1][sutun1];
        System.out.println("İlk matrisin elemanlarını girin:");
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun1; j++) {
                matris1[i][j] = oku.nextInt();
            }
        }

         int[][] matris2 = new int[satir2][sutun2];
        System.out.println("İkinci matrisin elemanlarını girin:");
        for (int i = 0; i < satir2; i++) {
            for (int j = 0; j < sutun2; j++) {
                matris2[i][j] = oku.nextInt();
            }
        }

        // İki matrisi topla
        if (satir1 == satir2 && sutun1 == sutun2) {
            System.out.println("Matris toplamı:");
            for (int i = 0; i < satir1; i++) {
                for (int j = 0; j < sutun1; j++) {
                    System.out.print(matris1[i][j] + matris2[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrislerin boyutları uyumsuz, toplama işlemi yapılamaz.");
        }

        if (sutun1 == satir2) {
            System.out.println("Matris çarpımı:");
            int[][] carpimMatrisi = new int[satir1][sutun2];
            for (int i = 0; i < satir1; i++) {
                for (int j = 0; j < sutun2; j++) {
                    for (int k = 0; k < sutun1; k++) {
                        carpimMatrisi[i][j] += matris1[i][k] * matris2[k][j];
                    }
                    System.out.print(carpimMatrisi[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("İlk matrisin sütun sayısı ile ikinci matrisin satır sayısı uyumsuz, çarpma işlemi yapılamaz.");
        }
    }
}