package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        try {
            int sonuc = 100 / sayi;
            System.out.println("Sonuç: " + sonuc);

        } catch (ArithmeticException e) {
            System.out.println("Sıfıra bölme hatası oluştu. Lütfen sıfır dışı bir sayı girin.");
        }

    }
}

