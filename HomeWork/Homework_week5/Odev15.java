import java.util.Scanner;
public class Odev15 {
    public static void main(String[] args) {
        System.out.println("Satır ve sütün sayılarını tek tek girin");
        int satır,sütun,satır2,sütun2;
        Scanner getsayi = new Scanner(System.in);
        satır = getsayi.nextInt();
        sütun = getsayi.nextInt();
        int[][] matrisimiz = new int[satır][sütun];
        for (int i = 0;i < satır;i++){
            for (int j = 0 ;j < sütun;j++){
                matrisimiz[i][j] = getsayi.nextInt();
            }
        }
        System.out.println("Matrisimiz =");
        for (int i = 0;i < satır;i++){
            for (int j = 0 ;j < sütun;j++){
                System.out.print(matrisimiz[i][j]+ "  ");

            }
            System.out.println("\n");
        }
        System.out.println("2. Matrisin Satır ve sütün sayılarını tek tek girin");
        satır2 = getsayi.nextInt();
        sütun2 = getsayi.nextInt();
        int[][] matrisimiz2 = new int[satır2][sütun2];
        for (int i = 0;i < satır2;i++){
            for (int j = 0 ;j < sütun2;j++){
                matrisimiz2[i][j] = getsayi.nextInt();
            }
        }
        System.out.println("2.Matrisimiz =");

        for (int i = 0;i < satır2;i++) {
            for (int j = 0; j < sütun2; j++) {
                System.out.print(matrisimiz2[i][j] + "  ");

            }
            System.out.println("\n");
        }

        int[][] carpımınmatrisi = new int[satır][sütun2];

        for (int i =0 ; i<satır ;i++){
            for (int j = 0;j<sütun2;j++){
                for (int m = 0 ;m < satır2; m++){
                    carpımınmatrisi[i][j] += matrisimiz[i][m]* matrisimiz2[m][j];
                }
            }
        }
        System.out.println("Çarpım Matrisimiz =");

        for (int i = 0;i < satır;i++) {
            for (int j = 0; j < sütun2; j++) {
                System.out.print(carpımınmatrisi[i][j] + "  ");

            }
            System.out.println("\n");
        }

    }
}
