import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String name = "Arda";
        String surname = "Goktas";
        String userName, userSurname;
        System.out.println("Please Enter your name: ");
        userName = input.next();
        System.out.println("Please enter your surname: ");
        userSurname = input.next();
        if(name.equals(userName) &&(surname.equals(userSurname))){
            System.out.println("You entered your name and surname correctly");
        }
        else{
            System.out.println("Incorrect name or surname!!");
        }

    }
}