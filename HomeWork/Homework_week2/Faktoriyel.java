package Ödevler2.hafta;

import java.util.Scanner;
//2311502229 Ali Eren Hakut
public class Faktoriyel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		int fakt = 1;
		for (int i = 1; i != sayi+1; i++) {
			fakt = i * fakt;
			System.out.println(+i + ". faktoriyeli: " + fakt);

		}
		System.out.println("Sayının faktoriyeli: " + fakt);
        scanner.close();
	}
}
