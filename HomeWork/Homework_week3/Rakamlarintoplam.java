package Ödevler3.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class Rakamlarintoplam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int sayi = scanner.nextInt();
		int toplam = 0;
		int tutucu = 0;
		for (int i = 0; sayi != 0; i++) {
			tutucu = sayi % 10;
			sayi = (sayi - tutucu) / 10;
			toplam = toplam + tutucu;
		}
		System.out.println(toplam);
	}
}
