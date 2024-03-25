import java.util.Scanner;
public class Sayılar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = input.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
}