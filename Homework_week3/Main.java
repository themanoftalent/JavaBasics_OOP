import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        System.out.println("enter your name");
        name=scanner.next();
        String surname;
        System.out.println("enter your surname");
        surname=scanner.next();
        System.out.println("the name is "+ name + " the surname is "+ surname);

    }
}
