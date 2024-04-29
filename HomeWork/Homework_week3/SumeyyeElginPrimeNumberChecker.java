package hafta3;

import java.util.Scanner;

public class SumeyyeElginPrimeNumberChecker {
    //girilen sayı asal mı bileşik mi? kontrol et

    public static void primeNumber(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++; //burada bölenlerin kaç tane olduğunu hesaplıyoruz
            }
        }

        if (counter <= 2) {  //Bir asal sayının çarpanları, 1 ve sayının kendisidir.
            System.out.println(num + " sayısı asal bir sayıdır.");
        } else { //Bir bileşik sayının, 1 ve sayının kendisi dışında da çarpanları vardır.
            System.out.println(num + " sayısı bileşik bir sayıdır.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        int num = scan.nextInt();

        primeNumber(num);

    }
}
