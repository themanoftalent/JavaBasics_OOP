import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please Enter your name: ");
        String name = input.next();
        System.out.println("Please enter your surname");
        String surname = input.next();

        System.out.println("Your name is:" + name +" "+ surname);

    }
}