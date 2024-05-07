//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;
public class CihanAssigment12 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Number of elements in the array:");
        int n = Scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = Scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
