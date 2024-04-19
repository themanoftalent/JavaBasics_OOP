//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;
public class CihanAssigment7 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = Scanner.nextInt();
        int sum = 0;
        int number1 = 0;
        number1 = number;
        int digits = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;
            number /= 10;
        }System.out.println("Sum of digits in " + number1 + " is: " + sum);
    }
}
