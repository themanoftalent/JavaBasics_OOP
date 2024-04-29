package PACKAGE_NAME;

import java.util.Scanner;
/*BURCİNKUTLUSAN*/
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("1.sayiyi giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi giriniz:");
        int sayi2 = input.nextInt() ;
        System.out.println("Bir islem seçiniz;\n1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme ");
        byte islem = input.nextByte();

        switch (islem) {
            case 1:
                System.out.println("Toplam : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Fark : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Carpim : " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bolum: " + (sayi1 / sayi2));
                break;
        }
    }
}
