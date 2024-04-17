package hesapmakinesi;
import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bir islem seçiniz:");
            System.out.println("1 - Toplama");
            System.out.println("2 - Cıkarma");
            System.out.println("3 - Carpma");
            System.out.println("4 - Bölme");
            System.out.println("5 - Cıkıs");

            int secim = scanner.nextInt();

            if (secim == 5) {
                System.out.println("Hesap makinesinden ciktiniz");
                break;
            }

            System.out.println("İlk sayıyı giriniz:");
            double sayi1 = scanner.nextDouble();
            System.out.println("İkinci sayıyı giriniz:");
            double sayi2 = scanner.nextDouble();

            switch (secim) {
                case 1:
                    System.out.println("Sonuc: " + (sayi1 + sayi2));
                    break;
                case 2:
                    System.out.println("Sonuc: " + (sayi1 - sayi2));
                    break;
                case 3:
                    System.out.println("Sonuc: " + (sayi1 * sayi2));
                    break;
                case 4:
                    if (sayi2 != 0) {
                        System.out.println("Sonuc: " + (sayi1 / sayi2));
                    } else {
                        System.out.println("Bir sayı sıfıra bölünemez!");
                    }
                    break;
                default:
                    System.out.println("Gecersiz islem secimi!");
            }
        }
        scanner.close();
    }
}