import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.println("Birinci sayıyı giriniz:");
        int sayi1 = scanner.nextInt();

        // Prompt user for second number
        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = scanner.nextInt();

        // Calculate sum
        int toplam = sayi1 + sayi2;

        // Print the sum
        System.out.println("Toplam: " + toplam);

        // You can perform other calculations here similarly
        int cikarma = sayi1 - sayi2;
        System.out.println("Çıkarma: " + cikarma);

        // Close the scanner to avoid resource leaks (optional but good practice)
        scanner.close();
    }
}
