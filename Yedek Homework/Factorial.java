import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyeli hesaplanacak sayıyı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = calculateFactorial(number);
        System.out.println(number + " sayısının faktöriyeli: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Negatif sayıların faktöriyeli tanımsızdır.
        } else if (n == 0 || n == 1) {
            return 1; // 0 ve 1'in faktöriyeli 1'dir.
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}