package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int sayi = sc.nextInt();

        if (isArmstrong(sayi)) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int toplam = 0;
        int basamakSayisi = 0;

        int temp = number;
        while (temp > 0) {
            temp = temp / 10;
            basamakSayisi++;
        }

        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int üs = 1;
            for (int j = 0; j < basamakSayisi; j++) {
                üs *= digit;
            }
            toplam += üs;
            temp = temp / 10;
        }

        return toplam == originalNumber;
    }
}
