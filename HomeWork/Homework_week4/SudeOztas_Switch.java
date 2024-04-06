import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int birth_year=s.nextInt();
        int age=2024-birth_year;

        switch(age){
            case 0:
                System.out.println("You are a new born.");
                break;
            case 1:
                System.out.println("You are 1 years old.");
                break;
            case 5:
                System.out.println("You are 5 years old.");
                break;
            case 10:
                System.out.println("You started school.");
                break;
            case 15:
                System.out.println("You are a high school student.");
                break;
            case 20:
                System.out.println("You are a college student.");
                break;
            default:
                System.out.println("Now, you are a old man.");
                break;
        }
    }
}
