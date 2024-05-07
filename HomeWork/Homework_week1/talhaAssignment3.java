//Ahmet Talha Bodur 2311502242
// Determine whether a number entered by the user is even or odd.

import java.util.*;

public class talhaAssignment3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int number;
        System.out.println("Enter your number:");
        number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("Your number is even!");
        else
            System.out.println("Your number is odd!");
    }
}