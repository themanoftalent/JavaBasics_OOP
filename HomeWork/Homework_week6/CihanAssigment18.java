//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;

public class CihanAssigment18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int numerator = scanner.nextInt();
        System.out.println("Enter the denominator:");
        int denominator = scanner.nextInt();
        try {
            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
