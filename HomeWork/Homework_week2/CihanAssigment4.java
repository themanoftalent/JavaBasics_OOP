//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;
public class CihanAssigment4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = Scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}