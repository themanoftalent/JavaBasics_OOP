// Arda Göktaş 2311502241
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int age;
        System.out.println("Please Enter your age: ");
        age = input.nextInt();
        switch (age){
            case 0:
                System.out.println("You are just borned:)");
                break;
            case 1:
                System.out.println("You learnt how to walk");
                break;
            case 2:
                System.out.println("You learnt how to speak");
                break;
            case 3:
                System.out.println("You started to go kindergarten");
                break;
            case 4:
                System.out.println("You are growing up fast");
                break;
            case 5:
                System.out.println("You will start elementary school next year:)");
                break;
            default:
                System.out.println("You are getting old:)");
                break;
        }
    }
}