package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = sc.nextInt();

        System.out.println("Girilen sayının çarpım tablosu şu şekildedir : " + multiplicationTable(sayi));
    }

    public static int multiplicationTable (int number) {
        System.out.println(number + " " + " ÇARPIM TABLOSU ");
        for (int i = 1; i<=10; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
        }

        return number;
    }
}
