import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment4 {

    static int factorial(int in){

        int f = 1;
        while (in > 1){
            f *= in;
            in--;
        }

        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Faktoriyeli alınacak sayı giriniz");
        int n = sc.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }
}
