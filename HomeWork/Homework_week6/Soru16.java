import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
    	//Determine if a number is an Armstrong number.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isArmstrong(sayi)) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int toplam = 0;
        int orjinalSayi = num;
        int basamakSayisi = String.valueOf(num).length();

        while (num > 0) {
            int basamak = num % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            num /= 10;
        }

        return toplam == orjinalSayi;
    }
}
