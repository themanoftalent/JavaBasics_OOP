import java.util.Scanner;
public class Sayılar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the n: ");
            n = input.nextInt();
        }
        while (n < 100);
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
