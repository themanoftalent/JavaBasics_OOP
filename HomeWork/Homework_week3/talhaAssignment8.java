// Ahmet Talha Bodur 2311502242
// Display the multiplication table of a number.

import java.util.*;
public class talhaAssignment8 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        System.out.println("Enter your number:");
        number = input.nextInt();
        int tableSize=10;

        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= tableSize; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
