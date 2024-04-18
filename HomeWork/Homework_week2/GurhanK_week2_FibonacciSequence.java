import java.util.Scanner;

public class GurhanK_week2_FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yazdırmak istediğiniz Fibonacci sayisi adedini giriniz: ");
        int count = scanner.nextInt();


        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int prev1 = 0; // Önceki birinci Fibonacci sayısı
        int prev2 = 1; // Önceki ikinci Fibonacci sayısı
        int current = 0; // Şu anki Fibonacci sayısı

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2; // Şu anki Fibonacci sayısını hesaplar
            prev1 = prev2; // Önceki birinci Fibonacci sayısını günceller
            prev2 = current; // Önceki ikinci Fibonacci sayısını günceller
        }

        return current;
    }
}



