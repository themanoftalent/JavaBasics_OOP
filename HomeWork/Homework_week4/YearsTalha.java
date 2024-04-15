import java.util.*;
public class YearsTalha {

    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        age = input.nextInt();

        switch (age){

            case 0:
                System.out.println("Newborn");
                break;

            case 2:
                System.out.println("Toddler");
                break;

            case 6:
                System.out.println("Started School!");
                break;

            case 10:
                System.out.println("Started Middle School!");
                break;

            case 18:
                System.out.println("Graduated High School!");
                break;

            case 40:
                System.out.println("You are 40!");
                break;

            default:
                System.out.println("Years are passing by!!");
                break;
        }
    }
}