package soru02;

import java.util.Scanner;

    class gerisayma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz (minimum 100): ");
        int sayi = scanner.nextInt();
        
        if (sayi < 100) {
            System.out.println("Girdiğiniz sayı 100'den küçük. Lütfen 100 veya daha büyük bir sayı giriniz.");
            return;
        }
        
        for (int i = sayi; i >= 0; i--) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}

    //Emiralp Yakalı 2311502251