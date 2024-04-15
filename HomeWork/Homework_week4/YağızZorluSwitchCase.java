package Week5;

import java.util.Scanner;

public class YağızZorluSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci notu giriniz");
        int not1 = sc.nextInt();
        System.out.println("İkinci notu giriniz");
        int not2 = sc.nextInt();
        System.out.println("Üçüncü notu giriniz");
        int not3 = sc.nextInt();
        System.out.println("Dördüncü notu giriniz");
        int not4 = sc.nextInt();
        System.out.println("Beşinci notu giriniz");
        int not5 = sc.nextInt();

        int ortalama = (not1 + not2 + not3 + not4 + not5) / 5;

        ortalama /= 50;

        switch(ortalama) {
            case 0:
                System.out.println("Dersten kaldınız");
                break;
            default:
                System.out.println("Dersi geçtiniz");
                break;

        }
    }
                                                                                //Yağız Zorlu 2311502270
}
