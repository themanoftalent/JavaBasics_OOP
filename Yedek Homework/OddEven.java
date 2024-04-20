import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " çift bir sayıdır.");
        } else {
            System.out.println(number + " tek bir sayıdır.");
        }

        scanner.close();
    }
}