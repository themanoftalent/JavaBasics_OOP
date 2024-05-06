import java.util.InputMismatchException;
import java.util.Scanner;

public class OnurMustafaUzmanDortIslem {

    public void Operations() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("İşlem seçiniz: ");
            System.out.println("1. Toplama İşlemi");
            System.out.println("2. Çıkarma İşlemi");
            System.out.println("3. Çarpma İşlemi");
            System.out.println("4. Bölme İşlemi");

            int choice = scanner.nextInt();
            System.out.println("1.sayıyı giriniz:");
            int num1 = scanner.nextInt();

            System.out.println("2.sayıyı giriniz: ");
            int num2 = scanner.nextInt();

            double sonuc = 0;

            switch (choice) {
                case 1:
                    sonuc = num1 + num2;
                    System.out.println(sonuc);
                    break;

                case 2:
                    sonuc = num1 - num2;
                    System.out.println(sonuc);
                    break;

                case 3:
                    sonuc = num1 * num2;
                    System.out.println(sonuc);
                    break;

                case 4:
                    if (num2 != 0) {
                        sonuc = num1 / num2;
                        System.out.println(sonuc);
                        break;
                    } else {
                        throw new ArithmeticException("İşlem geçersiz.");
                    }
            }

        } catch (InputMismatchException e) {
            System.out.println("Geçersiz bir input girdiniz.");
        } catch (ArithmeticException e) {
            System.out.println("Sıfıra bölme hatası!");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        OnurMustafaUzmanDortIslem HesapMak = new OnurMustafaUzmanDortIslem();
        HesapMak.Operations();
    }
}
