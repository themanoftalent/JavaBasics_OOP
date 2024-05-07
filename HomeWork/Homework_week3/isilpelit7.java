// Zeynep Işıl Pelit 2311502220
//Rakam Toplamı
import java.util.Scanner;

public class isilpelit7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int rakamToplami = rakamlariTopla(sayi);

        System.out.println("Girilen sayının rakamları toplamı: " + rakamToplami);
    }
    public static int rakamlariTopla(int sayi) {
        int toplam = 0;

        while (sayi != 0) {
            int rakam = sayi % 10;
            toplam += rakam;
            sayi /= 10;
        }

        return toplam;
    }
}
