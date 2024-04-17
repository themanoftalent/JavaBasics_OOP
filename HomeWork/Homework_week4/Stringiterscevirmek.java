package Ödevler4.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class Stringiterscevirmek {
	public static void main(String[] args) {
		Scanner mesaj = new Scanner(System.in);
		String duz = mesaj.nextLine();
		int uzunluk = duz.length();
		String ters = "";

		for (int i = uzunluk - 1; i >= 0; i--) {
			ters += duz.charAt(i);

		}

		for (int i = 0; i < uzunluk; i++) {
			System.out.println(ters.charAt(i));

		}
		mesaj.close();
	}
}
