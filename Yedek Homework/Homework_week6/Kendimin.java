//2311502229 Ali Eren HAKUT
import java.util.Scanner;


public class Kendimin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        aliMy object = new aliMy();

       
        System.out.print("Your name: ");
        object.name = scanner.nextLine();

        System.out.print("Your surname: ");
        object.surname = scanner.nextLine();

        System.out.print("Your age: ");
        object.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Your department: ");
        object.department = scanner.nextLine();

        System.out.print("Your hair color: ");
        object.hairColor = scanner.nextLine();

        System.out.print("Have mustache (true/false): ");
        object.mustache = scanner.nextBoolean();

        System.out.print("Have beard (true/false): ");
        object.beard = scanner.nextBoolean();

        System.out.print("Your height: ");
        object.height = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Your weight: ");
        object.weight = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Your hobby: ");
        object.hobby = scanner.nextLine();

        scanner.close();

        
        System.out.println("Your name: " + object.name);
        System.out.println("Your surname: " + object.surname);
        System.out.println("Your age: " + object.age);
        System.out.println("Your department: " + object.department);
        System.out.println("Your hair color: " + object.hairColor);
        System.out.println("Have mustache: " + object.mustache);
        System.out.println("Have beard: " + object.beard);
        System.out.println("Your height: " + object.height);
        System.out.println("Your weight: " + object.weight);
        System.out.println("Your hobby: " + object.hobby);
    }
}

class aliMy {
    String name;
    String surname;
    int age;
    String department;
    String hairColor;
    boolean mustache;
    boolean beard;
    double height;
    double weight;
    String hobby;
}
