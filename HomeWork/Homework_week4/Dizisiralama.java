package Ödevler4.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class Dizisiralama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dizi uzunluğunu giriniz: ");
		int sayi = scanner.nextInt();
		int[] dizi = new int[sayi];

		for (int i = 0; i < sayi; i++) {
			System.out.println((i + 1) + ". sayiyi giriniz: ");
			int sayi1 = scanner.nextInt();
			dizi[i] = sayi1;

			for (int j = i; j > 0; j--) {
				if (dizi[j] < dizi[j - 1]) {
					int temp = dizi[j];
					dizi[j] = dizi[j - 1];
					dizi[j - 1] = temp;
				} else {
					break;
				}
			}
		}

		System.out.println("Sıralı dizi: ");
		for (int num : dizi) {
			System.out.println(num + " ");
		}

		scanner.close();

	}
}
