package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dizi boyutunu giriniz : ");
        int boyut = sc.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Sayıları giriniz : ");
        for(int i = 0; i < boyut; i ++) {
            dizi[i] = sc.nextInt();
        }

        int toplam = 0;
        for(int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        float ortalama = (float) toplam/dizi.length;

        System.out.println("Toplam : " + toplam );
        System.out.println("Ortalama : " + ortalama);
    }
}
