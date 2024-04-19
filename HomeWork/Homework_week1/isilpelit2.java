// Zeynep Işıl Pelit 2311502220
// Basit Hesap Makinesi
import java.util.*;
public class isilpelit2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("İşlemi seçin (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc = 0;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası");
                    return;
                }
                break;
            default:
                System.out.println("Gecersiz islem");
                return;
        }

        System.out.println("Sonuc: " + sonuc);

        scanner.close();
    }
}

