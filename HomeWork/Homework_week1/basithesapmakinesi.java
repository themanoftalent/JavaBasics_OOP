package Ödevler1.hafta;

import java.util.Scanner;
//2311502229 Ali Eren Hakut
public class basithesapmakinesi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Toplama için-> 1");
		System.out.println("Çıkartma için-> 2");
		System.out.println("Bolme için-> 3");
		System.out.println("çarpma için-> 4");
		System.out.println("Çıkış için-> 5");

		int secim = scanner.nextInt();

		if (secim == 5) {
			System.out.println("Hesap Makinesi kapanıyor");
			return;
		}

		System.out.println("1.Sayı giriniz: ");
		double sayi1 = scanner.nextDouble();
		System.out.println("2. sayı giriniz: ");
		double sayi2 = scanner.nextDouble();
		switch (secim) {
		case 1:
			System.out.println("Sayıların toplamı: " + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Sayıların cıkartması: " + (sayi1 - sayi2));
			break;
		case 3:
			if (sayi2 != 0) {
				System.out.println("Sayıların bölümü: " + (sayi1 / sayi2));
			} else {
				System.out.println("Sayı sıfıra bölünemez.");
			}
			break;
		case 4:
			System.out.println("Sayıların çarpımı: " + (sayi1 * sayi2));
			break;
		default:
			System.out.println("Geçersiz işlem");
		}
		scanner.close();
	}
}
