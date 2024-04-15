package Week5;

import java.util.Scanner;

public class YağızZorluAylarVeMevsimler {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir ay giriniz:");
        String ay = sc.nextLine();

        switch(ay) {
            case ("Ocak"):
                System.out.println("Birinci ay ve kış mevsiminde");
                break;
            case ("Şubat"):
                System.out.println("İkinci ay ve kış mevsiminde");
                break;
            case ("Mart"):
                System.out.println("Üçüncü ay ve ilkbahar mevsiminde");
                break;
            case ("Nisan"):
                System.out.println("Dördüncü ay ve ilkbahar mevsiminde");
                break;
            case ("Mayıs"):
                System.out.println("Beşinci ay ve ilkbahar mevsiminde");
                break;
            case ("Haziran"):
                System.out.println("Altıncı ay ve yaz mevsiminde");
                break;
            case ("Temmuz"):
                System.out.println("Yedinci ay ve yaz mevsiminde");
                break;
            case ("Ağustos"):
                System.out.println("Sekizinci ay ve yaz mevsiminde");
                break;
            case ("Eylül"):
                System.out.println("Dokuzuncu ay ve sonbahar mevsiminde");
                break;
            case ("Ekim"):
                System.out.println("Onuncu ay ve sonbahar mevsiminde");
                break;
            case ("Kasım"):
                System.out.println("On birinci ay ve sonbahar mevsiminde");
                break;
            case ("Aralık"):
                System.out.println("On ikinci ay ve kış mevsiminde");
                break;
            default:
                System.out.println("Hatalı giriş");
                break;
        }
    }
                                                                       //Yağız Zorlu 2311502270
}
