// Mehmet akif cifci

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int birthYear = input.nextInt();
        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println("Your age is: " + age);

        switch (age) {
            case 0:
                System.out.println("You were just born!");
                break;
            case 1:
                System.out.println("You are a one-year-old.");
                break;
            case 2:
                System.out.println("You are a toddler.");
                break;
            case 3:
                System.out.println("You are a child.");
                break;
            case 4:
                System.out.println("You are a preteen.");
                break;
            case 5:
                System.out.println("You are a teenager.");
                // case 5,6,7,8,9,10,11,12,13,14,15,16,17:
                break;
            default:
                System.out.println("You are an adult.");
                break;
        }

        input.close();
    }
}
