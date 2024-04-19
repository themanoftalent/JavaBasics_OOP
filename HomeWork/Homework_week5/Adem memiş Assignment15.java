import java.util.*;
//2311502230 Adem memiş
public class Ders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci matrisin satır sayısını giriniz: ");
        int satir1 = scan.nextInt();
        System.out.println("Birinci matrisin sütun sayısını giriniz: ");
        int sütün1 = scan.nextInt();
        System.out.println("İkinci matrisin satır sayısını giriniz: ");
        int satir2 = scan.nextInt();
        System.out.println("İkinci matrisin sütun sayısını giriniz: ");
        int sütün2 = scan.nextInt();

        int[][] matris1 = new int[satir1][sütün1];
        int[][] matris2 = new int[satir2][sütün2];
        int[][] toplam = new int[satir1][sütün2];

        for(int i=0; i<satir1;i++){
            if((satir1 != satir2) || (sütün1 != sütün2)){
                System.out.println("Yanlış işlem");
                break;
            }
            for(int j=0 ; j<sütün1; j++){
                System.out.println("Birinci matrisin elemanını giriniz: ");
                int eleman1 = scan.nextInt();
                matris1[i][j] = eleman1;
                System.out.println("İkinci matrisin elemanını giriniz: ");
                int eleman2 = scan.nextInt();
                matris2[i][j] = eleman2;
                toplam[i][j] = matris1[i][j] + matris2[i][j];
            }
        }
            for(int i = 0; i<sütün1;i++){
                System.out.println(Arrays.toString(toplam[i]));
            }
    }
}
