package hafta6;

import java.util.Scanner;

public class SumeyyeElginArmstrongNumber {
    public static void armstrongFinder(int number) {
        int sum = 0;
        int tempNumber = number; //sayımızı kaybetmemek için temp değişkeni oluşturduk
        int digit = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digit++; //basamak sayısını bulduk
        }

        tempNumber = number; //temp değişkenini güncelledik

        while (tempNumber > 0) { //burada armstrong sayı olma kuralını uyguladık
            int powResult = 1;
            int base = tempNumber % 10;
            for (int i = 1; i <= digit; i++) {
              powResult *= base;
            }
            sum += powResult;
            tempNumber /= 10;
        }

        if (number == sum) {
            System.out.println(number + " sayısı armstrong sayıdır");
        } else {
            System.out.println(number + " sayısı armstorng sayısı değildir");
        }
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.print("lütfen bir sayı giriniz: ");
        int number = scan.nextInt();

        armstrongFinder(number);
    }
}
