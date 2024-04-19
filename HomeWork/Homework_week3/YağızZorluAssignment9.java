package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = sc.nextInt();

        if(isPrime(sayi)) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }

    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        for(int i = 2; i<number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
