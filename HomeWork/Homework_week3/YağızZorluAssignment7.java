package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        System.out.println("Girilen sayının basamakları toplamı = " + SumOfDigits(sayi));
    }

    public static int SumOfDigits(int number) {
        int toplam = 0;

        while(number != 0) {
            toplam += number % 10;
            number = number / 10;
        }

        return toplam;
    }
}
