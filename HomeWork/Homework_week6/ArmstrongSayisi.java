import java.util.Scanner;

public class ArmstrongSayisi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = oku.nextInt();

        int gecici = sayi;
        int basamakSayisi = String.valueOf(sayi).length();
        int toplam = 0;

        while (gecici > 0) {
            int basamakDegeri = gecici % 10;
            toplam += Math.pow(basamakDegeri, basamakSayisi);
            gecici /= 10;
        }

        if (sayi == toplam) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }
    }
}