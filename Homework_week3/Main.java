import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("enter your name");
        name = scanner.next();
        String surname;
        System.out.println("enter your surname");
        surname = scanner.next();
        if (name.equals("aziz") && surname.equals("diomande")) {
            System.out.println("your name and surname are correct");
        }
        else {
            System.out.println("Your name is incorrect!!!");
        }
    }
}
