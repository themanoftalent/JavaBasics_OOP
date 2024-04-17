import java.util.Scanner;

public class EmreYilmazHomework4FactorialCalculator {
    public static void main(String[] args) {
        int faktoriyel = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz: ");
        int number = sc.nextInt();

        if(number >= 0) {
            for (int i = 1; i <= number; i++) {
                faktoriyel = faktoriyel * i;
                System.out.println(faktoriyel);
            }
        }
        else System.out.println("Hatalı sayı girdiniz.");
    }
}
