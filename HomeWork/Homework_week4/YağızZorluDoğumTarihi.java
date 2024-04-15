package Week5;

import java.util.Scanner;

public class YağızZorluDoğumTarihi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas = sc.nextInt();

        switch(yas) {
            case 0:
                System.out.println("Bu kişi yeni doğmuştur.");
                break;
            case 1: case 2: case 3: case 4: case 5: case 6:
                System.out.println("Bu kişi " + yas + " " + "yaşındadır");
                break;
            case 7: case 8: case 9: case 10:
                System.out.println("Bu kişi ilkokula gidiyordur.");
                break;
            case 11: case 12: case 13: case 14:
                System.out.println("Bu kişi ortaokula gidiyordur.");
                break;
            case 15: case 16: case 17: case 18:
                System.out.println("Bu kişi liselidir.");
                break;
            case 19: case 20: case 21: case 22:
                System.out.println("Bu kişi üniversitelidir.");
                break;
            default:
                System.out.println("Bu kişi öğretim hayatını bitirmiştir.");
        }
    }
                                                                              //Yağız Zorlu 2311502270
}
