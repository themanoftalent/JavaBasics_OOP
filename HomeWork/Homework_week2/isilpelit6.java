// Zeynep Işıl Pelit 2311502220
// palindrom
import java.util.Scanner;

public class isilpelit6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }

    public static boolean isPalindrom(int sayi) {
        String sayiStr = String.valueOf(sayi);
        int uzunluk = sayiStr.length();

        // Baştan ve sondan başlayarak karşılaştırma
        for (int i = 0; i < uzunluk / 2; i++) {
            if (sayiStr.charAt(i) != sayiStr.charAt(uzunluk - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
