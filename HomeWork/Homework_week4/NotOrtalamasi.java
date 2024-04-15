import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int not1, not2, not3, not4, not5;

        System.out.println("Lütfen 5 notu girin:");
        not1 = scanner.nextInt();
        not2 = scanner.nextInt();
        not3 = scanner.nextInt();
        not4 = scanner.nextInt();
        not5 = scanner.nextInt();

        // Calculate average as double for decimal precision
        double ortalama = (double) (not1 + not2 + not3 + not4 + not5) / 5;

        System.out.println("Girilen notların ortalaması: " + ortalama);

        // Use a ternary operator for concise pass/fail determination
        String durum = ortalama >= 50 ? "Geçti" : "Kaldı";
        System.out.println("Durum: " + durum);

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
