import java.util.Scanner;

public class GurhanK_islem_util {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("Toplam Sonuc: "+(sayi1+sayi2));
        System.out.println("Çıkarma Sonuc: "+(sayi1-sayi2));
        System.out.println("Çarpma Sonuc: "+(sayi1*sayi2));
        System.out.println("Bolme Sonuc: "+(sayi1/sayi2));
        System.out.println("Bolumden kalan: "+(sayi1%sayi2));
    }
}
