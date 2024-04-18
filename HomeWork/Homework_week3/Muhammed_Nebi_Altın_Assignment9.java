import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment9 {

    private static boolean isPrime(int n) {
        int i = 2;

        if (n == 1) return false;

        while (i <= n / 2){
            if (n % i == 0){
                return false;
            }

            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Asal kontrolü için bir sayı giriniz");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println(n + " Bir asal sayıdır");
        else
            System.out.println(n + " Bir asal sayı değildir");
    }


}
