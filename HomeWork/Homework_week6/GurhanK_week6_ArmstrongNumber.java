import java.util.Scanner;

public class GurhanK_week6_ArmstrongNumber {
    // Armstrong sayisi basamaklarda bulunan sayıların üzerine basamak sayısı kadar üzeri alınıp toplanmasıdır.
    //Örnek 1634 = 1^4 + 6^4 + 3^4 + 4^4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (armstrongSayisiKontrol(sayi)) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }

        scanner.close();
    }

    // Bir sayının Armstrong sayısı olup olmadığını kontrol eden metod
    public static boolean armstrongSayisiKontrol(int sayi) {
        int basamakSayisi = sayiBasamakSayisi(sayi);
        int gecici = sayi;
        int toplam = 0;

        while (gecici > 0) {
            int basamak = gecici % 10;  // Basamaktaki sayıları bulur 1 lerden başlar
            toplam += Math.pow(basamak, basamakSayisi); // basmaktaki sayıyı basmak sayısıyla çarpar
            gecici /= 10;
        }

        return (toplam == sayi);
    }

    // Bir sayının basamak sayısını hesaplayan yardımcı metod
    public static int sayiBasamakSayisi(int sayi) {
        int basamakSayisi = 0;
        int gecici = sayi;

        while (gecici > 0) {
            basamakSayisi++;
            gecici /= 10;
        }

        return basamakSayisi;
    }
}
