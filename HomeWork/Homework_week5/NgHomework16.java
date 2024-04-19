import java.util.Scanner;

public class NgHomework16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int orijinalSayi= sayi;
        int n = 0;
        int sonuc = 0;


        while (orijinalSayi != 0) {
            orijinalSayi /= 10;
            ++n;
        }

        orijinalSayi = sayi;


        while (orijinalSayi != 0) {
            int remainder = orijinalSayi % 10;
            sonuc += Math.pow(remainder, n);
            orijinalSayi /= 10;
        }


        if (sonuc == sayi) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }
    }
}

