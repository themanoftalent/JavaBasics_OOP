package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz: ");
        int sayi = sc.nextInt();

        long factorial = FaktöriyelHesapla(sayi);
        System.out.println("Sayının faktöriyeli : " + factorial);
    }

    public static long FaktöriyelHesapla(int number) {
        if(number < 0) {
            System.out.println("Hatalı");
        }

        if(number == 0) {
            return 1;
        }

        long factorial = 1;
        for(int i = 2; i<=number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
