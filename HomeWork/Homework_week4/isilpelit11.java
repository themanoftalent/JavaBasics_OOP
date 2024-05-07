// Zeynep Işıl Pelit 2311502220
// dizinin ortalaması
import java.util.Scanner;

public class isilpelit11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int[] dizi = new int[elemanSayisi];

        System.out.println("elemanlarını girin:");

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        int toplam = 0;
        for (int i = 0; i < elemanSayisi; i++) {
            toplam += dizi[i];
        }

        double ortalama = (double) toplam / elemanSayisi;

        System.out.println("Dizi elemanlarının toplamı: " + toplam);
        System.out.println("Dizi elemanlarının ortalaması: " + ortalama);

        scanner.close();
    }
}
