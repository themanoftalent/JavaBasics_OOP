import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,sum,extraction,division,multiplication,remainder;
        System.out.println("Enter the first number");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b= input.nextInt();
        sum = a+b;
        System.out.println("Sum of a and b " +sum);

        extraction = a-b;
        System.out.println("Extraction of a and b " +extraction);

        division = a/b;
        System.out.println("Division of a and b " +division);

        multiplication = a*b;
        System.out.println("Multiply of a and b " +multiplication);

        remainder = a%b;
        System.out.println("Remainder of a and b " +remainder);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}