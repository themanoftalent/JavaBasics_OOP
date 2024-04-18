//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;
public class CihanAssigment8 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = Scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}