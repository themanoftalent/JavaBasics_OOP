package ödev2;
import java.util.Scanner;
public class hesapmakinesi {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı girin:");
        double num1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı girin:");
        double num2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin: ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int operation = scanner.nextInt();

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
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
                    System.out.println("Hata: Sıfıra bölme!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Sonuç: " + result);
        }

        scanner.close();
    }