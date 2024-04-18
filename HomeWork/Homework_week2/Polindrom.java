package Ödevler2.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class Polindrom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		int asilsayi = sayi;
		int tutucu = 0;
		for (int i = 1; sayi != 0; i++) {
			int sayiyedek = sayi % 10;
			tutucu = tutucu * 10 + sayiyedek;
			sayi = sayi / 10;
		}
		System.out.println(tutucu);
		if (tutucu == asilsayi) {
			System.out.println("Polindrom sayıdır. ");
		} else {
			System.out.println("Polindrom sayı değildir. ");
		}
		scanner.close();
	}
}
