// Ahmet Talha Bodur 2311502242
// Calculate the factorial of a number using loops.

import java.util.*;

public class talhaAssignment4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int number;
        int factorial = 1;
        System.out.println("Enter your number :");
        number = input.nextInt();

        for (int i=1; i<=number; i++){
            factorial *= i;
        }

        System.out.println("Factorial of " +number+ " is: " +factorial);
    }
}