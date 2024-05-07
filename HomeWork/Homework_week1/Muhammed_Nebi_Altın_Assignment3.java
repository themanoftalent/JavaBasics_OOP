import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println(n + " is even");
        }
        else
            System.out.println(n + " is odd");
    }
}
