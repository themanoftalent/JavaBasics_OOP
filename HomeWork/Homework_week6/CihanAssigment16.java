//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;

public class CihanAssigment16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
