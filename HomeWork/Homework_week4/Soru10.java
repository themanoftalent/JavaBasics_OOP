import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		// Reverse a string without using built-in functions.
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ters çevrilecek yazıyı giriniz: ");
		String duz = scanner.nextLine();

		String ters = reverseString(duz);

		System.out.println("Ters çevrilmiş yazı: " + ters);

		scanner.close();
	}

	public static String reverseString(String str) {
		char[] dizi = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			char temp = dizi[start];
			dizi[start] = dizi[end];
			dizi[end] = temp;
			start++;
			end--;
		}
		return new String(dizi);
	}

}
