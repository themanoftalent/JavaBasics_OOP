package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int sayi = sc.nextInt();

        if(sayi % 2 == 0) {
            System.out.println(sayi + " çifttir.");
        } else {
            System.out.println(sayi + " is tektir.");
        }
    }
}
