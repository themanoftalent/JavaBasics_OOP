import java.util.Scanner;
public class LinearSearch {
    public static int DoğrusalArama(int dizi[], int aranan) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int dizi[]= { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Aramak istediğiniz sayıyı giriniz");
        int aranan = hafıza.nextInt();
        int sıra = DoğrusalArama(dizi, aranan);
        if (sıra == 0) {
            System.out.println("Öge bulunamadı.");
        } else {
            sıra=sıra+1;
            System.out.println("Öge bulundu: " + sıra +". öge");
        }
    }
}
