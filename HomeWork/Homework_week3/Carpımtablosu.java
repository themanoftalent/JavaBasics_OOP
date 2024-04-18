package Ödevler3.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class Carpımtablosu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi gir: ");
		int sayi = scanner.nextInt();
		int[][] dizi = new int[sayi][sayi];
		for (int i = 1; i != sayi + 1; i++) {
			for (int j = 1; j != sayi + 1; j++) {
				dizi[i - 1][j - 1] = i * j;
			}
		}
		for (int i = 1; i != sayi + 1; i++) {
			for (int j = 1; j != sayi + 1; j++) {
				System.out.println(dizi[i - 1][j - 1]);
			}

		}
	}
}
