//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;

public class CihanAssigment9 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = Scanner.nextInt();
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.println("Not Prime Number");
            }else{
                System.out.println("Prime Number");
            }
        }
    }
}