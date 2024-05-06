// iki dosyadan oluşan bir Java programı örneği. Bu program, dört temel aritmetik işlemi yapar: toplama, çıkarma, çarpma ve bölme.
import java.util.InputMismatchException;
import java.util.Scanner;

public class HesapMak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("İşlem seçin:");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");

            int choice = scanner.nextInt();

            System.out.print("İlk sayıyı girin: ");
            double num1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı girin: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        throw new ArithmeticException("Bölme işlemi geçersiz! İkinci sayı sıfır olamaz.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    return;
            }

            System.out.println("Sonuç: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Hata: Geçersiz giriş. Lütfen bir sayı girin.");
        } catch (ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
