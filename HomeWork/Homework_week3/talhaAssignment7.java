// Ahmet Talha Bodur
// Calculate the sum of digits in a positive integer.

import java.util.*;

public class talhaAssignment7 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        System.out.println("Enter your number:");
        number = input.nextInt();

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
