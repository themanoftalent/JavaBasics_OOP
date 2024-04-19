import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment16 {

    // 0 ve pozitif sayılar için kuvvet methodu
    static int Pow(int x, int y){
        int out = 1;
        while (y > 0){
            y--;
            out *= x;
        }
        return out;
    }

    static boolean isArmstrong(int in){
        int digitCount = 0;
        int tmp = in;
        while (tmp > 0){
            tmp /= 10;
            digitCount++;
        }
        tmp = in;
        int sum = 0;
        while (tmp > 0){
            sum += Pow(tmp % 10, digitCount);
            tmp /= 10;
        }

        if (sum == in)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println(n + " Sayısı Armstrong sayısıdır");
        else{
            System.out.println(n + " Sayısı Armstrong sayısı değildir");
        }
    }
}
