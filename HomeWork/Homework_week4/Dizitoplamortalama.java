package Ödevler4.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class Dizitoplamortalama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dizi uzunluğunu gir: ");
		int dizisayi = scanner.nextInt();
		int[] dizi = new int[dizisayi];
		int toplam = 0;

		for (int i = 0; i < dizisayi; i++) {
			int sayi = scanner.nextInt();
			System.out.println((i + 1) + ". sayiyi gir: " + sayi);
			dizi[i] = sayi;
			toplam = sayi + toplam;
		}

		float ort = (float) toplam / dizisayi;
		System.out.println("Toplamı: " + toplam);
		System.out.println("Ortalama: " + ort);

		scanner.close();

	}
}
