import java.util.Scanner;


public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please enter your name:");
        String name=input.next();
        System.out.println("please enter your surname");
        String surname=input.next();

        System.out.println("your name is:"+name+"your surname is :"+surname);


    }

}