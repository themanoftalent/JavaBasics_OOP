import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        String name;
        name = input.next();
        System.out.println("Please enter your surname");
        String surname;
        surname = input.next();
        System.out.println("Your name is " +name +". Your surname is "+surname);

    }

}