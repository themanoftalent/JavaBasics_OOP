package Ödevler3.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class Asalsayıbulma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		int kontrol = 0;

		for (int i = 2; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				kontrol = 1;
				break;
			}
		}

		if (kontrol == 0) {
			System.out.println(sayi + " bir asal sayıdır.");
		} else {
			System.out.println(sayi + " bir asal sayı değildir.");
		}
	}
}
