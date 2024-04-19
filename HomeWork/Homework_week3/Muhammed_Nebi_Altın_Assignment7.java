import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment7 {

    static int sumOfDigits(int in){
        int out = 0;
        while (in > 0){
            out += in % 10;
            in /= 10;
        }

        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");
        int n = sc.nextInt();
        System.out.println(n + " Sayısının rakamları toplamı: " + sumOfDigits(n));
    }
}
