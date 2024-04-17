// Arda Göktaş 2311502241
import java.util.*;
public class AgesArda{

    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        age = input.nextInt();

        switch (age){

            case 0:
                System.out.println("You just borned!");
                break;

            case 2:
                System.out.println("You learnt how to walk");
                break;

            case 7:
                System.out.println("You started elementary school!");
                break;

            case 12:
                System.out.println("You are a teenager now!");
                break;

            case 19:
                System.out.println("You can start studying University!");
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