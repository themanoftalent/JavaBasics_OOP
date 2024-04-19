// Zeynep Işıl Pelit 2311502220
// Çarpım Tablosu
import java.util.Scanner;

public class isilpelit8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        carpimTablosunuGoster(sayi);
    }

    public static void carpimTablosunuGoster(int sayi) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " x " + i + " = " + (sayi * i));
        }
    }
}
