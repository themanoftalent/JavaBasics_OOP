package Ödevler1.hafta;

import java.util.Scanner;
//2311502229 Ali Eren Hakut
public class çiftveyatek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz: ");
		int sayi = scanner.nextInt();

		if (sayi % 2 == 0) {
			System.out.println("Çift sayıdır. ");
		} else {
			System.out.println("Tek sayıdır. ");

		}
		scanner.close();
	}
}
