import java.util.Scanner;

public class Odev18p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyelini hesaplamak istediğiniz pozitif bir sayıyı girin: ");
        int number = scanner.nextInt();

        if (number < 0) {
            while (true){
                if (Math.abs(number) == number){
                    System.out.println("Sayınız pozitif.Devam ediliyor...");
                    break;
                }
                else {
                    System.out.println("Negatif bir sayı girdiniz.Lütfen pozitif bir sayı giriniz:");
                    number = scanner.nextInt();
                }
            }
        }
        long factorial = calculateFactorial(number);
        System.out.println(number + "! = " + factorial);


        scanner.close();
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
