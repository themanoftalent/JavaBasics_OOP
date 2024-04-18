//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;

public class CihanAssigment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of terms: ");
        int number = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < number; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }
    }
}
