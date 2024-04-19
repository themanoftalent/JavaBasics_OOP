//2311502230 Adem Memiş
import java.util.*;
public class Ders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin eleman sayisini giriniz:");
        int sayi = scan.nextInt();
        int[] dizi = new int[sayi];

        for(int i=0;i<sayi;i++){
            System.out.print((i+1)+". eleman:");
            int eleman = scan.nextInt();
            dizi[i] = eleman;
        }
        int enbuyuk;
        for(int i=0;i<sayi;i++){
            for(int j=1;j<sayi;j++){
                if(dizi[j]>dizi[j-1]){
                    enbuyuk = dizi[j];
                    dizi[j] = dizi[j-1];
                    dizi[j-1] = enbuyuk;
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
    }
}
