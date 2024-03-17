import java.util.Scanner;

public class ScannerSumeyyeElgin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.print("birinci sayıyı girinz: ");
        num1 = scan.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        num2 = scan.nextInt();

        int sum = num1 + num2;
        int divide = num1 / num2;
        int multiplication = num1 * num2;
        int extraction = num1 - num2;
        int mod = num1 % num2;

        System.out.println("girdiğiniz " + num1 + " ve " + num2 + " sayılarıyla yaptığımız işlemler:");
        System.out.println("\t*çarpma sonucu: " + multiplication);
        System.out.println("\t*toplama sonucu: "+ sum);
        System.out.println("\t*bölme sonucu: " + divide);
        System.out.println("\t*çıkarma sonucu: " + extraction);
        System.out.println("\t*mod sonucu: " + mod);

    }
}
