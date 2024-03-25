import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double not1,not2,not3,not4,not5, gpa;
        System.out.println("Enter your first note: ");
        not1 = input.nextDouble();
        System.out.println("Enter your second note: ");
        not2 = input.nextDouble();
        System.out.println("Enter your third note: ");
        not3 = input.nextDouble();
        System.out.println("Enter your fourth note: ");
        not4 = input.nextDouble();
        System.out.println("Enter your fifth note: ");
        not5 = input.nextDouble();
        gpa = (not1 + not2 + not3 + not4 + not5)/5;
        int pass = 2;
        if (gpa >50){
            pass = 1;
        }

        switch (pass){
            case 1:
                System.out.println("You passed:)");
                break;
            case 2:
                System.out.println("You Failed!!");
                break;

        }
    }
}