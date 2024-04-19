package hafta3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumeyyeElginSumOfDigits {

    public static void sumOfDigits(int number) {
        if (number > 0) {
            int sum = 0;
            while (number >= 1) { //burada basamak kontrolu yapıyoruz, sayı 1'in altına düştüğünde sayının basamakları bitmiş demektir
                sum +=number % 10; //sayının 10 ile modu bize son basamağı verir
                number /= 10; //sayıyı 10'a bölmek bizi son basamaktan kurtarır
            }
            System.out.print("girdiğiniz sayının basamaklarının toplamı: " + sum);
        } else {
            System.out.println("lütfen !POZİTİF! bir değer giriniz");
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("pozitif bir sayı giriniz: ");
        int number = input.nextInt();

        sumOfDigits(number);
    }
}
