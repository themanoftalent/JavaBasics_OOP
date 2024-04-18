// Ahmet Talha Bodur 2311502242
// Determine if a number is an Armstrong number.

import java.util.*;

public class talhaAssignment16 {

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0, n = 0;


        originalNumber = number;


        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }


        originalNumber = number;


        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }


        if (result == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
