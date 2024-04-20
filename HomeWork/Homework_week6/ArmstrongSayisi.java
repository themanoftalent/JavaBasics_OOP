package Ödevler6.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class Armstrongsayisi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		int asilsayi = sayi;
		int uzunluk = 0;
		int toplam = 0;
		int temp = sayi;
		while (temp != 0) {
			uzunluk++;
			temp /= 10;
		}
		sayi = asilsayi;
		while (sayi != 0) {
			int basamak = sayi % 10;
			int carpim = 1;

			for (int i = 0; i < uzunluk; i++) {
				carpim *= basamak;
			}
			toplam += carpim;
			sayi = sayi / 10;
		}
		if (toplam == asilsayi) {
			System.out.println(asilsayi + " Armstrong sayısıdır.");
		} else {
			System.out.println(asilsayi + " Armstrong sayısı değildir.");
		}
	}
}
