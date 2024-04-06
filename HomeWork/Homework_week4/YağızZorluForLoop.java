package Week5;

import java.util.Scanner;

public class YağızZorluForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("100'den büyük bir sayı giriniz:");
        int sayi = sc.nextInt();

        if(sayi <= 100) {
            System.out.println("Hatalı giriş");
        } else {
            for(int i = sayi; i >= 0; i--) {
                System.out.println(i);
            }
        }


    }
}
