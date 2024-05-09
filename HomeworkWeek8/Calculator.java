import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public void Operations() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("işlem seçin:");
            System.out.println("1. toplama");
            System.out.println("2. çıkarma");
            System.out.println("3. çarpma");
            System.out.println("4. bölme");

            int choice = scanner.nextInt();

            System.out.print("Birinci sayiyi giriniz: ");
            double num1 = scanner.nextDouble();

            System.out.print("ikinci sayiyi giriniz: ");
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
                        throw new ArithmeticException("0'a bölünme hatasi.");
                    }
                    break;
                default:
                    System.out.println("hatali seçim yaptiniz!");
                    return;
            }

            System.out.println("sonuç: " + result);
        } catch (InputMismatchException e) {
            System.out.println("hata gecersiz giriş lutfen bir sayi giriniz");
        } catch (ArithmeticException e) {
            System.out.println("hata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
