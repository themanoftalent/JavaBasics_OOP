// Zeynep Işıl Pelit 2311502220
//Asal mı Değil mi
import java.util.Scanner;

public class isilpelit9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int bolenSayisi = 0;

        if (sayi <= 1) {
            System.out.println(sayi + " bir asal sayı değildir.");
        } else {
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    bolenSayisi++;
                    break;
                }
            }

            if (bolenSayisi == 0) {
                System.out.println(sayi + " bir asal sayıdır.");
            } else {
                System.out.println(sayi + " bir asal sayı değildir.");
            }
        }

        scanner.close();
    }
}
