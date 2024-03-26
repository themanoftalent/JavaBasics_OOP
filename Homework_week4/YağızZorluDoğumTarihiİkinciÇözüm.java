package Week5;

import java.util.Scanner;

public class YağızZorluDoğumTarihiİkinciÇözüm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        int dogumYili = sc.nextInt();
        int guncelYil = 2024;
        int yas = guncelYil - dogumYili;

        System.out.println("Yaşınız: " + yas);

        switch(yas) {
            case 0:
                System.out.println("Yeni doğdu");
                break;
            case 1:
                System.out.println("Bir yaşındadır.");
                break;
            case 5:
                System.out.println("Beş yaşındadır.");
                break;
            case 7:
                System.out.println("Okula başladı.");
                break;
            case 15:
                System.out.println("Liseye başladı");
                break;
            case 19:
                System.out.println("Üniversiteye başladı");
                break;
            case 22:
                System.out.println("Eğitim hayatı bitti");
                break;
        }
    }

                                                                           //Yağız Zorlu 2311502270
}
